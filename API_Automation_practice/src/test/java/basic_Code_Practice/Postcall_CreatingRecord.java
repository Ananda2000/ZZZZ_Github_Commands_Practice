// This method used to create data in webservice....

package basic_Code_Practice;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.Test;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postcall_CreatingRecord 
{
	//int bookingid ;
	@Test(priority=1)
	public void post_Call_RecordCreation() throws IOException
	{
		File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_practice\\src\\test\\java\\basic_Code_Practice\\post.json");
		
		ObjectMapper objmppr = new ObjectMapper();
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqsp = RestAssured.given().header("Content-Type", "application/json").body(fl);
		
		Response resp = reqsp.post();
		String str1 = resp.getBody().asString();
		System.out.println(resp.statusCode());
		//System.out.println(str1);
		
		JsonNode jsnd = objmppr.readTree(str1);
		
		//System.out.println(jsnd.get("bookingid"));
		 Data_Storage.bookingid = jsnd.get("bookingid").asInt();
		System.out.println("The booking id ---"+Data_Storage.bookingid );
		//return bookingid;
		
		

	}
	
	@Test(priority=2)
	public void get_Call()
	{
		System.out.println("==============THIS IS GETCALL=================");
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspec = RestAssured.given().pathParam("id",Data_Storage.bookingid);
		
		Response resp =reqspec.get("/{id}");
		
		System.out.println("====================================================");
		System.out.println("get call status code.."+resp.getStatusCode());
	}
	
	
	@Test(priority=3)
	public void put_call()
	{
		String tokenvalue ="token="+Authotoken_generation.tokengeneration();
		File fl_put = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_practice\\src\\test\\java\\basic_Code_Practice\\put_body.json");;
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspePut = RestAssured.given()
										.pathParam("id", Data_Storage.bookingid)
										.header("Content-Type", "application/json")
										.header("Cookie",tokenvalue)
										.body(fl_put);
		Response resp_put = reqspePut.put("/{id}");
		System.out.println("Putcall status code---"+resp_put.getStatusCode());
		JsonPath jspath= resp_put.getBody().jsonPath();
		
		String additionalneeds = jspath.getString("bookingdates.checkin");
		System.out.println("The put call data is ---"+additionalneeds);
					
	}
	//@Test(priority=500)
	public void delete_Call()
	{
		String tokenvalue ="token="+Authotoken_generation.tokengeneration();
		RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
		RequestSpecification reqspecdel = RestAssured
				.given()
				.pathParam("id", Data_Storage.bookingid)
				.header("Content-Type", "application/json")
				.header("Cookie",tokenvalue);
		Response resp_del =reqspecdel.delete("/{id}");
		System.out.println("========DELETE RESPONSE STATUS CODE -======="+resp_del.getStatusCode());
		
	}
	
	
	
	
	

}
