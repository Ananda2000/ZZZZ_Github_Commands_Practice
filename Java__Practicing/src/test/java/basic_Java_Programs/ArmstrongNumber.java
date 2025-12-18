package basic_Java_Programs;

import java.util.Scanner;

public class ArmstrongNumber 
{

	public static int isArmstrong(int a)
	{
		int num =a;
		int count=0;
		int add=0;
		while (num != 0) {
		      // num = num/10
		      num /= 10;
		      System.out.println("The reminder is --"+num);
		      ++count;
		      
		      
		    }
		int modu=a;
		while(modu!=0)
		{
		 modu=modu%10;
		int b=count;
		int sum1=0;
			while (b>0)
			{
				
			}
		  
		}
		
		return count;
		
		
	}
	
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number.");
		String aa =sc.next();
		int a =Integer.parseInt(aa);
		int count1 =isArmstrong(a);
		System.out.println("The total numbers are --"+count1);

		System.out.println("This is updated in armstrong number on 14-july-2023");

		System.out.println("THIS IS ARMSTRONG NUMBER --- TESTING");
		

		
	}
}
