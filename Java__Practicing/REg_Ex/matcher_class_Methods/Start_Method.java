package matcher_class_Methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Start_Method 
{
	public static void main(String [] args)
	{
		 String regex = "geeks";
		 String stringToBeMatched = "geeksforgeeks.org";
		 Pattern pattern= Pattern.compile(regex);
		 Matcher matcher= pattern.matcher(stringToBeMatched);
		 while (matcher.find()) {
	            // Get the first index of match result
	            System.out.println(matcher.start());
	            System.out.println(matcher.end());
	        }
	}

}
