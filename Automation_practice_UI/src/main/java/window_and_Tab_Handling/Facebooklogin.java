package window_and_Tab_Handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class Facebooklogin 
{
	@Test
	public void login_page()
	{
		String driverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// Sending values to email text box..
		WebElement ele = driver.findElement(By.xpath("//input[@id='email']"));
		ele.sendKeys("nagu");
		
		
		// sending values to password text box...
		WebElement pass =driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys("password");
		
		// click on login button
		WebElement butclick = driver.findElement(By.xpath("//button[@name='login']"));
		butclick.click();
		
		
		
		
	}

}
