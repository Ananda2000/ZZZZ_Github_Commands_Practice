// THIS METHOD WE CAN CHECK FOR SPECIFIC CONDITION/WEBELEMENT TO LOAD...

package waits_In_Selenium;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class ExplicitWait 
{
	@Test
	public void explictCondtions()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driverr = new ChromeDriver();
		driverr.navigate().to("https://mail.google.com");
		
		driverr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		WebElement emailAddress =driverr.findElement(By.xpath("//input[@name='identifier']"));
		emailAddress.sendKeys("anandakr60635@gmail.com");
		
		WebElement clicknxt = driverr.findElement(By.xpath("//span[contains(text(),'Next')]"));
		clicknxt.click();
		
		WebElement passTxtbox =driverr.findElement(By.xpath("//input[@type='password']"));
		passTxtbox.sendKeys("xxxxxxx");
		 
		WebDriverWait waittt = new WebDriverWait(driverr,30);
		waittt.until(ExpectedConditions.alertIsPresent()); // this is simple condition
		
		
		
		
		
		
	}

}
