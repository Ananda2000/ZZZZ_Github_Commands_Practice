// REVERSE THE WORDS IN GIVEN STRING....

package interview;

public class Reverse_wordsInString 
{
	public static void main(String [] args)
	{
		String str1 = "This is java";
		
		String str2 = reversing_words(str1);
		System.out.println(str2 +"---");
	}
	
	public static String reversing_words(String str)
	{
		System.out.println(str +"----------------");
		String [] aa = str.split(" ");
		
		String str3="" ;
		int len= aa.length;
		for(int i=len-1;i>=0;i--)
		{
			
			str3 = str3+aa[i]+" ";
			
		}
		
		return str3;
		
	}

}
