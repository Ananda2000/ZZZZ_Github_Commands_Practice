package pattern_Class;

import java.util.regex.Pattern;

public class Split_method_using_Dot_Operator 
{
	public static void main(String [] args)
	{
		String regex ="\\.";
		String value ="This.a . is. anand is .Testis .z";
		Pattern pp = Pattern.compile(regex);
		String[] mm = pp.split(value);
		for (String afterSplit : mm) {
			System.out.println(afterSplit);
		}
	}

}
