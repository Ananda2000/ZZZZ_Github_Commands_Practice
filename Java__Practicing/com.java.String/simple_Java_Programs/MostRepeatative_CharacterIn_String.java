//Most repetitive character in a string..
package simple_Java_Programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MostRepeatative_CharacterIn_String 
{
	public static void main(String [] args)
	{
		String stt = "Most repetitive character in a string..";
		
		Map<Character, Integer> gg = new HashMap<Character, Integer>();
		
		int lengg = stt.length();
		for(int i=0;i<lengg;i++)
		{
			char cc = stt.charAt(i);
			if(gg.containsKey(cc))
			{
				gg.put(cc, gg.get(cc)+1);
				
			}
			else
			{
				gg.put(cc, 1);
			}
		}
		
		int mapLength = gg.size();
		int vvs = 0;
		char cc = 0;
		for (Entry<Character, Integer> vals : gg.entrySet()) 
		{
			
			
			int vv = vals.getValue();
			if(vv >= vvs)
			{
				cc=vals.getKey();
				vvs = vv;
			}
		}
		
		System.out.println("The Most repetative characeters in string -- "+ cc +" Its count is - "+vvs);
		
		
		System.out.println(gg);
	}

}
