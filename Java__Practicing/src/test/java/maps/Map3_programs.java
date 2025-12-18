// THIS PROGRAM MAP VALUES ARE OBJECTS., TO PARSE IT WE ARE CHECING ALL THE VALUES AND PARSING..


package maps;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basic_Java_Programs.hashmap;

public class Map3_programs 
{
	public static void main(String [] args)
	{
		
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		Map<Integer, Object>  map1= new HashMap<Integer, Object>();
		map1.put(1, "ananda");
		int [] aaa = new int[5];
		for(int p=0;p<aaa.length;p++)
		{
			aaa[p]=p;
		}
		map1.put(2, aaa);
		
		int aa=map1.size();
		int i=1;
		while(i<=aa)
		{
			//System.out.println(map1.get(i) );
			
			
			if(map1.get(i) instanceof String)
			{
				System.out.println("THIS IS INSTACE OF OBEJCT..");
				System.out.println(map1.get(i));
			}
			/*if(map1.get(i) instanceof ArrayList)
			{
				System.out.println("THIS IS INSTANCE OF ARRAY");
				System.out.println(map1.get(i) );
				List<Integer> aaa1 = (List<Integer>) map1.get(i);
				for (Integer integer : aaa1) {
					System.out.println(integer);
				}
*/
			if(map1.get(i) instanceof int[])
			{
				System.out.println("it is instance of arrays");
				for (int q : aaa) 
				{
					System.out.println(q);
				}
	
			}
		i++;
		}
		
	}
	}
