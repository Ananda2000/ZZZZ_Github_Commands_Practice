// Here we are reading json array ....

package simple_jsonData;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import groovyjarjarantlr.collections.List;
import io.restassured.path.json.JsonPath;

public class Simple2
{
	public static void main(String [] args)
	{
		String str =" {\r\n" + 
				"   \"Boss\" : \"John\",\r\n" + 
				"   \"Department\" : \"Finance\",\r\n" + 
				"   \"Department id\": 3,\r\n" + 
				"   \"employees\":[\r\n" + 
				"       {\r\n" + 
				"           \"name\":\"Shaun\",\r\n" + 
				"           \"age\": 30\r\n" + 
				"       },\r\n" + 
				"       {\r\n" + 
				"           \"name\":\"Paul\",\r\n" + 
				"           \"age\" : 27\r\n" + 
				"       }\r\n" + 
				"   ]\r\n" + 
				"}";
		
		JSONObject jsobj = new JSONObject(str);
		JSONArray arr = jsobj.getJSONArray("employees");
		int leng = arr.length();
		System.out.println(arr.length()+"ssssss==========");
		for(int i=0;i<leng;i++)
		{
			JSONObject jsoobj = arr.getJSONObject(i);
			int age = jsoobj.getInt("age");
			if(age == 27)
			{
				System.out.println(age);
				System.out.println(jsoobj.getString("name"));
			}
			
		}
		
	}

		
		
}
