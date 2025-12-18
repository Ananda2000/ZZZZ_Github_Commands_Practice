
// IN THIS PROGRAM WE ARE USING COMPILE AND MATCHER METHODS WORKING..
package pattern_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compile_matcher_Methods 
{
	public static void main(String [] args)
	{
		String stt = "This is testing...";
		System.out.println("This is testing...");
		Pattern pp = Pattern.compile(".z"); // HERE CHECKING FOR -VE CASES...
		Matcher mm = pp.matcher(stt);
		Pattern p1 = Pattern.compile(".i"); // HERE CHECKING FOR +VE CASE..
		Matcher mt = p1.matcher(stt);
		boolean kk = mm.find();
		System.out.println(kk);
		System.out.println(mt.find());
		
		
	}

}
