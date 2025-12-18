package basic_Java_Programs;

import java.util.ArrayList;
import java.util.List;

//import org.apache.poi.ss.formula.ptg.EqualPtg;

public class REproduce_NullpointerException 
{
	public static void main(String [] args)
	{
	
		String aa = null ;
		if(aa.equals("aaa"))
		{
			System.out.println("this si equal");
		}
		else
		{
			System.out.println("This is not equal");
		}
		
	}

}
