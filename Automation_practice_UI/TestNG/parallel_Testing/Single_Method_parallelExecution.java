package parallel_Testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Single_Method_parallelExecution 
{
	@Test(threadPoolSize=5, invocationCount=5,timeOut=5000)
	public void testingin_MultiThread()
	{
		System.out.println("this is 1sm-ZZ---"+Thread.currentThread().getId());
		String driverpath =("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\msedgedriver.exe");
		System.setProperty("webdriver.edge.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");

	}

}
