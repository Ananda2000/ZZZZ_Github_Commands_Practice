package basic_Code_Practice;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Authotoken_generation 
{
	public static String tokengeneration()
	{
		String token;
		String cred="{\r\n" + 
				"    \"username\" : \"admin\",\r\n" + 
				"    \"password\" : \"password123\"\r\n" + 
				"}";
		RestAssured.baseURI="https://restful-booker.herokuapp.com/auth";
		RequestSpecification reqspec = RestAssured.given().header("Content-Type", "application/json").body(cred);
		
		Response resp = reqspec.post();
		System.out.println("the status code --"+resp.getStatusCode());
		JsonPath sss =resp.getBody().jsonPath();
		
		token = sss.getString("token");
		System.out.println("The token is ------"+token);
		
		
		return token;
		
	}

	
	}

