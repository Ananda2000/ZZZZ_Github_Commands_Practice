package parameters_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

@Parameters("fruits")
@Test
public class TestLevel1 
{
	
	public void vegis(String fru)
	{
		System.out.println("The vegitables are ---"+fru);
	}

}
