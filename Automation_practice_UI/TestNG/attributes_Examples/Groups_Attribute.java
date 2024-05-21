package attributes_Examples;

import org.testng.annotations.Test;

public class Groups_Attribute 
{
	@Test(groups="G1")
	public void method_G1()
	{
		System.out.println("this is belongs to gropu G1");
	}
	
	@Test(groups="G1")
	public void method_G2()
	{
		System.out.println("This is belongs to group G2");
	}
	@Test
	public void Method_G3()
	{
		System.out.println("This is not belongs to any group--");
	}

}
