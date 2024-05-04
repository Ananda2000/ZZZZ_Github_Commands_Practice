// we checking click and release methods ..... in actions class..

package keyBoard_And_Mouse_Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Release_MEthodHandling 
{
	@Test
	public void release() throws InterruptedException
	{
		String driverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='show-textbox']"));
		//js.executeScript("arguments[0],scrollIntoView();", ele);
		  js.executeScript("arguments[0].scrollIntoView();", ele);
		  
		  
		WebElement displayHide = driver.findElement(By.xpath("//input[@id='displayed-text']"));
		WebElement hideButton = driver.findElement(By.cssSelector("input#hide-textbox"));
		WebElement showbutton = driver.findElement(By.xpath("//input[@value='Show']"));
		
		boolean visibility =displayHide.isDisplayed();
		System.out.println("--------------"+visibility);
		Actions act = new Actions(driver);
		
		if(visibility)
		{
			
			act.clickAndHold(hideButton).build().perform();
			Thread.sleep(5000);
			
			act.release(hideButton).build().perform();
			
		}
		else
		{
			act.click(showbutton).build().perform();
		}
		
		
		
	}
}
