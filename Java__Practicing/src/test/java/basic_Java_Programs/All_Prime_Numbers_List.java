package basic_Java_Programs;

import java.util.Scanner;

public class All_Prime_Numbers_List 
{
	public static void main (String[] args)
	   {		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Please Enter Number -- ");
		int numb = sc1.nextInt();
	       int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";
	 

	       for (i = 1; i <= numb; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		  {
	             if(i%num==0)
		     {
	 		counter = counter + 1;
	 	
		     }
		  }
		  if (counter ==2)
		  {
		     //Appended the Prime number to the String
			  System.out.println("The i value is --"+i);
		     primeNumbers = primeNumbers + i + " ";
			 
		  }	
	       }	
	       System.out.println("Prime numbers from 1 to "+ numb+ " are :");
	    
	      System.out.println(primeNumbers);
	      System.out.println("This is new line added here");
	      System.out.println("THIS IS ANAND HERE , EDITED ON 14-JULY-23");
	   }
	
}
