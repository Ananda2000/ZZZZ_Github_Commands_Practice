package maps;

import java.lang.reflect.Array;
import java.util.*;


public class Map2_programming 
{
	public static void main(String [] args)
	{
		List<String> lis1 = new ArrayList<String>();
		Map<String,Object> map123 = new HashMap<String, Object>();
		map123.put("1", "value1");
		map123.put("2", "value2");
		lis1.add("1");
		lis1.add("2");
		lis1.add("3");
		map123.put("3", lis1); 
		int [] numbers = {22,33,44,55,66}; 
		map123.put("4", numbers);
		System.out.println(map123);
		
		System.out.println("// HERE AM ITERATING BASED ON OBJECT");
		for (Map.Entry string123 : map123.entrySet()) {
			if(string123.getValue() instanceof String)
			{
				System.out.print("THE VALUE IS THE STRING ---");
				System.out.println(string123.getValue());
			}
			if(string123.getValue() instanceof ArrayList)
			{
			System.out.println("tHE VALUE IS AN ARRAY LIST");	
				ArrayList aa = (ArrayList) string123.getValue();
				//System.out.println(aa);
				//System.out.println(aa.size());
				for(int i=0;i<aa.size();i++)
				{
					System.out.println(aa.get(i));
				}
				
			}
			if(string123.getValue() instanceof int[])
			{
				System.out.println("HERE ITERATING THE ARRAY");
				int[] ggg = (int[]) string123.getValue();
				System.out.println(ggg.length);
				int gg = ggg.length;
				for(int i=0;i<gg;i++)
				{
					System.out.println(ggg[i]);
				}
				/*for (int i : ggg) 
				{
					System.out.println(ggg[i]);
				}*/
			}
		}
	}

}
