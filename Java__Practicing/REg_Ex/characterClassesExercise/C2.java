//[^abc]--Any character except a, b, or c (negation)

package characterClassesExercise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C2 
{
	public static void main(String [] args)
	{
		String str ="aaaan";
		String REGEX ="[^abc]";
		Pattern ptr = Pattern.compile(REGEX);
		Matcher mtr = ptr.matcher(str);
		
		boolean bln = mtr.find();
		System.out.println(bln);
		
		System.out.println(Pattern.matches(str, REGEX));
		
		
	}

}
