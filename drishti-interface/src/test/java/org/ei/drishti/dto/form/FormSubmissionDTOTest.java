package org.ei.drishti.dto.form;
import org.junit.Before;
import org.junit.Test;
public class FormSubmissionDTOTest {

	private FormSubmissionDTO formsubmission;
	
	@Before
	public void setUp(){
		formsubmission = new FormSubmissionDTO(null, null, null, null, null, null, null);
	}
	@Test
	public void anmIdTest(){
		formsubmission.anmId();
	}
	@Test
	public void instanceIdTest(){
		formsubmission.instanceId();
	}
	@Test
	public void entityIdTest(){
		formsubmission.entityId();
	}
	@Test
	public void formNameTest(){
		formsubmission.formName();
	}
	@Test
	public void instance(){
		formsubmission.instance();
	}
	@Test
	public void clientVersion(){
		formsubmission.clientVersion();
	}
	@Test
	public void formDataDefinitionVersion(){
		formsubmission.formDataDefinitionVersion();
		}
	@Test
	public void serverVersion(){
		formsubmission. serverVersion();
	}
}
