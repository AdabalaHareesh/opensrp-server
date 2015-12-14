package org.ei.drishti.DTO;

import org.ei.drishti.dto.BeneficiaryType;
import org.junit.Test;

public class BeneficiaryTypeTest {
	
	@Test
	public void BeneficiaryTypeTest(){
		assertThat(BeneficiaryType.child.value());
		assertThat(BeneficiaryType.ec.value());
		assertThat(BeneficiaryType.mother.value());
	}

	private void assertThat(String value) {
		// TODO Auto-generated method stub
		
	}

}
