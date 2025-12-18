package ScannerClass_Practicing;

import java.util.Scanner;

public class looping_UsingScanner 
{
	public static void main(String [] args)
	{
		Scanner scanLoop = new Scanner(System.in);
		double sum=0;
		System.out.println("please enter the number ---- to add");
		while (scanLoop.hasNextDouble())
		{
			double num = scanLoop.nextDouble();
			sum = (sum+num);
			System.out.println("Enter number to continue or others characters to skip");
		}
		System.out.println("The sum is ---"+sum);
	}

}
