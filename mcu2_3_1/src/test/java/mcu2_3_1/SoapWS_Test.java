package mcu2_3_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoapWS_Test {

	
	@Test
	  public void GetRequestTest() {
		  Assert.assertEquals(SoapWS.GetRequestStatusCode(),200);
	  }

	  @Test
	  public void PostRequestTest() {
		  Assert.assertEquals(SoapWS.PostRequestStatusCode(),500);
	  }

}

