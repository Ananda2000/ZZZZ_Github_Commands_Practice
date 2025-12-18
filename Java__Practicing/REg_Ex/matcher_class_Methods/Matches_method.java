package matcher_class_Methods;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matches_method {
	
	public static void main(String [] args)
	{
		String input ="hello123";
		Pattern pattern = Pattern.compile("^[a-z]+\\d{3}$");
		Matcher mm = pattern.matcher(input);
		boolean bb = mm.matches();
		System.out.println(bb);
	}

}
