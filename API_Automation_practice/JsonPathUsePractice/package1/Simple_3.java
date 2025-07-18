// NESTED JSON OBJECT READING......

//---------------BELOW IS SIMPLE JSON OBJECT------------------- 

/*{
  "identification" :  {
        "name" : "James",
        "ssn": "ABC123552"
    }
}
*/

package package1;

import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Simple_3 {

	@Test
	public void Read_json_3() {
		String str = "{\r\n" + "  \"identification\" :  {\r\n" + "        \"name\" : \"James\",\r\n"
				+ "        \"ssn\": \"ABC123552\"\r\n" + "    }\r\n" + "}";

		JsonPath jsp = new JsonPath(str);

		System.out.println(jsp.getString("identification"));
		System.out.println(jsp.getString("identification.name"));
		Map<Object, Object> jj = jsp.getMap("identification");

		System.out.println(jj.size());

		for (Entry<Object, Object> zz : jj.entrySet()) {
			System.out.println(zz.getKey() + "---" + zz.getValue());

		}
	}

}
