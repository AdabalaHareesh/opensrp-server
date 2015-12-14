package org.ei.drishti.dto.aggregatorResponse;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
public class AggregatorResponseDTOTest {

	private AggregatorResponseDTO aggregatorres;
	
	@Before
	public void setUp(){
		aggregatorres = new AggregatorResponseDTO(null, null);
	}
	@Test
	public void indicatorTest(){
		String w= aggregatorres.indicator();
		String a=null;
		assertEquals(w,a);
    }
	@Test
	public void countTest(){
		Integer w= aggregatorres.count();
		String a=null;
		assertEquals(w,a);
	}
	
}
