package org.ei.drishti.dto;
import static org.junit.Assert.assertEquals;

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
		String w= anmvillagesdto.userrole();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void user_idTest(){
		String w= anmvillagesdto.user_id();
		String a=null;
		assertEquals(w,a);
		
	}
	@Test
	public void villagesTest(){
		String w= anmvillagesdto.villages();
		String a=null;
		assertEquals(w,a);
	}
}
