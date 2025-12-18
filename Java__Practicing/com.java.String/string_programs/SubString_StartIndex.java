/*1.	Public String substring(int startindex) ---
It returns the new string object from the string, and it starts from specified index [inclusive]. It accepts only 1 parameter..
Throw indexoutoffboundexception, if start index less then zero or more then length of string.
*/

package string_programs;

public class SubString_StartIndex 
{
	public static void main(String [] args)
	{
		String str ="THIS IS JAVA";
		System.out.println("This is full string --"+str);
		String sub = str.substring(6);
		System.out.println("after Substring --"+sub);
		System.out.println(str);
		
	}

}
