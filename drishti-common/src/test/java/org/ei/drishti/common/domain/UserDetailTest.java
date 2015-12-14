package org.ei.drishti.common.domain;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class UserDetailTest {

	private UserDetail userDetail;

	@Before
	public void setUp() {
		userDetail = new UserDetail(null, null);
	}

	@Test
	public void userNametest() throws Exception {
		String m = userDetail.userName();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void rolestest() throws Exception {
		List<String> m = userDetail.roles();
		String a = null;
		assertEquals(m, a);
	}

}
