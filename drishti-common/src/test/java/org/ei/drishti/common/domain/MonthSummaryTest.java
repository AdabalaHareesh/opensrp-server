package org.ei.drishti.common.domain;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class MonthSummaryTest {
	
	private MonthSummary monthSummary;
	 @Before
 public void setUp(){
		 monthSummary = new MonthSummary(null, null, null, null, null);
 }

@Test
public void monthtest() throws Exception {
	String m= monthSummary.month();
	String a=null;
	assertEquals(m,a);
}

@Test
public void yeartest() throws Exception {
	String m= monthSummary.year();
	String a=null;
	assertEquals(m,a);
}

@Test
public void currentProgresstest() throws Exception {
	String m= monthSummary.currentProgress();
	String a=null;
	assertEquals(m,a);
}


@Test
public void aggregatedProgresstest() throws Exception {
	String m= monthSummary.aggregatedProgress();
	String a=null;
	assertEquals(m,a);
}


@Test
public void externalIDstest() throws Exception {
	List<String> m= monthSummary.externalIDs();
	String a=null;
	assertEquals(m,a);
}

}
