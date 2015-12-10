package org.ei.drishti.dto.register;
import org.junit.Before;
import org.junit.Test;
public class PNCVisitDTOTest {
  
	private PNCVisitDTO pncvisit;
	@Before
	public void setUp(){
		pncvisit = new PNCVisitDTO();
	}
	@Test
	public void withDateTest(){
		String date = null;
		pncvisit.withDate(date);
	}
	@Test
	public void withPersonTest(){
		String person = null;
		pncvisit.withPerson(person);
	}
	@Test
	public void withPlaceTest(){
		String place = null;
		pncvisit.withPlace(place);
	}
	@Test
	public void withDifficultiesTest(){
		pncvisit.withDifficulties(null);
	}
	@Test
	public void withAbdominalProblemsTest(){
		pncvisit.withAbdominalProblems(null);
	}
	@Test
	public void withVaginalProblemsTest(){
		pncvisit.withVaginalProblems(null);
	}
	@Test
	public void withUrinalProblemsTest(){
		pncvisit.withUrinalProblems(null);
	}
	@Test
	public void withBreastProblemsTest(){
		pncvisit.withBreastProblems(null);
	}
	@Test
	public void withChildrenDetailsTest(){
		pncvisit.withChildrenDetails(null);
	}
	
}
