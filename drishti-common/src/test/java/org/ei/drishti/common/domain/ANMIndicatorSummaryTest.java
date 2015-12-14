package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class ANMIndicatorSummaryTest {

	private ANMIndicatorSummary anmindicatorSummary;

	@Before
	public void setUp() {
		anmindicatorSummary = new ANMIndicatorSummary(null, null, null);
	}

	@Test
	public void monthlySummariestest() throws Exception {
		List<MonthSummary> m = anmindicatorSummary.monthlySummaries();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void annualTargettest() throws Exception {
		String m = anmindicatorSummary.annualTarget();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void indicatortest() throws Exception {
		String m = anmindicatorSummary.indicator();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void equalsTest() {
		Object o = null;
		anmindicatorSummary.equals(o);
	}

	@Test
	public void hashCodeTest() {
		anmindicatorSummary.hashCode();
	}

	@Test
	public void toStringTest() {
		anmindicatorSummary.toString();
	}
}
