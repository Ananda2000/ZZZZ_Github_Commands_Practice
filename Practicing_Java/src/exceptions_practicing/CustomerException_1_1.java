package exceptions_practicing;

import java.util.Scanner;

public class CustomerException_1_1 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("please enter the age -");
		int a = sc.nextInt();
	
		if(a<18) 
		{
		try {
			throw new CustomeException_1("This is business exception");
		}
		
		catch (CustomeException_1 ex) {
			System.out.println("Caught");
			//System.out.println(ex.getMessage());
			System.out.println(ex);
		//ex.printStackTrace();
			
		}
	}

	}
}
