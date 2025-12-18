package basic_Java_Programs;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumberPrograminJava {
	
	public static void main (String [] args)
	{
		ArrayList<Integer> aa = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter the number");
		int n = sc.nextInt();
		int a=9;
		int b=2;
		System.out.println("This is using / symbol -- "+a/b);
		System.out.println("This is using % symbol --"+ a%b);
		
		
		int i,m=0,flag =0;
		//int n=17; // it is the number to be checked...
		
		 m=n/2;
		if(n==0||n==1)
		{  
			   System.out.println(n+" is not prime number");      
		}
		else
		{  
			   for(i=2;i<=m;i++)
			   {      
				   System.out.println("This is inside for loop iteration value of i --"+i);
			    if(n%i==0)
			    {      
			     System.out.println(n+" is not prime number");      
			     flag=1;      
			     break;      
			    }    
			   }      
			   if(flag==0) 
			   { 
				   System.out.println(n+" is prime number");
				  // aa.add(n);
				  }  
			  }//end of else  
		System.out.println(aa);
			}    
	}

																								
