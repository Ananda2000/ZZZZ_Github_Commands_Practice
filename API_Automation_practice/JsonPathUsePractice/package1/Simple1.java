// READ SIMPLE JSON , DISPLAY USING JSONPATH.....

/*  BELOW IS THE JSON...

{
"score_in_subjects":[99,84,67]
}*/

package package1;

import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class Simple1 {

	@Test
	public void read_json() {
		String json = "{\r\n" + "\"score_in_subjects\":[99,84,67]\r\n" + "}";
		// HERE READING THE JSON OBJECT ARRYA .. AND DISPLAYING THE DATA...
		JsonPath jspath = JsonPath.from(json);
		List<Integer> gg = jspath.getList("score_in_subjects");
		System.out.println(gg);

		System.out.println("-----------------------------------------------------------");
		for (Integer integer : gg) {
			System.out.println(integer);
		}

	}

}
