package string_programs;

public class String_Builder 
{
	public static void main(String [] args)
	{
		StringBuilder str_build = new StringBuilder("This is testing...");
		System.out.println("value before convertion using builder ---"+str_build);
		
		str_build.reverse();
		System.out.println("This is after reversing in string builder --"+str_build);
		
		String jj ="anand";
		
	}

}
