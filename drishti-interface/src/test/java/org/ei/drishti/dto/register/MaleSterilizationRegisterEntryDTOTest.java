package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class MaleSterilizationRegisterEntryDTOTest {

	private MaleSterilizationRegisterEntryDTO maleSterilization;
	@Before 
	public void setUp(){
		maleSterilization = new MaleSterilizationRegisterEntryDTO();
	}
	@Test
	public void ecNumberTest(){
		String w=maleSterilization.ecNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeNameTest(){
		String w=maleSterilization.wifeName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandNameTest(){
		String w=maleSterilization.husbandName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void villageTest(){
		String w=maleSterilization.village();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void subCenterTest(){
		String w=maleSterilization.subCenter();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeAgeTest(){
		String w=maleSterilization.wifeAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandAgeTest(){
		String w=maleSterilization.husbandAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void casteTest(){
		String w=maleSterilization.caste();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void religionTest(){
		String w=maleSterilization.religion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingMaleChildrenTest(){
		String w=maleSterilization.numberOfLivingMaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingFemaleChildrenTest(){
		String w=maleSterilization.numberOfLivingFemaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeEducationLevelTest(){
		String w=maleSterilization.wifeEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandEducationLevelTest(){
		String w=maleSterilization.husbandEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void fpDetailsTest(){
		MaleSterilizationFPDetailsDTO w=maleSterilization.fpDetails();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withEcNumberTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withEcNumber("test");
		String l=w.ecNumber();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeNameTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withWifeName("test");
		String l=w.wifeName();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandNameTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withHusbandName("test");
		String l=w.husbandName();
		assertEquals(l,"test");
		}
	@Test
	public void withVillageTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withVillage("test");
		String l=w.village();
		assertEquals(l,"test");
		}
	@Test
	public void withSubCenterTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withSubCenter("test");
		String l=w.subCenter();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeAgeTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withWifeAge("test");
		String l=w.wifeAge();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandAgeTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withHusbandAge("test");
		String l=w.husbandAge();
		assertEquals(l,"test");
		}
	@Test
	public void withCasteTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withCaste("test");
		String l=w.caste();
		assertEquals(l,"test");
		}
	@Test
	public void withReligionTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withReligion("test");
		String l=w.religion();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingMaleChildrenTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withNumberOfLivingMaleChildren("test");
		String l=w.numberOfLivingMaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingFemaleChildrenTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withNumberOfLivingFemaleChildren("test");
		String l=w.numberOfLivingFemaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeEducationLevelTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withWifeEducationLevel("test");
		String l=w.wifeEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandEducationLevelTest(){
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withHusbandEducationLevel("test");
		String l=w.husbandEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withFpDetailsTest(){
		MaleSterilizationFPDetailsDTO a = null;
		MaleSterilizationRegisterEntryDTO w=maleSterilization.withFpDetails(a);
		MaleSterilizationFPDetailsDTO l=w.fpDetails();
		assertEquals(l,a);
		}
}
