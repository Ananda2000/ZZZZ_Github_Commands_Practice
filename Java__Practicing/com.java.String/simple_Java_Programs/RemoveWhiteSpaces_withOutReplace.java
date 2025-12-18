//Write a Java Program to remove all white spaces from a string without using replace().

package simple_Java_Programs;

public class RemoveWhiteSpaces_withOutReplace 
{
	//public static String after_removing_whiteSpace(String gg)
	public static String after_removing_whiteSpace(String gg)
	{
		StringBuffer stb = new StringBuffer();
		int sizess = gg.length();
		for(int i=0;i<sizess;i++)
		{
			char cc = gg.charAt(i);
			if(!Character.isWhitespace(cc))
			{
				stb = stb.append(cc);
			}
		}
		return stb.toString();
	}
	


	public static void main(String [] args)
	{
		String strr = "this is for testing";
	
		String mm =after_removing_whiteSpace(strr);
		System.out.println(mm);
		
	}

	
}
