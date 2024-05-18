package parameters_Annotations;

import javax.annotation.ParametersAreNonnullByDefault;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuitLevel_param_sum
{
	
	@Parameters({"a","b"})
	@Test
	public void sum_number(int c, int d) 
	{
		int result = c+d;
		System.out.println("The sum of 2 numbers ---"+result);
	}

}
