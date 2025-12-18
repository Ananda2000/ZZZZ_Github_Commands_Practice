// [abc] -- simple, matches a or b, or c
package characterClassesExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C1
{
	public static void main(String[] args)
	{
		String a = "ana";
		
		Pattern ptrn = Pattern.compile("[ana]");
	
		Matcher mtr =ptrn.matcher(a);
		System.out.println(mtr.find());
		System.out.println(mtr.matches());
		
	
	}

}
