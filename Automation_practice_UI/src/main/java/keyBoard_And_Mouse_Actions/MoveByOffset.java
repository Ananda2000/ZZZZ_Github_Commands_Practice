package keyBoard_And_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveByOffset 
{
	@Test
	public void moveByOffSetmethod()
	{
		String driverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		Actions act = new Actions(driver);
		//WebElement ele = driver.findElement(By.xpath("//a[text()='Social Media']"));
		
		act.moveByOffset(500, 200).contextClick().build().perform();
	}

}
