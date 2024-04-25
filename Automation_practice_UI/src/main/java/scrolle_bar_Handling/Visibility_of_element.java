package scrolle_bar_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Visibility_of_element 
{
	@Test
	public void visiblityElement()
	{
		
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/guru99home/");
		//WebElement ele = driver.findElement(By.xpath("//legend[text()='iFrame Example']"));
		WebElement ele = driver.findElement(By.linkText("Linux"));

		
		//js.executeScript("arguments[0].scrollIntoview();", ele);
		  js.executeScript("arguments[0].scrollIntoView();", ele);
		
		
		
		
		
	}

}
