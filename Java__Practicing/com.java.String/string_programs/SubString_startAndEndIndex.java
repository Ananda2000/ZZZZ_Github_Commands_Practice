/*It returns new string object from substring, it start index include and excluding the end index. It accepts 2 parameters…
Throws IndexoutofboundExceptions, if start index less then 0 and greater then string and end index greater then string.
*/

package string_programs;

public class SubString_startAndEndIndex
{
	public static void main(String[] args)
	{
		String strmain="This is java";
		
		System.out.println("This is original String --"+strmain);
		String substr=strmain.substring(2, 7);
		System.out.println("The substring value --"+substr);
	}
}
