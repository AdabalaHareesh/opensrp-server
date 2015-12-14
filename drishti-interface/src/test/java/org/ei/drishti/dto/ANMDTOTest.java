package org.ei.drishti.dto;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class ANMDTOTest {
 
	private ANMDTO anmdto;
	
	@Before
	public void setUp(){
		anmdto = new ANMDTO(null, null, null);
	}
	@Test
	public void identifierTest(){
		String w= anmdto.identifier();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void nameTest(){
		String w= anmdto.name();
		String a=null;
		assertEquals(w,a);
	}
	@Test
	public void locationTest(){
		LocationDTO w= anmdto.location();
		String a=null;
		assertEquals(w,a);
	}
}
