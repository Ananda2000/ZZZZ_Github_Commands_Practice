// REVERSING THE GIVEN STRING WITHOUT USING IN-BUILT METHOD...

package interview;

public class Reverse_String 
{

	public static void main(String [] args)
	{
		String str ="ananda k r";
		
		int leng = str.length();
		
		for (int i=leng-1; i>=0;i--) 
		{
			System.out.println(str.charAt(i));
			
		}
	}
}
