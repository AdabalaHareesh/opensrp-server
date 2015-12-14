package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class FemaleSterilizationRegisterEntryDTOTest {

	private FemaleSterilizationRegisterEntryDTO femaleSterilization;
	@Before 
	public void setUp(){
		femaleSterilization = new FemaleSterilizationRegisterEntryDTO();
	}
	@Test
	public void ecNumberTest(){
		String w=femaleSterilization.ecNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeNameTest(){
		String w=femaleSterilization.wifeName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandNameTest(){
		String w=femaleSterilization.husbandName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void villageTest(){
		String w=femaleSterilization.village();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void subCenterTest(){
		String w=femaleSterilization.subCenter();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeAgeTest(){
		String w=femaleSterilization.wifeAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandAgeTest(){
		String w=femaleSterilization.husbandAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void casteTest(){
		String w=femaleSterilization.caste();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void religionTest(){
		String w=femaleSterilization.religion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingMaleChildrenTest(){
		String w=femaleSterilization.numberOfLivingMaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingFemaleChildrenTest(){
		String w=femaleSterilization.numberOfLivingFemaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeEducationLevelTest(){
		String w=femaleSterilization.wifeEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandEducationLevelTest(){
		String w=femaleSterilization.husbandEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void fpDetailsTest(){
		FemaleSterilizationFPDetailsDTO w=femaleSterilization.fpDetails();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withEcNumberTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withEcNumber("test");
		String l=w.ecNumber();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeNameTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withWifeName("test");
		String l=w.wifeName();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandNameTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withHusbandName("test");
		String l=w.husbandName();
		assertEquals(l,"test");
		}
	@Test
	public void withVillageTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withVillage("test");
		String l=w.village();
		assertEquals(l,"test");
		}
	@Test
	public void withSubCenterTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withSubCenter("test");
		String l=w.subCenter();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeAgeTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withWifeAge("test");
		String l=w.wifeAge();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandAgeTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withHusbandAge("test");
		String l=w.husbandAge();
		assertEquals(l,"test");
		}
	@Test
	public void withCasteTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withCaste("test");
		String l=w.caste();
		assertEquals(l,"test");
		}
	@Test
	public void withReligionTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withReligion("test");
		String l=w.religion();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingMaleChildrenTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withNumberOfLivingMaleChildren("test");
		String l=w.numberOfLivingMaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingFemaleChildrenTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withNumberOfLivingFemaleChildren("test");
		String l=w.numberOfLivingFemaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeEducationLevelTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withWifeEducationLevel("test");
		String l=w.wifeEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandEducationLevelTest(){
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withHusbandEducationLevel("test");
		String l=w.husbandEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withFpDetailsTest(){
		FemaleSterilizationFPDetailsDTO a = null;
		FemaleSterilizationRegisterEntryDTO w=femaleSterilization.withFpDetails(a);
		FemaleSterilizationFPDetailsDTO l=w.fpDetails();
		assertEquals(l,a);
		}
}
