package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ANMReportTest {

	private ANMReport anmreport;

	@Before
	public void setUp() {
		anmreport = new ANMReport(null, null);
	}

	@Test
	public void summariestest() throws Exception {
		List<ANMIndicatorSummary> m = anmreport.summaries();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void anmIdentifiertest() throws Exception {
		String m = anmreport.anmIdentifier();
		String a = null;
		assertEquals(m, a);
	}

}
