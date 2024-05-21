// THIS METHOD HELPS IN TESTING THE [TIMEOUT] ATTRIBUTE...

package attributes_Examples;

import org.testng.annotations.Test;

public class Timeout_Attribute 
{

	@Test(timeOut=5000)
	public void timeoutMethod() throws InterruptedException
	{
		System.out.println("Before sleeping");
		Thread.sleep(10000);
	}

	@Test
	public void withoutTimeout()
	{
		System.out.println("this is without timeout");
	}
}
