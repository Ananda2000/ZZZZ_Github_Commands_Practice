package assertions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssert1
{
	@Test
	public void Method1()
	{
		SoftAssert sfA = new SoftAssert();
		int a=2,b=3;
		int sum, sub;
		sum = a+b;
		sfA.assertEquals(3, sum);
		System.out.println("After soft assert --------------------");
		sub =b-a;
		sfA.assertEquals(1, sub);
		System.out.println("after second soft assert -----");
		sfA.assertAll();
	}
	@Test
	public void Method2()
	{
		System.out.println("This is 2nd method");
	}

}
