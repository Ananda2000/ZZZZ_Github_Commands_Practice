// HERE WE ARE READING THE INTEGER VALUES FROM SCANNER CLASSS...

package ScannerClass_Practicing;

import java.util.Scanner;

public class Reading_Integers 
{
	public static void main(String [] args)
	{
		Scanner scan_int = new Scanner(System.in);
		System.out.println("Please enter the Number a -");
		int a =scan_int.nextInt();
		
		Scanner scan_intb = new Scanner(System.in);
		System.out.println("Enter the 2nd nuber b --");
		int b = scan_intb.nextInt();
		System.out.println( a+b +"-the sum of a and b numbers is ---");
		
		scan_int.close();
		scan_intb.close();
		
		Scanner scn = new Scanner(System.in);
		
	}
	

}
