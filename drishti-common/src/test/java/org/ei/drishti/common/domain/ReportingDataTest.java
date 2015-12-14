package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ReportingDataTest {

	private ReportingData reportingData;

	@Before
	public void setUp() {
		reportingData = new ReportingData(null, null);
	}

	@Test
	public void typetest() throws Exception {
		String m = reportingData.type();
		String a = null;
		assertEquals(m, a);

	}

}
