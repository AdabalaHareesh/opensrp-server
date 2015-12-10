package org.ei.drishti.dto.form;
import org.junit.Before;
import org.junit.Test;
public class MultimediaDTOTest {

	private MultimediaDTO multimedia;
	
	@Before
	public void setUp(){
		multimedia = new MultimediaDTO();
	}
	@Test
	public void caseIdTest(){
		multimedia.caseId();
	}
	@Test
	public void  providerIdTest(){
		multimedia.providerId();
	}
	@Test
	public void contentTypeTest(){
		multimedia.contentType();
	}
	@Test
	public void filePathTest(){
		multimedia.filePath();
	}
	@Test
	public void fileCategory(){
		multimedia.fileCategory();
	}
}
