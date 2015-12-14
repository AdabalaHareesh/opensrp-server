package org.ei.drishti.dto.report;

import org.junit.Before;
import org.junit.Test;

public class AggregatedReportsDTOTest {
	
	private AggregatedReportsDTO aggregatedReportsDTO;
	
	@Before
	public void setUp(){
		aggregatedReportsDTO = new AggregatedReportsDTO(null, null);
	}
	
	@Test
	public void equalsTest(){		
		Object o = null;
		aggregatedReportsDTO.equals(o);		
	}
	
	@Test
	public void hashCodeTest(){		
		aggregatedReportsDTO.hashCode();	
	}
	
	@Test
	public void toStringTest(){		
		aggregatedReportsDTO.toString();
	}
}
