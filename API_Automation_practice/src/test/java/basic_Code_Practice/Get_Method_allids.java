package basic_Code_Practice;

import java.util.List;
import java.util.Set;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Get_Method_allids 
{
	
	@Test
	public void GetCall()
	{
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspec = RestAssured.given();
		
		Response res =reqspec.get();
		
		int Statuscode =res.getStatusCode();
		System.out.println("The status code is --"+Statuscode);
		Assert.assertEquals(Statuscode, 200);
		if(Statuscode == 200)
		{
			System.out.println(res.getBody().prettyPrint());
		}
		else
		{
			System.out.println("Displaying wrong status code....");
		}
		
		System.out.println("This is response path --------------------");
		JsonPath jspath = res.jsonPath();
		
		
		List<Integer> aa =jspath.get("bookingid");
		System.out.println(aa);
		boolean a =aa.contains(16);
		System.out.println(a);
	}

}
