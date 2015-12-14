package org.ei.drishti.DTO;

import org.ei.drishti.dto.AlertStatus;
import org.junit.Test;

public class AlertStatusTest {
	
	@Test
	public void AlertStatusTest(){
		assertThat(AlertStatus.upcoming.value());
		}

	private void assertThat(String value) {
		// TODO Auto-generated method stub
		
	}

}
