package ScannerClass_Practicing;

import java.util.Scanner;

public class Reading_Strings 
{
	public static void main(String [] args)
	{
		Scanner scan_String = new Scanner(System.in);
		System.out.println("Enter the name ---");
		String name = scan_String.nextLine();
		System.out.println("The Enter string s ----"+name);
		scan_String.close(); // HERE WE ARE CLOSING THE SCANNER..
	}

}
