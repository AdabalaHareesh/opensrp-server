package org.ei.drishti.dto.register;

import org.junit.Before;
import org.junit.Test;

public class ANMDetailDTOTest {
	
	private ANMDetailDTO anmDetailDTO;
	
	@Before
	public void setUp(){
		anmDetailDTO = new ANMDetailDTO(null, null, null, 0, 0, 0, 0, 0);		
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		anmDetailDTO.equals(o);
	}
	
	@Test
	public void hashCodeTest(){
		anmDetailDTO.hashCode();
	}
	
	@Test
	public void toStringTest(){
		anmDetailDTO.toString();
	}

}
