package alerts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PassingText_ToAlert 
{
	@Test
	public void SendingTextToAlertTextBox()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele = driver.findElement(By.xpath("//fieldset[@class='pull-right']/child::input[@id='name']"));
// HERE WE CANT IMPLEMENT THIS FUNCTIONALITY BECAUSE AM NOT FINDING SUCH ALERT. oNCE I FOUND SUCH ALERT I WILL IMPLEMENT.
		
		ele.click();
		driver.switchTo().alert().sendKeys("sending here");
	}

}
