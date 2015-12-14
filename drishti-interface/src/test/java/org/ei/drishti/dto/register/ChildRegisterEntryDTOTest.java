package org.ei.drishti.dto.register;

import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class ChildRegisterEntryDTOTest {
	
	private ChildRegisterEntryDTO childRegisterEntryDTO;
	
	@Before
	public void setUp(){
		childRegisterEntryDTO = new ChildRegisterEntryDTO();
	}
	
	@Test
	public void withThayiCardNumberTest(){
		childRegisterEntryDTO.withThayiCardNumber("thayiCardNumber");
	}
	
	@Test
	public void withWifeNameTest(){
		childRegisterEntryDTO.withWifeName("wifeName");
	}
	
	@Test
	public void withHusbandNameTest(){
		childRegisterEntryDTO.withHusbandName("husbandName");
	}
	
	@Test
	public void withVillageTest(){
		childRegisterEntryDTO.withVillage("village");
	}
	
	@Test
	public void withSubCenterTest(){
		childRegisterEntryDTO.withSubCenter("subCenter");
	}
	
	@Test
	public void withWifeDOBTest(){
		childRegisterEntryDTO.withWifeDOB("wifeDOB");
	}
	
	@Test
	public void withDOBTest(){
		childRegisterEntryDTO.withDOB("DOB");
	}
	
	@Test
	public void withImmunizationsTest(){
		Map<String, String> immunizations = null;
		childRegisterEntryDTO.withImmunizations(immunizations);
	}
	
	@Test
	public void withVitaminADosesTest(){
		Map<String, String> vitaminADoses = null;
		childRegisterEntryDTO.withVitaminADoses(vitaminADoses);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		childRegisterEntryDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		childRegisterEntryDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		childRegisterEntryDTO.toString();
	}

}
