// In this program we can conclude the use of set method....

package map1;

import java.util.HashMap;
import java.util.Map;

public class Set_Method_use 
{
	public static void main(String [] args)
	{
		Map<String, String> keysetss = new HashMap<String, String>();
		keysetss.put("999", "value9");
		keysetss.put("888", "value");
		keysetss.put("777", "value7");
		
		for (String string : keysetss.keySet()) 
		{
			System.out.println(string);
			System.out.println(keysetss.get(string));
		
		}
	}

}
