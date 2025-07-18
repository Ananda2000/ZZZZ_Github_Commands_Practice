// POSTED THIS QUESTION IN STACK OVER FLOW OBSERVE THE ANSWER AND GET IT CLARIFY...


package simple_jsonData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.json.JSONArray;
import org.json.JSONObject;

import io.restassured.path.json.JsonPath;

public class Simple3 
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
		
		JsonPath jspath = new JsonPath(str);
		System.out.println(jspath.get("employees.age"));
		System.out.println(jspath.getList("employees"));
		List<Object> aaa =  jspath.getList("employees");
		System.out.println(aaa.size());
		
		for(int i=0;i<aaa.size();i++)
		{
			System.out.println("------------"+aaa.get(i).toString());
			Map ggg = (Map) aaa.get(i);
			System.out.println(ggg);
			int ages =(Integer) ggg.get("age");
			System.out.println(ages);
			if(ages==27)
			{
				System.out.println(ggg.get("name"));
			}
			
			
		}
		
		
		/*
		ArrayList aaa1=  (ArrayList) jspath.getList("employees");


		for (Object object : aaa1) {
			
			System.out.println(object);
			
			System.out.println("-----");
		}*/
		
	}

}
