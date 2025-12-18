// Verify the given string is palindrome or not...

package basic_Java_Programs;

import java.util.Scanner;


public class PalindromeString {
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		//Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string here -- ");
		String a =sc.nextLine();
		
		StringBuffer sb = new StringBuffer(a);
		sb.reverse();	
		
		if(a.equals(sb))
		{
			System.out.println(a+"Is a palindrome -------------");
			
		}
		else {
			System.out.println(a +" -- Is not a palindrome --");
		}
		
				
		
	}

}
