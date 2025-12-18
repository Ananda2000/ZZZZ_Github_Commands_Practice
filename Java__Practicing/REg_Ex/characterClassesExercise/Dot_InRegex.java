package characterClassesExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Dot_InRegex
{
	
		public static void main(String [] args)
		{
			/*String Regex =".s";
			String one_dot = "as";
			
			Pattern ptr = Pattern.compile(Regex);
			Matcher mtr = ptr.matcher(one_dot);
			
			System.out.println(mtr.matches());
		*/
			System.out.println(Pattern.matches(".s", "as")); // True
			System.out.println(Pattern.matches("..s", "aas"));// True
			System.out.println(Pattern.matches("..s", "aam"));// False
			System.out.println(Pattern.matches("..s", "as")); // False
			System.out.println(Pattern.matches("..n", "msn"));//true
		}
}
