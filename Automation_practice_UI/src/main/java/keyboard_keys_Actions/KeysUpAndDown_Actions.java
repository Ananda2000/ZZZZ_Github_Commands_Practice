package keyboard_keys_Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class KeysUpAndDown_Actions {

	@Test
	public void keyUp_down() throws AWTException, InterruptedException
	{
		String driverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele = driver.findElement(By.xpath("//fieldset/child::input[@id='autocomplete']"));
		
		WebElement ele1 = driver.findElement(By.xpath("//fieldset/input[@id='name']"));
		
		Actions act = new Actions(driver);
		ele.click();
		act.keyDown(Keys.SHIFT)
		.sendKeys("anand")
		.keyUp(Keys.SHIFT).perform();
		act.moveToElement(ele);
		ele.click();
		Robot rbt = new Robot();
		
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_A);
		rbt.keyRelease(KeyEvent.VK_A);
		Thread.sleep(4000);
		rbt.keyPress(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_C);
		rbt.keyRelease(KeyEvent.VK_CONTROL);
		act.moveToElement(ele1);
		ele1.click();
		rbt.keyPress(KeyEvent.VK_CONTROL);
		rbt.keyPress(KeyEvent.VK_V);
		rbt.keyRelease(KeyEvent.VK_V);
		
		//ele1.sendKeys(str);
		
	//	act.keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();
	//	act.keyDown(Keys.DELETE);
		
	}
	
}
