//Here we are using SUBMIT METHOD TO CLICK ON BUTTON.

package button_clicking;

import org.checkerframework.dataflow.qual.TerminatesExecution;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Using_SubmitMethod 
{
	@Test
	public void submit_method()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
// HERE WE ARE USING SUBMIT METHOD TO CLICK ON BUTTON...
		ele.submit();
		String text = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]")).getText();
		Assert.assertEquals(text, "Find your account and log in.");
		
		
		
	
	}

}
