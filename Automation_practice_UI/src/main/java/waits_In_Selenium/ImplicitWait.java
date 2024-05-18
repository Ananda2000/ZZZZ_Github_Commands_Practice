// IMPLEMENTING IMPLICIT WAITSS.......

package waits_In_Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ImplicitWait
{
	@Test
	public void implicitwaitsss()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
// browser launching...
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement HidebuttonClicking = driver.findElement(By.xpath("//input[@value='Show']/preceding::input[@value='Hide']"));
		HidebuttonClicking.click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ele = driver.findElement(By.xpath("//input[@id='show-textbox']/following::input[@id='displayed-text']"));
		
		boolean bb =ele.isDisplayed();
		
		if(bb==true)
		System.out.println("The textbox is displayed....");
		
		
		
	}

}
