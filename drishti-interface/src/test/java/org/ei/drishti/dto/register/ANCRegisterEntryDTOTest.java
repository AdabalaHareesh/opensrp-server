package org.ei.drishti.dto.register;

import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ANCRegisterEntryDTOTest {
	
	private ANCRegisterEntryDTO ancRegisterEntryDTO;
	
	@Before
	public void setUp(){
		ancRegisterEntryDTO = new ANCRegisterEntryDTO();
	}
	
	@Test
	public void withANCNumberTest(){
		ancRegisterEntryDTO.withANCNumber("ancNumber");		
	}
	
	@Test
	public void withRegistrationDateTest(){
		ancRegisterEntryDTO.withRegistrationDate("registrationDate");	
	}
	
	@Test
	public void withECNumberTest(){
		ancRegisterEntryDTO.withECNumber("ecNumber");	
	}
	
	@Test
	public void withThayiCardNumberTest(){
		ancRegisterEntryDTO.withThayiCardNumber("thayiCardNumber");	
	}
	
	@Test
	public void withAadharCardNumberTest(){
		ancRegisterEntryDTO.withAadharCardNumber("aadharCardNumber");
	}
	
	@Test
	public void withWifeNameTest(){
		ancRegisterEntryDTO.withWifeName("wifeName");
	}
	
	@Test
	public void withHusbandNameTest(){
		ancRegisterEntryDTO.withHusbandName("husbandName");
	}
	
	@Test
	public void withAddressTest(){
		ancRegisterEntryDTO.withAddress("address");
	}
	
	@Test
	public void withWifeDOBTest(){
		ancRegisterEntryDTO.withWifeDOB("wifeDOB");
	}
	
	@Test
	public void withPhoneNumberTest(){
		ancRegisterEntryDTO.withPhoneNumber("phoneNumber");
	}
	
	@Test
	public void withWifeEducationLevelTest(){
		ancRegisterEntryDTO.withWifeEducationLevel("wifeEducationLevel");
	}
	
	@Test
	public void withHusbandEducationLevelTest(){
		ancRegisterEntryDTO.withHusbandEducationLevel("husbandEducationLevel");
	}
	
	@Test
	public void withCasteTest(){
		ancRegisterEntryDTO.withCaste("caste");
	}
	
	@Test
	public void withReligionTest(){
		ancRegisterEntryDTO.withReligion("religion");
	}
	
	@Test
	public void withEconomicStatusTest(){
		ancRegisterEntryDTO.withEconomicStatus("economicStatus");
	}
	
	@Test
	public void withBPLCardNumberTest(){
		ancRegisterEntryDTO.withBPLCardNumber("bplCardNumber");
	}
	
	@Test
	public void withJSYBeneficiaryTest(){
		ancRegisterEntryDTO.withJSYBeneficiary("jsyBeneficiary");
	}
	
	@Test
	public void withGravidaTest(){
		ancRegisterEntryDTO.withGravida("gravida");
	}
	
	@Test
	public void withParityTest(){
		ancRegisterEntryDTO.withParity("parity");
	}
	
	@Test
	public void withNumberOfLivingChildrenTest(){
		ancRegisterEntryDTO.withNumberOfLivingChildren("numberOfLivingChildren");
	}
	
	@Test
	public void withNumberOfStillBirthsTest(){
		ancRegisterEntryDTO.withNumberOfStillBirths("numberOfStillBirths");
	}
	
	@Test
	public void withNumberOfAbortionsTest(){
		ancRegisterEntryDTO.withNumberOfAbortions("numberOfAbortions");
	}
	
	@Test
	public void withYoungestChildDOBTest(){
		ancRegisterEntryDTO.withYoungestChildDOB("youngestChildAge");
	}
	
	@Test
	public void withLMPTest(){
		ancRegisterEntryDTO.withLMP("lmp");
	}
	
	@Test
	public void withEDDTest(){
		ancRegisterEntryDTO.withEDD("edd");
	}
	
	@Test
	public void withHeightTest(){
		ancRegisterEntryDTO.withHeight("height");
	}
	
	@Test
	public void withBloodGroupTest(){
		ancRegisterEntryDTO.withBloodGroup("bloodGroup");
	}
	
	@Test
	public void withIsHRPTest(){
		ancRegisterEntryDTO.withIsHRP("isHRP");
	}
	
	@Test
	public void withANCVisitsTest(){
		List<Map<String, String>> ancVisits = null;
		ancRegisterEntryDTO.withANCVisits(ancVisits);
	}
	
	@Test
	public void withIFATabletsTest(){
		List<Map<String, String>> ifaTablets = null;
		ancRegisterEntryDTO.withIFATablets(ifaTablets);
	}
	
	@Test
	public void withTTDosesTest(){
		List<Map<String, String>> ttDoses = null;
		ancRegisterEntryDTO.withTTDoses(ttDoses);
	}
	
	@Test
	public void withHBTestsTest(){
		List<Map<String, String>> hbTests = null;
		ancRegisterEntryDTO.withHBTests(hbTests);
	}
	
	@Test
	public void withANCInvestigationsTest(){
		List<Map<String, String>> ancInvestigations = null;
		ancRegisterEntryDTO.withANCInvestigations(ancInvestigations);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		ancRegisterEntryDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		ancRegisterEntryDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		ancRegisterEntryDTO.toString();
	}
	
}
