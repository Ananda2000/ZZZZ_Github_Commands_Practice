// We are reading simple 

package package1;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class SimpleJsonpathReading {
	@Test
	public void readjsonpath() {
		String str = "{\r\n" + "     \"lastName\":\"Smith\",\r\n" + "    \"address\":{\r\n"
				+ "        \"streetAddress\":\"21 2nd Street\",\r\n" + "         \"city\":\"New York\",\r\n"
				+ "         \"state\":\"NY\",\r\n" + "         \"postalCode\":10021\r\n" + "    },\r\n"
				+ "     \"age\":25,\r\n" + "     \"phoneNumbers\":[\r\n" + "            {\r\n"
				+ "            \"type\":\"home\", \"number\":\"212 555-1234\"\r\n" + "            },\r\n"
				+ "         {\r\n" + "            \"type\":\"fax\", \"number\":\"212 555-1234\"\r\n" + "         }\r\n"
				+ "     ],\r\n" + "     \"firstName\":\"John\"\r\n" + "}\r\n" + "";

		// JsonPath jspth = new JsonPath(str);
		JsonPath jspth = JsonPath.from(str);

		System.out.println("this is testing");
		String aa = jspth.get("address.city");
		System.out.println(aa);

		List<String> aaaa = jspth.getList("phoneNumbers");
		System.out.println(aaaa.size());

		Map<Object, Object> kk = jspth.getMap("phoneNumbers[0]");
		System.out.println("object --------" + kk);
		for (Entry<Object, Object> iterable_element : kk.entrySet()) {
			System.out.println("Key --" + iterable_element.getKey());
			System.out.println("value --" + iterable_element.getValue());

		}

		List<String> typess = jspth.get("phoneNumbers.type");
		int leng = typess.size();
		for (String string : typess) {
			System.out.println(typess);
		}

	}

}
