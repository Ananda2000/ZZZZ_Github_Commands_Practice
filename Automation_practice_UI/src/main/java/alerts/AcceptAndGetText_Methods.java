// HERE WE ARE IMPLEMENTING HOW TO USE THE ACCEPT and GETTEXT() METHOD IN SELENIUM ALERTS...

package alerts;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AcceptAndGetText_Methods 
{
	@Test
	public void Alert_AcceptMethod()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driverr = new ChromeDriver();
		
		driverr.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
		
		driverr.manage().window().maximize();
		WebElement ele = driverr.findElement(By.cssSelector("#alertbtn"));
		ele.click();
		String alert_txt =driverr.switchTo().alert().getText();
		System.out.println("--------------------- The text on alert message is ---------------");
		System.out.println(alert_txt);
		driverr.switchTo().alert().accept();
		driverr.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		//WebDriverWait expliWait = new WebDriverWait(driverr, 10);
		
	}

}
