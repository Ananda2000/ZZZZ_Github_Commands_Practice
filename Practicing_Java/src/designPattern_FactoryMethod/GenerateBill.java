package designPattern_FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill 
{
	public static void main(String[] args) throws NumberFormatException, IOException
	{
		GetFactoryPlan gft = new GetFactoryPlan();
		System.out.print("please enter the plan");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
			String planName = br.readLine();
		
		System.out.println("----------------------------");
		System.out.print("Enter the number of units");
		
		int units = Integer.parseInt(br.readLine());
		Plan p = GetFactoryPlan.getPlan(planName);
		System.out.println("Bill Amount for"+ planName+"of units"+units);
		p.getrate();
		p.calculateBill(units);
	}

}
