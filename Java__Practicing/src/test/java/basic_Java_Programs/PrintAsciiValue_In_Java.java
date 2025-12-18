//10) How to Print ASCII Value in Java

package basic_Java_Programs;

import java.util.Scanner;

public class PrintAsciiValue_In_Java
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the number :");
		char cc = sc.next().charAt(0);
		int aa = cc;
		
		System.out.println("The ASCCI value for the character -"+(char)aa+" - "+aa);
	}
}
