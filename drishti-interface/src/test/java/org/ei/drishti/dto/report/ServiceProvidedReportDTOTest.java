package org.ei.drishti.dto.report;

import org.joda.time.LocalDate;
import org.junit.Before;
import org.junit.Test;

public class ServiceProvidedReportDTOTest {
	
	private ServiceProvidedReportDTO serviceProvidedReportDTO;
	
	@Before
	public void setUp(){
		serviceProvidedReportDTO = new 	ServiceProvidedReportDTO();			
	}
		
	@Test
	public void withIdTest(){
		Integer id = null;
		serviceProvidedReportDTO.withId(id);
	}
	
	@Test
	public void withNRHMReportMonthTest(){
		serviceProvidedReportDTO.withNRHMReportMonth(null);
	}
	
	@Test
	public void withNRHMReportYearTest(){
		serviceProvidedReportDTO.withNRHMReportYear(null);
	}
	
	@Test
	public void withDateTest(){
		LocalDate date = null;
		serviceProvidedReportDTO.withDate(date);
	}
	

}
