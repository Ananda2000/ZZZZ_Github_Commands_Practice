package keyBoard_And_Mouse_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ContextClick 
{
	@Test
	public void contextClickHandling() throws AWTException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chomre.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
// Creating the actions class object.....
		
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.cssSelector("a.blinkingText"));
		
		act.contextClick(ele).build().perform();
	// Here we are selecting the option after right click
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_DOWN);
		rbt.keyRelease(KeyEvent.VK_DOWN);
		rbt.keyPress(KeyEvent.VK_ENTER);
		rbt.keyPress(KeyEvent.VK_ENTER);
		
	
	}

}
