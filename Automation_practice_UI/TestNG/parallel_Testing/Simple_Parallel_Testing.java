package parallel_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Simple_Parallel_Testing 
{
	
	@Test
	public void parallel_1methods() throws InterruptedException
	{
		System.out.println("this is 1sm---"+Thread.currentThread().getId());
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
	public void parallel_2method() throws InterruptedException
	{
		System.out.println("This is 2nd ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
	}
	
	
	@Test
	public void parallel_3method() throws InterruptedException
	{
		
		System.out.println("This is 3rd ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
		
	}
	
	@Test
	public void parallel_4methods() throws InterruptedException
	{
		System.out.println("this is 4---"+Thread.currentThread().getId());
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
	public void parallel_5method() throws InterruptedException
	{
		System.out.println("This is 5th ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
	}
	
	
	@Test
	public void parallel_6method() throws InterruptedException
	{
		
		System.out.println("This is 6th ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
		
	}
	
	
	
	@Test
	public void parallel_7methods() throws InterruptedException
	{
		System.out.println("this is 7th---"+Thread.currentThread().getId());
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
	public void parallel_8method() throws InterruptedException
	{
		System.out.println("This is 8th ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
	}
	
	
	@Test
	public void parallel_9method() throws InterruptedException
	{
		
		System.out.println("This is 9th ----"+Thread.currentThread().getId());
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.navigate().to("https://www.facebook.com/");
		Thread.currentThread().sleep(5000);
		WebElement ele = driver.findElement(By.xpath("//button[@type='submit']"));
		ele.submit();
		
		
	}

	

}
