package parameters_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuiteLevel_param_sub 

{

	@Parameters({"a","b"})
	@Test
	public void subtraction_ofNumber(int c, int d)
	{
		int result = c-d;
		System.out.println("The subtraction of numbers ---"+ result);
	}
}
