package org.ei.drishti.common.util;

import org.ei.drishti.common.monitor.Monitor;
import org.junit.Before;
import org.junit.Test;

public class ANMIndicatorSummaryFactoryTest {
	
	private ANMIndicatorSummaryFactory anmindicatorSummaryFactory;
	 @Before
	    public void setUp(){
		 anmindicatorSummaryFactory = new ANMIndicatorSummaryFactory();
	    }

	   @Test
	   public void createSummaryForIUDtest() throws Exception {
		 
		   anmindicatorSummaryFactory.createSummaryForANC();
	   }

 
	   @Test
	   public void createSummaryForIUDcontest() throws Exception {
		 
		   anmindicatorSummaryFactory.createSummaryForIUD("annualTarget");
		  
	   }
	  
	   @Test
	   public void createSummaryForANCtest() throws Exception {
		 
		   anmindicatorSummaryFactory.createSummaryForANC();
		  
	   }
	   
	   
	   @Test
	   public void createSummaryForCondomtest() throws Exception {
		 
		   anmindicatorSummaryFactory.createSummaryForCondom();
	   }

}
