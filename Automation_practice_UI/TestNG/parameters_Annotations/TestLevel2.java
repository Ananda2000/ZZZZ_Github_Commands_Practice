package parameters_Annotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestLevel2 
{
	@Parameters({"veggs"})
	@Test
	public void Fruits(String vname)
	{
	
		System.out.println("this is at test level 2 --"+vname);
	}
	
	
	@Parameters({"veggs1"})
	@Test
	public void veggis1(String vname)
	{
		System.out.println("The veggis names"+vname);
	}

}
