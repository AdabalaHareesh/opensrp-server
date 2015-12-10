package org.ei.drishti.dto;
import org.junit.Before;
import org.junit.Test;
public class MonthSummaryDatumTest {
 
	private MonthSummaryDatum monthsummary;
	
	@Before
	public void setUp(){
		monthsummary = new MonthSummaryDatum();
	}
	@Test
	public void monthTest(){
		monthsummary.month();
	}
	@Test
	public void yearTest(){
		monthsummary.year();
	}
	@Test
	public void currentprogressTest(){
		monthsummary.currentProgress();
	}
	@Test
	public void aggregatedProgressTest(){
		monthsummary.aggregatedProgress();
	}
	@Test
	public void externalIDsTest(){
		monthsummary.externalIDs();
	}
	
}
