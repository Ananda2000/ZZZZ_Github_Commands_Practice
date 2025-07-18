//HERE WE ARE READING SIMPLE JSON OBJECT.

////// EXAMPLE ONE IS ------------------------------------
/*{
"village":"Village12345",
"Name":"ananda K R",
"age":99
}*/
package package1;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Simple2 {

	@Test
	public void read_simpleJson_Object() {

		String str = "{\r\n" + "\"village\":\"Village12345\",\r\n" + "\"Name\":\"ananda K R\",\r\n" + "\"age\":99\r\n"
				+ "}";

		JsonPath jsp = new JsonPath(str);
		String village = jsp.get("village");
		String name = jsp.getString("Name");
		int age = jsp.getInt("age");
		System.out.println(village + "--" + name + "--" + age);
	}
}
