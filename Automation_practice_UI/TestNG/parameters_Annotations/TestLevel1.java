package parameters_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLevel1 
{

@Parameters("fruits")
@Test
	public void vegis(String fru)
	{
		System.out.println("The vegitables are ---"+fru);
	}


@Parameters("fruits1")
@Test
	public void vegis1(String fru)
	{
		System.out.println("The vegitables are ---"+fru);
	}



}
