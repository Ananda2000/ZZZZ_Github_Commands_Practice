// Here we are reading simple json object....

package simple_jsonData;

import org.json.JSONObject;

import com.google.gson.JsonObject;

public class Simple1
{
	public static void main(String[] args)
	{
		String str ="{\r\n" + 
				"   \"Boss\" : \"John\",\r\n" + 
				"   \"Department\" : \"Finance\",\r\n" + 
				"   \"Department id\": 3\r\n" + 
				"   }";
		
		JSONObject jsobj = new JSONObject(str);
		System.out.println(jsobj.toString());
		int size = jsobj.length();
		System.out.println("--- size ---"+size);
		System.out.println(jsobj.get("Boss"));
		System.out.println(jsobj.get("Department"));

		System.out.println(jsobj.get("Department id"));
	
	}

}
