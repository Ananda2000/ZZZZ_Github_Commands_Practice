package attributes_Examples;

import org.testng.annotations.Test;

public class Priority_Attribute 
{
	@Test (priority=2)
	public void priority_m3()
	{
		System.out.println("This is 3rd priority");
		
	}
	@Test(priority=1)
	public void priority_m2()
	{
		System.out.println("This is 2nd priority --");
	}
	
	@Test
	public void prority()
	{
		System.out.println("This is no prority -- This is 1st");
	}
}
