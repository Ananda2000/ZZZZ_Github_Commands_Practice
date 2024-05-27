package reTry_FailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Manualretry_failedTestcases
{
	@Test
	public void manual_fail()
	{
		System.out.println("This is assert failed here..");
		Assert.assertEquals(true, false);
	}

	
	@Test
	public void manual_pass()
	{
		System.out.println("this is assert pass");
		Assert.assertEquals(true, true);
	}
}
