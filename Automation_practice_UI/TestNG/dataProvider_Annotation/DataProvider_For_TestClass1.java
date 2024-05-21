package dataProvider_Annotation;

import org.testng.annotations.DataProvider;

public class DataProvider_For_TestClass1 
{
	
	
	@DataProvider(name ="ananda1")
	public static Object[][] Dp_method()
	{
		
		return new Object[][] {{"1st"},{"2nd"},{"3rd"}};
		
	}

	
	
	@DataProvider(name="MultipalParamters")
	public static Object[][] DP_multipleParameters()
	{
		return new Object[][] {{1,2,3},{4,5,1}};
	}
	{
		
	}
}
