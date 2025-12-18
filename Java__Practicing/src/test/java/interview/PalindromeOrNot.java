package interview;

public class PalindromeOrNot 
{
	public static void main(String [] args)
	{
		
		String s ="nitinkskld";
		StringBuffer strbuff = new StringBuffer(s);
		
		 strbuff.reverse();
		boolean aa =s.contains(strbuff);
		if(aa == true)
		{
			System.out.println("Striing "+s+" is palindrome");
		}
		else
		{
			System.out.println("Striing "+s+" Not palindrome");

		}
		
	}

}
