package interview;

public class Reverse_String1 
{
	public static void main(String [] args)
	{
		String str =" this is java";
		
		StringBuffer strbuff = new StringBuffer(str);
		
		strbuff.reverse();
		
		System.out.println(strbuff);
	}

}
