package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class OCPRegisterEntryDTOTest {

	private OCPRegisterEntryDTO ocpregister;
	@Before
	public void setUp(){
		ocpregister = new OCPRegisterEntryDTO();
	}
	@Test
	public void ecNumberTest(){
		String w=ocpregister.ecNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeNameTest(){
		String w=ocpregister.wifeName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandNameTest(){
		String w=ocpregister.husbandName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void villageTest(){
		String w=ocpregister.village();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void subCenterTest(){
		String w=ocpregister.subCenter();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeAgeTest(){
		String w=ocpregister.wifeAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void casteTest(){
		String w=ocpregister.caste();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void religionTest(){
		String w=ocpregister.religion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingMaleChildrenTest(){
		String w=ocpregister.numberOfLivingMaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingFemaleChildrenTest(){
		String w=ocpregister.numberOfLivingFemaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void lmpDateTest(){
		String w=ocpregister.lmpDate();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void uptResultTest(){
		String w=ocpregister.uptResult();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeEducationLevelTest(){
		String w=ocpregister.wifeEducationLevel();
		String a =null;
		assertEquals(w,a);
	}
	@Test
	public void husbandEducationLevelTest(){
		String w=ocpregister.husbandEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void  fpDetailsTest(){
		OCPFPDetailsDTO w=ocpregister.fpDetails();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withEcNumberTest(){
		OCPRegisterEntryDTO w=ocpregister.withEcNumber("test");
		String l=w.ecNumber();
		assertEquals(l,"test");
	}
	@Test
	public void withWifeNameTest(){
		OCPRegisterEntryDTO w=ocpregister.withWifeName("test");
		String l=w.wifeName();
		assertEquals(l,"test");
		}
	@Test
	public void withHusbandNameTest(){
		OCPRegisterEntryDTO w=ocpregister.withHusbandName("test");
		String l=w.husbandName();
		assertEquals(l,"test");
	}
	@Test
	public void withVillageTest(){
		OCPRegisterEntryDTO w=ocpregister.withVillage("test");
		String l=w.village();
		assertEquals(l,"test");
	}
	@Test
	public void withSubCenterTest(){
		OCPRegisterEntryDTO w=ocpregister.withSubCenter("test");
		String l=w.subCenter();
		assertEquals(l,"test");
	}
	@Test
	public void withWifeAgeTest(){
		OCPRegisterEntryDTO w=ocpregister.withWifeAge("test");
		String l=w.wifeAge();
		assertEquals(l,"test");
	}
	@Test
	public void withCasteTest(){
		OCPRegisterEntryDTO w=ocpregister.withCaste("test");
		String l=w.caste();
		assertEquals(l,"test");
	}
	@Test 
	public void withReligionTest(){
		OCPRegisterEntryDTO w=ocpregister.withReligion("test");
		String l=w.religion();
		assertEquals(l,"test");
	}
	@Test
	public void withNumberOfLivingMaleChildrenTest(){
		OCPRegisterEntryDTO w=ocpregister.withNumberOfLivingMaleChildren("test");
		String l=w.numberOfLivingMaleChildren();
		assertEquals(l,"test");
	}	
	@Test
	public void withNumberOfLivingFemaleChildrenTest(){
		OCPRegisterEntryDTO w=ocpregister.withNumberOfLivingFemaleChildren("test");
		String l=w.numberOfLivingFemaleChildren();
		assertEquals(l,"test");
	}
	@Test
	public void withLmpDateTest(){
		OCPRegisterEntryDTO w=ocpregister.withLmpDate("test");
		String l=w.lmpDate();
		assertEquals(l,"test");
	}
	@Test
	public void withUptResultTest(){
		OCPRegisterEntryDTO t=ocpregister.withUptResult("test");
		String s=t.uptResult();
		assertEquals(s,"test");
	}
	@Test
	public void withWifeEducationLevelTest(){
		OCPRegisterEntryDTO t=ocpregister.withWifeEducationLevel("test");
		String s=t.wifeEducationLevel();
		assertEquals(s,"test");
	}
	@Test public void withHusbandEducationLevel(){
		OCPRegisterEntryDTO t=ocpregister.withHusbandEducationLevel("test");
		String s=t.husbandEducationLevel();
		assertEquals(s,"test");
	}
	@Test
	public void withFpDetailsTest(){
		OCPFPDetailsDTO a = null;
		OCPRegisterEntryDTO t=ocpregister.withFpDetails(a);
		OCPFPDetailsDTO s=t.fpDetails();
		assertEquals(s,a);
	}
	
}
