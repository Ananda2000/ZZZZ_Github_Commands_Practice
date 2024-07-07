package basic_Code_Practice;

import java.io.IOException;

import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import io.restassured.parsing.Parser;
import io.restassured.path.json.JsonPath;

public class Value_fetchFrom_string 
{
	
	public static void main(String[] args) throws ParseException, IOException
	{
		String strr=" {\r\n" + 
				"\r\n" + 
				"              \"dashboard\": \r\n" + 
				"			  { \r\n" + 
				"			  \"purchaseAmount\": 1162,\r\n" + 
				"			  \"website\": \"Hello.com\" \r\n" + 
				"			  },\r\n" + 
				"\r\n" + 
				"              \"courses\": [\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Selenium Python\", \"price\": 50, \"copies\": 6},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Cypress\", \"price\": 40, \"copies\": 4},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"RPA\", \"price\": 45, \"copies\": 10},\r\n" + 
				"\r\n" + 
				"              { \"title\": \"Appium\", \"price\": 36, \"copies\": 7}]}\";\r\n" + 
				"\r\n" + 
				"              }\r\n" + 
				"";
		ObjectMapper objmppr = new ObjectMapper();
		
		JsonNode jsnd = objmppr.readTree(strr);
		
		//System.out.println(jsnd);
		
		JsonNode jnd1 = jsnd.get("dashboard").get("purchaseAmount");
		JsonNode jnd2 = jnd1.get("purchaseAmount");
		System.out.println(jnd1);
		
		
		JsonNode jsndarr = jsnd.get("courses");
		System.out.println(jsndarr.size());
		
		for (JsonNode jsonNode : jsndarr)
		{
			JsonNode jsarr1 = jsonNode.get("price");
			//System.out.println(jsarr1);
			int aa = jsarr1.asInt();
			System.out.println(aa);
			
			
		}
		
	}

}
