// THIS IS SIMPLE ACTIVITY FOR FRAME SWITCH....

package frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple_switchFrame 
{
	@Test
	public void frameFinding()
	{
		String driverExe ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverExe);
		
		WebDriver driver = new ChromeDriver();
		
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//driver.get("https://demo.guru99.com/test/guru99home/");
		driver.manage().window().maximize();
		WebElement ele2 = driver.findElement(By.xpath("//fieldset/child::input[@id='autocomplete']"));
		ele2.sendKeys("send1");
// HERE WE ARE SWITCHING TO FRAME..
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='courses-iframe']")));
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		WebElement ele3 = driver.findElement(By.xpath("(//ul[@class='navigation clearfix']/child::li/child::a[text()='Job Support'])[1]"));
		
		ele3.click();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='mobileno']"));
		ele.sendKeys("983737");
// HERE WE ARE SWITCHING BACK TO PARENT FRAME...
		driver.switchTo().defaultContent();
		ele2.sendKeys("23232");
		
	}

}
