package pattern_Class;

import java.util.regex.Pattern;

public class Matches_method_program 
{
	public static void main(String [] args)
	{
		String regx = "(.*)(is)(.*)?";
		String char_sequence ="this is anand here is";
		
		boolean aa=Pattern.matches(regx, char_sequence);
		
		if(aa)
		{
			System.out.println("This is matching");
		}
		else
		{
			System.out.println("It is not matching...");
		}
		
	}

}
