// Here we are using the get() method in Map/hashmap ...

package map1;

import java.util.HashMap;
import java.util.Map;

public class Get_Method_use 
{
	public static void main(String [] args)
	{
		Map<String, String> str = new HashMap<String, String>();
		
		str.put("555", "get1");
		str.put("556", "get2");
		
		
		char[] aa =str.get("555").toCharArray();
		for (char c : aa) 
		{
			System.out.println(c);
		}
		
		
	}

}
