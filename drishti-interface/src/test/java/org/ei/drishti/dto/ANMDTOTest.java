package org.ei.drishti.dto;
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
		anmdto.identifier();
	}
	@Test
	public void nameTest(){
		anmdto.name();
	}
	@Test
	public void location(){
		anmdto.location();
	}
}
