package dataProvider_Annotation;

import org.testng.annotations.Test;

public class TestClasss1 

{

	@Test(dataProvider ="ananda1", dataProviderClass = DataProvider_For_TestClass1.class)
	public void display_dataprovider( String val1)
	{
		System.out.println(val1);
		
	}
	
	
	@Test(dataProvider="MultipalParamters", dataProviderClass=DataProvider_For_TestClass1.class)
	public void Display_multipalParamters(int a, int b , int c)
	{
		System.out.println(a+b+c);
		
	}
}
