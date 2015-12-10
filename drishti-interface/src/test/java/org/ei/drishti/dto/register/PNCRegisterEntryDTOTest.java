package org.ei.drishti.dto.register;
import org.junit.Before;
import org.junit.Test;
public class PNCRegisterEntryDTOTest {

	private PNCRegisterEntryDTO pncregister;
	@Before 
	public void setUp(){
		pncregister = new PNCRegisterEntryDTO();
	}
	@Test
	public void withRegistrationDateTest(){
		pncregister.withRegistrationDate(null);
	}
	@Test
	public void withThayiCardNumberTest(){
		pncregister.withThayiCardNumber(null);
	}
	@Test
	public void withWifeNameTest(){
		pncregister.withWifeName(null);
	}
	@Test
	public void withHusbandNameTest(){
		pncregister.withHusbandName(null);
	}
	@Test
	public void withWifeDOBTest(){
		pncregister.withWifeDOB(null);
	}
	@Test
	public void withAddressTest(){
		pncregister.withAddress(null);
	}
	@Test
	public void withDateOfDeliveryTest(){
		pncregister.withDateOfDelivery(null);
	}
	@Test
	public void withPlaceOfDeliveryTest(){
		pncregister.withPlaceOfDelivery(null);
	}
	@Test
	public void withTypeOfDeliveryTest(){
		pncregister.withTypeOfDelivery(null);
	}
	@Test
	public void withDischargeDateTest(){
		pncregister.withDischargeDate(null);
	}
	@Test
	public void withFPMethodNameTest(){
		pncregister.withFPMethodName(null);
	}
	@Test
	public void withFPMethodDateTest(){
		pncregister.withFPMethodDate(null);
	}
	@Test
	public void withDeliveryComplicationsTest(){
		pncregister.withDeliveryComplications(null);
	}
	@Test
	public void withChildrenDetailsTest(){
		pncregister.withChildrenDetails(null);
	}
	@Test
	public void PNCVisitsTest(){
		pncregister.withPNCVisits(null);
	}
	 
}
