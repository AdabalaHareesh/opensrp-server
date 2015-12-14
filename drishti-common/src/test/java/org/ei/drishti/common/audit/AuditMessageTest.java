package org.ei.drishti.common.audit;

import static org.junit.Assert.*;

import java.security.KeyRep.Type;
import java.util.Map;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;

public class AuditMessageTest {

	private AuditMessage auditMessage;

	@Before
	public void setUp() {
		auditMessage = new AuditMessage(null, 0, null, null);
	}

	@Test
	public void typetest() throws Exception {
		AuditMessageType m = auditMessage.type();
		String a = null;
		assertEquals(m, a);
	}
	
	@Test
	public void datatest() throws Exception {
		Map<String, String> m = auditMessage.data();
		String a = null;
		assertEquals(m, a);
	}

	@Test
	public void timetest() throws Exception {
		DateTime m = auditMessage.time();
		String a = null;
		assertEquals(m, a);
	}
	
	@Test
	public void equalsTest(){
		Object o = null;
		auditMessage.equals(o);
	}

}
