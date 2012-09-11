package org.ei.drishti.service;

import org.ei.drishti.contract.ChildCloseRequest;
import org.ei.drishti.contract.ChildImmunizationUpdationRequest;
import org.ei.drishti.contract.ChildRegistrationRequest;
import org.ei.drishti.domain.Child;
import org.ei.drishti.repository.AllChildren;
import org.ei.drishti.service.reporting.ChildReportingService;
import org.ei.drishti.util.SafeMap;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.Mock;
import org.motechproject.testing.utils.BaseUnitTest;
import org.motechproject.util.DateUtil;

import java.util.Arrays;

import static org.ei.drishti.dto.BeneficiaryType.child;
import static org.ei.drishti.dto.AlertPriority.normal;
import static org.ei.drishti.util.Matcher.objectWithSameFieldsAs;
import static org.mockito.Mockito.*;
import static org.mockito.MockitoAnnotations.initMocks;

public class PNCServiceTest extends BaseUnitTest {
    @Mock
    ActionService actionService;
    @Mock
    private PNCSchedulesService pncSchedulesService;
    @Mock
    private AllChildren allChildren;
    @Mock
    private ChildReportingService reportingService;

    private PNCService pncService;

    @Before
    public void setUp() throws Exception {
        initMocks(this);
        pncService = new PNCService(actionService, pncSchedulesService, reportingService, allChildren);
    }

    @Test
    public void shouldAddAlertsForVaccinationsForChildren() {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);

        pncService.registerChild(new ChildRegistrationRequest("Case X", "Child 1", "bherya", "Sub Center", "PHC X", "TC 1", currentTime.toDate(), "DEMO ANM", "", "male"));

        verify(actionService).alertForBeneficiary(child, "Case X", "OPV 0", normal, currentTime.plusDays(2), currentTime.plusDays(2).plusWeeks(1));
        verify(actionService).alertForBeneficiary(child, "Case X", "BCG", normal, currentTime.plusDays(2), currentTime.plusDays(2).plusWeeks(1));
        verify(actionService).alertForBeneficiary(child, "Case X", "HEP B0", normal, currentTime.plusDays(2), currentTime.plusDays(2).plusWeeks(1));
    }

    @Test
    public void shouldEnrollChildIntoSchedulesDuringRegistration() {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);

        ChildRegistrationRequest request = new ChildRegistrationRequest("Case X", "Child 1", "bherya", "Sub Center", "PHC X", "TC 1", currentTime.toDate(), "DEMO ANM", "", "male");
        pncService.registerChild(request);

        verify(pncSchedulesService).enrollChild(request);
    }

    @Test
    public void shouldSaveChildIntoRepositoryDuringRegistration() {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);

        pncService.registerChild(new ChildRegistrationRequest("Case X", "Child 1", "bherya", "Sub Center", "PHC X", "TC 1", currentTime.toDate(), "DEMO ANM", "bcg hep", "female"));

        verify(allChildren).register(objectWithSameFieldsAs(new Child("Case X", "TC 1", "Child 1", Arrays.asList("bcg", "hep"), "female").withAnm("DEMO ANM").withLocation("bherya", "Sub Center", "PHC X")));
    }

    @Test
    public void shouldAddAlertsOnlyForMissingVaccinations() {
        assertMissingAlertsAdded("", "BCG", "OPV 0", "HEP B0");
        assertMissingAlertsAdded("bcg", "OPV 0", "HEP B0");
        assertMissingAlertsAdded("bcg opv0", "HEP B0");
        assertMissingAlertsAdded("bcg opv0 hepB0");

        assertMissingAlertsAdded("opv0 bcg hepB0");
        assertMissingAlertsAdded("opv0 bcg", "HEP B0");
        assertMissingAlertsAdded("opv0 bcg1", "BCG", "HEP B0");
    }

    @Test
    public void shouldRemoveAlertsForUpdatedImmunizations() throws Exception {
        assertCloseOfAlertsForProvidedImmunizations("bcg opv0", "BCG", "OPV 0");
    }

    @Test
    public void shouldUpdateEnrollmentsForUpdatedImmunizations() {
        ChildImmunizationUpdationRequest request = new ChildImmunizationUpdationRequest("Case X", "DEMO ANM", "bcg opv0", "2012-01-01");

        pncService.updateChildImmunization(request, new SafeMap());

        verify(pncSchedulesService).updateEnrollments(request);
    }

    @Test
    public void shouldSendDataForReportingBeforeUpdatingChildInDBSoThatUpdatedImmunizationsAreDecided() throws Exception {
        ChildImmunizationUpdationRequest request = new ChildImmunizationUpdationRequest("Case X", "DEMO ANM", "bcg opv0", "2012-01-01");

        pncService.updateChildImmunization(request, new SafeMap());

        InOrder inOrder = inOrder(reportingService, pncSchedulesService);
        inOrder.verify(reportingService).updateChildImmunization(eq(request), any(SafeMap.class));
        inOrder.verify(pncSchedulesService).updateEnrollments(request);
    }

    @Test
    public void shouldDeleteAllAlertsForChildCaseClose() {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);

        ActionService alertServiceMock = mock(ActionService.class);
        PNCService pncService = new PNCService(alertServiceMock, mock(PNCSchedulesService.class), reportingService, allChildren);

        pncService.closeChildCase(new ChildCloseRequest("Case X", "DEMO ANM"));

        verify(alertServiceMock).deleteAllAlertsForChild("Case X", "DEMO ANM");
    }

    @Test
    public void shouldUnenrollChildWhoseCaseHasBeenClosed() {
        pncService.closeChildCase(new ChildCloseRequest("Case X", "ANM Y"));

        verify(pncSchedulesService).unenrollChild("Case X");
    }

    private void assertCloseOfAlertsForProvidedImmunizations(String providedImmunizations, String... expectedDeletedAlertsRaised) {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);

        ActionService actionService = mock(ActionService.class);
        PNCService pncService = new PNCService(actionService, mock(PNCSchedulesService.class), reportingService, allChildren);

        pncService.updateChildImmunization(new ChildImmunizationUpdationRequest("Case X", "DEMO ANM", providedImmunizations, "2012-01-01"), new SafeMap());

        for (String expectedAlert : expectedDeletedAlertsRaised) {
            verify(actionService).markAlertAsClosedForVisitForChild("Case X", "DEMO ANM", expectedAlert, "2012-01-01");
        }
        verifyNoMoreInteractions(actionService);
    }

    private void assertMissingAlertsAdded(String providedImmunizations, String... expectedAlertsRaised) {
        DateTime currentTime = DateUtil.now();
        mockCurrentDate(currentTime);
        ActionService actionService = mock(ActionService.class);
        PNCService pncService = new PNCService(actionService, mock(PNCSchedulesService.class), reportingService, allChildren);

        pncService.registerChild(new ChildRegistrationRequest("Case X", "Child 1", "bherya", "Sub Center", "PHC X", "TC 1", currentTime.toDate(), "DEMO ANM", providedImmunizations, "female"));

        for (String expectedAlert : expectedAlertsRaised) {
            verify(actionService).alertForBeneficiary(child, "Case X", expectedAlert, normal, currentTime.plusDays(2), currentTime.plusDays(2).plusWeeks(1));
        }
        verify(actionService, times(1)).registerChildBirth(any(String.class), any(String.class), any(String.class), any(LocalDate.class), any(String.class));
        verifyNoMoreInteractions(actionService);
    }
}
