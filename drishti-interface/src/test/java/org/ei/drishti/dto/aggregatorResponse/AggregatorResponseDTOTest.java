package org.ei.drishti.dto.aggregatorResponse;
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
		aggregatorres.indicator();
    }
	@Test
	public void countTest(){
		aggregatorres.count();
	}
	
}
