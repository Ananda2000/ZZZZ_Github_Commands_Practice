package interview_Programs;

import java.sql.Array;
import java.util.Arrays;

public class Second_LargestUsing_sort 
{
	
	public static void main(String [] args)
	{
		int [] gg = {6,2,1,7};
		
		Arrays.sort(gg);
		System.out.println(gg[gg.length-2]);
		
	}

}
