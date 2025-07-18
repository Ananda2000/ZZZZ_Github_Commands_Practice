package requestPayloadSchemaValidator;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class SimpleRequestPayloadSchemaValidation 
{
	
	//public static void main(String [] args)
	@Test
	public void schemavalidatin_REq_Payload()
	{
		String requestPayload ="{\r\n" + 
				"\"village\":\"Village12345\",\r\n" + 
				"\"Name\":\"ananda K R\",\r\n" + 
				"\"age\":99\r\n" + 
				"}";
	MatcherAssert
		.assertThat(requestPayload, JsonSchemaValidator.matchesJsonSchemaInClasspath("SimpleREquestPayloadSchemaValidation.json"));
	}

}
