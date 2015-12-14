package org.ei.drishti.dto.register;

import org.junit.Before;
import org.junit.Test;

public class CondomFPDetailsDTOTest {
	
	private CondomFPDetailsDTO condomFPDetailsDTO;
	
	@Before
	public void setUp(){
		condomFPDetailsDTO = new CondomFPDetailsDTO(null, null);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		condomFPDetailsDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		condomFPDetailsDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		condomFPDetailsDTO.toString();
	}

}
