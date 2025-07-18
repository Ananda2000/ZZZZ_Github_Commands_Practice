package dynamic_payload;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Dynamic_payloadUsingPojo 
{
	
	
	@Test
		public void dynamic_payloadpojo() throws JsonParseException, JsonMappingException, IOException
		{
			ObjectMapper objmppr = new ObjectMapper();
			
			File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_practice\\src\\test\\java\\basic_Code_Practice\\post.json");
			
			Dynamic_payloadUsingPojo1 dynamic_pojo = objmppr.readValue(fl, Dynamic_payloadUsingPojo1.class);
			dynamic_pojo.setFirstname("Here is devil---");
			
			System.out.println(dynamic_pojo.getFirstname());
			
			
			RestAssured.baseURI="https://restful-booker.herokuapp.com/booking";
			for(int i=0;i<5;i++)
			{
				Date dt = new Date();
				System.out.println(dt.getDate());
				System.out.println(dt.getMonth());
				System.out.println(dt.getHours());
				System.out.println(dt.getMinutes());
				System.out.println(dt.getSeconds());
				
				System.out.println(dt.getTime());
				dynamic_pojo.setFirstname("Ananda"+i);
				
			
			RequestSpecification req_spec = RestAssured
											.given()
											.header("content-type", "application/json")
											.body(dynamic_pojo);
			Response resp = req_spec.post();
			System.out.println(resp.body().asString());
			}
			
		}
	    	
		
	

}
