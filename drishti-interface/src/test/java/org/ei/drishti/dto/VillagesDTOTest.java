package org.ei.drishti.dto;
import org.junit.Before;
import org.junit.Test;
public class VillagesDTOTest {

	private VillagesDTO villagesdto;
	 
	@Before
	public void setUp(){
		villagesdto = new VillagesDTO(null, null, null, null, null);
	} 
	@Test
	public void phcNameTest(){
		villagesdto.phcName();
	}
	@Test
	public void subCenterTest(){
		villagesdto.subCenter();
		}
	@Test
	public void villagesTest(){
		villagesdto.villages();
		}
	@Test
	public void phcIdentifier(){
		villagesdto.phcIdentifier();
	}
}
