package schema_Validator;

import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.io.InputStream;

import org.testng.annotations.Test;

import com.github.fge.jsonschema.main.JsonValidator;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Postcall_SchemaValidator 
{
	@Test
	public void schema_Validator1()
	{
		File fl = new File("C:\\Users\\ANANDA K R\\eclipse-workspace\\API_Automation_practice\\src\\test\\java\\basic_Code_Practice\\post.json");
				int bookingiddd=RestAssured
			.given().header("Content-Type", "application/json")
			.body(fl)
			.when()
			.post("https://restful-booker.herokuapp.com/booking")
			.then()
			.log().body()
			.assertThat().statusCode(200)
			.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("ResponseSchema.json"))
			.extract().path("bookingid");
			System.out.println(bookingiddd);
			
			
		
		
	}

}
