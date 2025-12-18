package map1;

import java.util.HashMap;
import java.util.Map;

public class Repeated_charactersIn_String 
{
	public static void main(String [] args)
	{
		String str ="this is java";
		
		char[] aaac = str.toCharArray();
		Map<Character, Integer> strmap = new HashMap<Character, Integer>();
		
		for (char c : aaac) 
		{
			//System.out.println(c);
			if(strmap.containsKey(c))
			{
				strmap.put(c, strmap.get(c)+1);
			}
			else
			{
			strmap.put(c, 1);
			}
			
		}
		System.out.println(strmap);
		System.out.println("The reported characterss ---");
		for (Map.Entry<Character, Integer> c : strmap.entrySet()) 
		{
			int numbbb= c.getValue();
			if(numbbb>1)
			{
				System.out.print(c.getValue()+"--");
				System.out.println(c.getKey());
			}
			
		}
	}

}
