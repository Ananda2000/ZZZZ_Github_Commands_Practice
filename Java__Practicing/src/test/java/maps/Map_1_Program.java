package maps;

import java.util.HashMap;
import java.util.Map;

public class Map_1_Program 
{
	public static void main(String[] args)
	{
		Map<String, String> map1 = new HashMap<String, String>();
		map1.put("1", "abc");
		map1.put("5", "soos");
		map1.put("6", "value-6");
		
		
		for (Map.Entry<String,String> map : map1.entrySet())
		{
			System.out.println(map.getValue() +":"+map.getKey());
		}
	}

}
