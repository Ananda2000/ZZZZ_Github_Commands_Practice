// THIS CLASS SHOW HOW THE SPLIT METHOD IN PATTERN CLASS USEFUL...
package pattern_Class;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Split_Method 
{
	public static void main(String [] args)
	{
		String regex ="is";
		String value ="This a is anand is Testis z";
		Pattern pp = Pattern.compile(regex);
		String[] mm = pp.split(value);
		for (String afterSplit : mm) {
			System.out.println(afterSplit);
		}
	}
}
