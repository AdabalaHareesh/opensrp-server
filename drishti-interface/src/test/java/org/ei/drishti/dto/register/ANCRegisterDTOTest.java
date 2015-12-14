package org.ei.drishti.dto.register;

import org.junit.Before;
import org.junit.Test;

public class ANCRegisterDTOTest {
	
	private ANCRegisterDTO ancRegisterDTO;
	
	@Before
	public void setUp(){
		ancRegisterDTO = new ANCRegisterDTO(null);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		ancRegisterDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		ancRegisterDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		ancRegisterDTO.toString();
	}

}
