// HERE WE ARE PRACTICING SWITCH STATEMENT WORKING...
package basic_Java_Programs;

import java.util.Scanner;

public class Switch_condition1 
{
	public static void main(String [] args)
	{

		System.out.println("please enter the number");
		Scanner scna = new Scanner(System.in);
		int num =scna.nextInt();
		switch (num) {
		case 2: System.out.println("The number is --"+num);
			
			break;
		case 5 : System.out.println("The number is --"+num);
			break;
		case 9 : System.out.println("The number is --"+num);
		default:
			System.out.println("It is not a numbers---");
			break;
		}
	}

}
