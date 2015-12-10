package org.ei.drishti.dto;
import org.junit.Before;
import org.junit.Test;
public class ANMVillagesDTOTest {

	private ANMVillagesDTO anmvillagesdto;
	
	@Before 
	public void setUp(){
		anmvillagesdto = new ANMVillagesDTO(null, null, null);
	}
	@Test
	public void userroleTest(){
		anmvillagesdto.userrole();
	}
	@Test
	public void user_idTest(){
		anmvillagesdto.user_id();
		
	}
	@Test
	public void villagesTest(){
		anmvillagesdto.villages();
	}
}
