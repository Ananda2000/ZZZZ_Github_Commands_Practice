package listers_in_TestNg;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners(ListernsClass.class)
public class Class_level_Listners 
{
	@Test
	public void Method1()
	{
		System.out.println("here am failing test case method1");
		Assert.assertTrue(false);	
	}
	
	@Test
	public void Method2_passing()
	{
		Assert.assertEquals(1, 1);
	}

	
	
}
