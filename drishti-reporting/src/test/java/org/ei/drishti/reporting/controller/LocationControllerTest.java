package org.ei.drishti.reporting.controller;

import org.ei.drishti.dto.ANMVillagesDTO;
import org.ei.drishti.dto.VillagesDTOTest;
import org.ei.drishti.reporting.domain.ANMVillages;
import org.ei.drishti.reporting.domain.Location;
import org.ei.drishti.reporting.domain.PHC;
import org.ei.drishti.reporting.service.ANMService;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.http.ResponseEntity;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;

public class LocationControllerTest {
	 @Mock
	    private ANMService anmService;
	    @Mock
	    private Location location;
	    
	    @Mock   
	    private ANMVillages anmLocation;
	    @Mock
	    private PHC phc;
	    private LocationController controller;

	    @Before
	    public void setUp() throws Exception {
	        initMocks(this);
	        controller = new LocationController(anmService);
	    }

    @Test
    public void shouldReturnListOfVillagesForANM() throws Exception {
        when(anmService.getVillagesForANM("demo1")).thenReturn(
                asList(
                        new Location("village1", "sc", phc, "taluk", "District", "state"),
                        new Location("village2", "sc", phc, "taluk", "District", "state")
                ));

        when(anmService.getLocation("demo1")).thenReturn(location);
        when(location.phc()).thenReturn(phc);
        when(location.subCenter()).thenReturn("sc");
        when(phc.phcIdentifier()).thenReturn("phc1");
        when(phc.name()).thenReturn("PHC X");
        when(location.phcName()).thenReturn("PHC X");

        ResponseEntity<VillagesDTOTest> response = controller.villagesForANM("demo1");

        VillagesDTOTest villagesDTO = new VillagesDTOTest("district", "PHC X", "phc1", "sc", asList("village1", "village2"));
        assertEquals(villagesDTO, response.getBody());
    }
    
    @Test
    public void anmVillagestest() throws Exception {
     when(anmService.getANMVillages("anm123")).thenReturn(
              asList(
                  
                      new ANMVillages("village1", "sc","phc","asd","sfs",123,2323,32423,21213,2323,2323),
                      new ANMVillages("village2", "sc32","phc","asd","sfs",123,2323,32423,21213,2323,2323)
                    
              ));   
          when(anmService.getANMLocation("anm123")).thenReturn(anmLocation);
       when(anmLocation.user_id()).thenReturn("phc");
       when(anmLocation.user_role()).thenReturn("sc");
       when(anmLocation.villages()).thenReturn("village1");

       ResponseEntity<ANMVillagesDTO> response1;
               response1= controller.anmVillages("anm123");

       ANMVillagesDTO anmvillagesDT = new ANMVillagesDTO("phc","sc","village1");
       assertEquals(anmvillagesDT, response1.getBody());
       
   }
}
