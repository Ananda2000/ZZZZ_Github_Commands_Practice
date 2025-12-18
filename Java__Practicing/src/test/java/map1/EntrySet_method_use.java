package map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import basic_Java_Programs.hashmap;

public class EntrySet_method_use 
{
	public static void main(String [] args)
	{

		Map<String, String> entrysetHash = new HashMap<String, String>();
		entrysetHash.put("111", "anand");
		entrysetHash.put("222", "anand2");
		entrysetHash.put("333", "anand3");
		
		Set<Entry<String, String>> aa= entrysetHash.entrySet();
		
		System.out.println(aa);
		for (Entry<String, String> entry : aa) 
		{
			System.out.print(entry.getKey()+"--");
			System.out.println(entry.getValue());
			
		}
		System.out.println("This is reading after entry set...");
		
		for(Map.Entry aa11 :entrysetHash.entrySet())
		{
			System.out.println(aa11.getKey());
		}
		
	}

}
