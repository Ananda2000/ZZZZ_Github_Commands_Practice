package reTry_FailedTestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_IAnnotationTransformer 
{
	@Test
	public void method1_Fail()
	{
		System.out.println("Failed -- IretryAnalyzer used for rerun");
		Assert.fail();
	}

}
