package attributes_Examples;

import org.testng.annotations.Test;

public class Dependson_Attribute 
{
	@Test
	public void Dependson1()
	{
		System.out.println("This is 1st method");
	}
	
	@Test(dependsOnMethods="Dependson1")
	public void ADependson2()
	{
		System.out.println("This is 2nd method Depends on 1st method..");
		
	}
	
}
