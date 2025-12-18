// Verify the given number is palindrome or not ...

package basic_Java_Programs;

import java.util.Scanner;

public class PalindromeProgram {
	
	public static void main (String [] args)
	{
		int temp,sum=0;
		int reminder;
		Scanner sc= new Scanner(System.in); 
		System.out.print("please enter the number ---");
		int a = sc.nextInt();
		temp=a;
		while (a>0)
		{
			reminder = a%10;
			sum = (sum*10)+reminder;
			a=a/10;
		}
		
		if(temp==sum)
		{
			System.out.println("The number is palindrome --"+sum);
		}
		else {
			System.out.println("The number is not palindrom ---"+temp);
		}
	}

}
