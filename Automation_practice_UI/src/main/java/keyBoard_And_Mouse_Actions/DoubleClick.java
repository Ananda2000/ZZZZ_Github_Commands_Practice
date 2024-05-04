// USE This url for double click operation...
// URL --https://demo.guru99.com/test/simple_context_menu.html
package keyBoard_And_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DoubleClick 
{
	@Test
	public void doubleClick()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver= new ChromeDriver();
		Actions act = new Actions(driver);
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		act.doubleClick(ele).build().perform();
		
		
		
	}

}
