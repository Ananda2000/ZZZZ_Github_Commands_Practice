package assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_asserts 
{
	@Test(priority=1)
	public void sum()
	{
		int a=5,b=6;
		int sum=0;
		int sub;
		sum =a+b;
		System.out.println("----- am here ------------1");
//THIS IS HARD ASSERT.....
		Assert.assertEquals(3, sum);
		sub = b-a;

		System.out.println("----- am here ------------2");
// THIS IS ALSO HARD ASSERT....
		Assert.assertEquals(1, sub);

		System.out.println("----- am here ------------3");
	}
	
	@Test(priority=2)
	public void ZHardassert2()
	{
		System.out.println("this is 2nd assert method.....");
	}

}
