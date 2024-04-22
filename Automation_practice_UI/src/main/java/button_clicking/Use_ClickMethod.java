package button_clicking;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class Use_ClickMethod 
{
	@Test
	public void clickmethod()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement ele = driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
// HERE WE ARE USING CLICK METHOD ON BUTTON...
			ele.submit();
			String text = driver.findElement(By.xpath("//a[contains(text(),'Find your account and log in.')]")).getText();
			Assert.assertEquals(text, "Find your account and log in.");
			
			
		
	}

}
