package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.omg.CORBA.INTERNAL;

import basic_Java_Programs.hashmap;

public class User_KeySet_method 
{
	public static void main(String [] args)
	{
		
		Map<Integer, String>  mp1 = new HashMap<Integer, String>();
		mp1.put(1, "valu10");
		mp1.put(3, "value3");
		mp1.put(19, "value19");
		mp1.put(15, "value15");
		
		System.out.println("BELOW DISPLAYING THE MAP INTERFACE DIRECTLY ---------------");
		System.out.println(mp1);
		
		// Here we are taking all the key values from map
		Set<Integer> set1 = mp1.keySet();
		System.out.println("              ");
		System.out.println("BELOW WE ARE DISPLAYING ALL THE KEY VALUES FROM MAP---");
		System.out.println(set1);
		
		
		Set<Map.Entry<Integer, String>> set2 = mp1.entrySet();
		
		
		for (Entry<Integer, String> entry : set2) {
			System.out.println(entry.getKey() +"--"+entry.getValue());
		}
		
		
		
		
	}

}
