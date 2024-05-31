package basic_Code_Practice;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_MEthod_singleBookId 
{
	@Test
	public void SingleBookId_response()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking/1558";
		RequestSpecification reqspec = RestAssured.given();
		
		Response resp =reqspec.get();
		int statuscode = resp.getStatusCode();
		System.out.println("==== THE STATUS CODE IS --- "+statuscode);
		System.out.println(resp.getBody().asString());
		System.out.println(resp.getBody().jsonPath().get("bookingdates"));
		System.out.println(resp.getBody().jsonPath().get("bookingdates.checkin"));
		
	}

}
