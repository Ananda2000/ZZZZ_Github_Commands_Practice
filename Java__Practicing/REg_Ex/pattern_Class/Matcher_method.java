// Here we implement matcher Method of pattern class..

package pattern_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcher_method {

	public static void main(String [] args)
	{
		String mattern ="java";
		Pattern pp = Pattern.compile(mattern);
		Matcher mm = pp.matcher("this is java");
		
		boolean aa=mm.find();
		if(aa)
		{
			System.out.println("This is matching");
		}
		else
		{
			System.out.println("This is not matching.");
		}
	}
}
