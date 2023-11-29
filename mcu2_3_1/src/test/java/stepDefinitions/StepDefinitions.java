package stepDefinitions;
import org.testng.Assert;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import mcu2_3_1.SoapWS;

public class StepDefinitions {
	
	static Integer StatusCode;

	
	@Given("Calculator site")
	public void calculator_site() {
	}

	@When("Soap Request is {string}")
	public void soap_request_is(String RequestType) {
		if (RequestType.equals("Get"))
			StatusCode = SoapWS.GetRequestStatusCode();
		else if (RequestType.equals("Post"))
			StatusCode = SoapWS.PostRequestStatusCode();
	}

	@Then("the status code should be {int}")
	public void the_status_code_should_be(Integer code) {
		Assert.assertEquals(StatusCode, code);
	}

}
