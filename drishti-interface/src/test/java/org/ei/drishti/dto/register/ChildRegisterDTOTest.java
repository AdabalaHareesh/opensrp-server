package org.ei.drishti.dto.register;

import org.junit.Before;
import org.junit.Test;

public class ChildRegisterDTOTest {
	
	private ChildRegisterDTO childRegisterDTO;
	
	@Before
	public void setUp(){
		childRegisterDTO = new ChildRegisterDTO(null);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		childRegisterDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		childRegisterDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		childRegisterDTO.toString();
	}

}
