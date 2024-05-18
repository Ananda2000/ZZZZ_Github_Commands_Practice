// IN THIS CLASS WE ARE IMPLEMETING THE DISMISS() METHOD IN ALERT CLASS. TO CANCEL THE ALERT ON BROWSER..

package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DismissMethod 
{
	@Test
	public void Use_Of_Dismiss_Method() throws InterruptedException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// THIS IS EX-PATH OF ALERT MESSAGE...
		WebElement ele = driver.findElement(By.xpath("//input[@id='name']/following-sibling::input[@id='confirmbtn']"));
		ele.click();
		Thread.sleep(5000);
// HERE WE ARE IMPLEMENTING THE DISMISS OF ALERT MESSAGE..
		driver.switchTo().alert().dismiss();	
	}

}
