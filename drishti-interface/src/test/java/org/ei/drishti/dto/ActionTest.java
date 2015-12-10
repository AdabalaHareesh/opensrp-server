package org.ei.drishti.dto;

import org.junit.Before;
import org.junit.Test;

public class ActionTest {
	
	private Action action;
	
	 @Before
	 public void setUp(){
		 action = new Action(null,null,null,null,null,null,null);
	 }
	@Test
	public void caseIDTest(){
		action.caseID();
	}
	@Test
	public void targetTest(){
		action.target();
	}
	@Test
	public void typeTest(){
		action.type();
	}
	@Test
	public void isActionActiveTest(){
		action.isActionActive();
	}
	@Test
	public void indexTest(){
		action.index();
	}
	@Test
	public void detailsTest(){
		action.details();
	}
	@Test
	public void dataTest(){
		action.data();
	}
	
}
