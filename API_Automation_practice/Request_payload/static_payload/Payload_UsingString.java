//IN THIS PROGRAM WE ARE SENDING REQUEST PAYLOAD USING STRING HARDCODING..

package static_payload;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Payload_UsingString 
{
	
	@Test
	public void String_requestPayload()
	{
		String requestPayload ="{\r\n" + 
				"    \"firstname\" : \"Anand-new\",\r\n" + 
				"    \"lastname\" : \"Test\",\r\n" + 
				"    \"totalprice\" : 111,\r\n" + 
				"    \"depositpaid\" : false,\r\n" + 
				"    \"bookingdates\" : {\r\n" + 
				"        \"checkin\" : \"2018-01-01\",\r\n" + 
				"        \"checkout\" : \"2019-01-01\"\r\n" + 
				"    },\r\n" + 
				"    \"additionalneeds\" : \"Breakfast\"\r\n" + 
				"}";
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		RequestSpecification req_spec = RestAssured
										.given()
										.header("content-type", "application/json")
										.body(requestPayload);
			Response resp = req_spec.post();
			System.out.println("status code ---"+resp.getStatusCode());
	}

}
