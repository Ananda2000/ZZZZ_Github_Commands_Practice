package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class use_Classes1_parallel
{
	
	@Test
	public void class_method1() throws InterruptedException
	{

		System.out.println("this is 1sm-gg---"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
	}
	@Test
	public void class_method2() throws InterruptedException 
	{
		System.out.println("this is 2nd-kk---"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
	}
	

}
