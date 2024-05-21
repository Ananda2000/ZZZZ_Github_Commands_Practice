package attributes_Examples;

import org.testng.annotations.Test;

public class Enabled_Attribute 
{
// Below method should not display the data in output SKIPPING this...
	@Test(enabled=false)
	public void Method1()
	{
		System.out.println("This is we are going disable ---");
	}

	@Test
		public void Method2()
		{
			System.out.println("Only this method is going to execute ---");
		}
}
