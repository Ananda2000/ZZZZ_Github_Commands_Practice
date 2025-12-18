// This program will help to find the alphabets and number in the given string....
package interview_Programs;

import java.util.Scanner;

public class Find_onlyCharatersAndNumbers_inString 
{
	public static void main(String [] args)
	{
		//String ss ="lksdS###S383";
		Scanner ssc= new Scanner(System.in);
		System.out.println("please enter the string---");
		String ss=ssc.nextLine();
		
		String gg = "" ;
		
		int aa = ss.length();
		char cc;
		gg.trim();
		for(int i=0;i<aa;i++)
		{
			if(Character.isAlphabetic(ss.charAt(i))== true)
			{
				
				
					gg = gg+ss.charAt(i);	
				
				
			}
			if(Character.isDigit(ss.charAt(i))==true)
			{
				gg = gg+ss.charAt(i);
			}
		}
		
		System.out.println("The given strings are---"+gg);
	}

}
