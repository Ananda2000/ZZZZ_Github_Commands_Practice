// we are using action on MoveToElement() method in selenium....

// url used --https://rahulshettyacademy.com/AutomationPractice/
package keyBoard_And_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MoveToElement_Method 
{
	
	@Test
	public void CursorMovingElement() throws InterruptedException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		Actions act = new Actions(driver);
		
		WebElement ele = driver.findElement(By.xpath("//div[@class='mouse-hover']//child::button"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(1000);
		
		act.moveToElement(ele).build().perform();;		
		String str = ele.getText();
		System.out.println(str+"--------------------------");
		
	}
}
