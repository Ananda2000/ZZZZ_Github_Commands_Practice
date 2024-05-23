package listers_in_TestNg;

import org.testng.Assert;
import org.testng.annotations.Test;


public class Listers_At_Suite_Level 
{

	@Test
	public void Method11111()
	{
		System.out.println("this is method1");
		Assert.assertEquals(1, 1);
	}

	
		@Test
		public void Method22222_fail()
		{
			System.out.println("This is second method failing");
			Assert.assertEquals(2, 3);
		}
}
