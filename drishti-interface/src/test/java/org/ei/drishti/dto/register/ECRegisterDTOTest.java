package org.ei.drishti.dto.register;

import org.junit.Before;
import org.junit.Test;

public class ECRegisterDTOTest {
	
	private ECRegisterDTO ecRegisterDTO;
	
	@Before
	public void setUp(){
		ecRegisterDTO = new ECRegisterDTO(null);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		ecRegisterDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		ecRegisterDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		ecRegisterDTO.toString();
	}

}
