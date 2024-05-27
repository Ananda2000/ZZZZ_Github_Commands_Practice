// we are retrying iretry analyzer..

package reTry_FailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Retry_using_IRetryAnalyzer 
{
	@Test(retryAnalyzer=RetryAnalyzer_1.class)
	public void method1_Fail()
	{
		System.out.println("Failed -- IretryAnalyzer used for rerun");
		Assert.fail();
	}
	
	
/*	@Test
	public void method1_pass1()
	{
		System.out.println("pass method ");
		Assert.assertEquals(true, true);
	}
*/

}
