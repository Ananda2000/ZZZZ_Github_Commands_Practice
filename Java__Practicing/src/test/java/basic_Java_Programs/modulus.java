package basic_Java_Programs;

import java.util.Scanner;

public class modulus 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("please enter the value ---");
		String aa = sc.next();
		int ab= Integer.parseInt(aa);
		int temp =ab;
		int digit =0;
		while (temp>0)
		{
			temp =temp/2;
		
		System.out.println("The value is --"+temp );
		//System.out.println("used % value --"+ temp%2);
		digit++;
		System.out.println("The digits are -- "+digit);
		System.out.println( "----------------------------------");
		
		
		
	}

}
}