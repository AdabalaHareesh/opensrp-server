package org.ei.drishti.dto.register;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class CondomRegisterEntryDTOTest {
	
	private CondomRegisterEntryDTO condomRegister;
	
	@Before
	public void setUp(){
		condomRegister=new CondomRegisterEntryDTO();
	}
	@Test
	public void ecNumberTest(){
		String w=condomRegister.ecNumber();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeNameTest(){
		String w=condomRegister.wifeName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandNameTest(){
		String w=condomRegister.husbandName();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void villageTest(){
		String w=condomRegister.village();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void subCenterTest(){
		String w=condomRegister.subCenter();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeAgeTest(){
		String w=condomRegister.wifeAge();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void casteTest(){
		String w=condomRegister.caste();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void religionTest(){
		String w=condomRegister.religion();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingMaleChildrenTest(){
		String w=condomRegister.numberOfLivingMaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void numberOfLivingFemaleChildrenTest(){
		String w=condomRegister.numberOfLivingFemaleChildren();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void wifeEducationLevelTest(){
		String w=condomRegister.wifeEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void husbandEducationLevelTest(){
		String w=condomRegister.husbandEducationLevel();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void fpDetailsTest(){
		CondomFPDetailsDTO w=condomRegister.fpDetails();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void withEcNumberTest(){
		CondomRegisterEntryDTO w=condomRegister.withEcNumber("test");
		String l=w.ecNumber();
		assertEquals(l,"test");
	}
	@Test
	public void withWifeNameTest(){
		CondomRegisterEntryDTO w=condomRegister.withWifeName("test");
		String l=w.wifeName();
		assertEquals(l,"test");
	}
	@Test
	public void withHusbandNameTest(){
		CondomRegisterEntryDTO w=condomRegister.withHusbandName("test");
		String l=w.husbandName();
		assertEquals(l,"test");
	}
	@Test
	public void withVillageTest(){
		CondomRegisterEntryDTO w=condomRegister.withVillage("test");
		String l=w.village();
		assertEquals(l,"test");
	}
	@Test
	public void withSubCenterTest(){
		CondomRegisterEntryDTO w=condomRegister.withSubCenter("test");
		String l=w.subCenter();
		assertEquals(l,"test");
	}
	@Test
	public void withWifeAgeTest(){
		CondomRegisterEntryDTO w=condomRegister.withWifeAge("test");
		String l=w.wifeAge();
		assertEquals(l,"test");
	}
	@Test
	public void withCasteTest(){
		CondomRegisterEntryDTO w=condomRegister.withCaste("test");
		String l=w.caste();
		assertEquals(l,"test");
	}
	@Test
	public void withReligionTest(){
		CondomRegisterEntryDTO w=condomRegister.withReligion("test");
		String l=w.religion();
		assertEquals(l,"test");
	}
	@Test
	public void withNumberOfLivingMaleChildrenTest(){
		CondomRegisterEntryDTO w=condomRegister.withNumberOfLivingMaleChildren("test");
		String l=w.numberOfLivingMaleChildren();
		assertEquals(l,"test");
	}
	@Test
	public void withNumberOfLivingFemaleChildrenTest(){
		CondomRegisterEntryDTO w=condomRegister.withNumberOfLivingFemaleChildren("test");
		String l=w.numberOfLivingFemaleChildren();
		assertEquals(l,"test");
	}
	@Test
	public void withWifeEducationLevelTest(){
		CondomRegisterEntryDTO w=condomRegister.withWifeEducationLevel("test");
		String l=w.wifeEducationLevel();
		assertEquals(l,"test");
	}
	@Test
	public void withHusbandEducationLevelTest(){
		CondomRegisterEntryDTO w=condomRegister.withHusbandEducationLevel("test");
		String l=w.husbandEducationLevel();
		assertEquals(l,"test");
	}
	@Test
	public void withFpDetailsTest(){
		CondomFPDetailsDTO a = null;
		CondomRegisterEntryDTO w=condomRegister.withFpDetails(a);
		CondomFPDetailsDTO l=w.fpDetails();
		assertEquals(l,a);
	}
}
