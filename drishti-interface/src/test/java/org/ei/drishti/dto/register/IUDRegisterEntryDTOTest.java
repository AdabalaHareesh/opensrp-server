package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class IUDRegisterEntryDTOTest {

	private IUDRegisterEntryDTO iudRegisterEntry;
	@Before 
	public void setUp(){
		iudRegisterEntry = new IUDRegisterEntryDTO();
	}
	@Test
	public void ecNumberTest(){
		String w=iudRegisterEntry.ecNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeNameTest(){
		String w=iudRegisterEntry.wifeName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandNameTest(){
		String w=iudRegisterEntry.husbandName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void villageTest(){
		String w=iudRegisterEntry.village();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void subCenterTest(){
		String w=iudRegisterEntry.subCenter();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeAgeTest(){
		String w=iudRegisterEntry.wifeAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandAgeTest(){
		String w=iudRegisterEntry.husbandAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void casteTest(){
		String w=iudRegisterEntry.caste();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void religionTest(){
		String w=iudRegisterEntry.religion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingMaleChildrenTest(){
		String w=iudRegisterEntry.numberOfLivingMaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingFemaleChildrenTest(){
		String w=iudRegisterEntry.numberOfLivingFemaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void lmpDateTest(){
		String w=iudRegisterEntry.lmpDate();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void uptResultTest(){
		String w=iudRegisterEntry.uptResult();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeEducationLevelTest(){
		String w=iudRegisterEntry.wifeEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandEducationLevelTest(){
		String w=iudRegisterEntry.husbandEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void fpDetailsTest(){
		IUDFPDetailsDTO w=iudRegisterEntry.fpDetails();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withEcNumberTest(){
		String a = null;
		IUDRegisterEntryDTO w=iudRegisterEntry.withEcNumber(a);
		String l=w.ecNumber();
		assertEquals(l,a);
		}
	@Test
	public void withWifeNameTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withWifeName("test");
		String l=w.wifeName();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandNameTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withHusbandName("test");
		String l=w.husbandName();
		assertEquals(l,"test");
		}
	@Test
	public void withVillageTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withVillage("test");
		String l=w.village();
		assertEquals(l,"test");
		}
	@Test
	public void withSubCenterTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withSubCenter("test");
		String l=w.subCenter();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeAgeTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withWifeAge("test");
		String l=w.wifeAge();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandAgeTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withHusbandAge("test");
		String l=w.husbandAge();
		assertEquals(l,"test");
		}
	@Test
	public void withCasteTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withCaste("test");
		String l=w.caste();
		assertEquals(l,"test");
		}
	@Test
	public void withReligionTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withReligion("test");
		String l=w.religion();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingMaleChildrenTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withNumberOfLivingMaleChildren("test");
		String l=w.numberOfLivingMaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withNumberOfLivingFemaleChildrenTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withNumberOfLivingFemaleChildren("test");
		String l=w.numberOfLivingFemaleChildren();
		assertEquals(l,"test");
		}
	@Test
	public void withWifeEducationLevelTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withWifeEducationLevel("test");
		String l=w.wifeEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandEducationLevelTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withHusbandEducationLevel("test");
		String l=w.husbandEducationLevel();
		assertEquals(l,"test");
		}
	@Test
	public void withLmpDateTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withLmpDate("test");
		String l=w.lmpDate();
		assertEquals(l,"test");
		}
	@Test
	public void withUptResultTest(){
		IUDRegisterEntryDTO w=iudRegisterEntry.withUptResult("test");
		String l=w.uptResult();
		assertEquals(l,"test");
		}
	@Test
	public void withFpDetailsTest(){
		IUDFPDetailsDTO a = null;
		IUDRegisterEntryDTO w=iudRegisterEntry.withFpDetails(a);
		IUDFPDetailsDTO l=w.fpDetails();
		assertEquals(l,a);
		}
}
