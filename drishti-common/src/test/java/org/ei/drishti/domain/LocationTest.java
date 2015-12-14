package org.ei.drishti.domain;

import static org.junit.Assert.assertEquals;

import org.ei.drishti.common.monitor.Metric;
import org.ei.drishti.common.util.IntegerUtil;
import org.junit.Before;
import org.junit.Test;

public class LocationTest {

	private Location location;

	@Before
	public void setUp() {
		location = new Location(null, null, null);
	}

	@Test
	public void villageTest() throws Exception {
		String m = location.village();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void subCenterTest() throws Exception {
		String m = location.subCenter();
		String a = null;
		assertEquals(m, a);

	}

	@Test
	public void phcTest() throws Exception {
		String m = location.phc();
		String a = null;
		assertEquals(m, a);
	}

}
