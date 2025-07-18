package static_payload;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Payload_UsingFile 
{

	//C:\Users\ANANDA K R\eclipse-workspace\API_Automation_practice\src\test\java\basic_Code_Practice\post.json
	@Test
	public void file_payload()
	{
		File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_practice\\src\\test\\java\\basic_Code_Practice\\post.json");
		
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		
		RequestSpecification req_spec = RestAssured		
										.given()
										.header("content-type", "application/json")
										.body(fl);
		Response resp = req_spec.post();
		System.out.println("The response_code payload using file --"+resp.getStatusCode());
	}
}
