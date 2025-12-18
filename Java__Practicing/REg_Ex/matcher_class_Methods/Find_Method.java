package matcher_class_Methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Find_Method 
{
	public static void main(String [] args)
	{
		String regx ="we";
		String value ="this are we java";
		
		Pattern pp = Pattern.compile(regx);
		Matcher mm = pp.matcher(value);
		boolean bb = mm.find();
		if(bb)
		{
			System.out.println("It is matching...");
		}
	}
}
