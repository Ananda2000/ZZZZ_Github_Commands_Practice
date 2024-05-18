// Here we are handling it by opening new tabs..

package window_and_Tab_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tab_Handling 
{
	@Test
	public void tab_handling() throws InterruptedException
	{
	System.out.println("THIS PROGRAM FOR MULTIPLE WINDOW HANDLING USING TAB OPTIONS.........");
	String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
	System.setProperty("webdriver.chomre.driver", driverpath);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/browser-windows");
	driver.manage().window().maximize();
	WebElement ele = driver.findElement(By.xpath("//div[@id='tabButtonWrapper']/child::button"));
	
	String str = driver.getWindowHandle();
	System.out.println("The string elements are ---"+str);
	
	ele.click();
	driver.switchTo().window(str);
	ele.click();
	Set<String> stt = driver.getWindowHandles();
	System.out.println("-- this is window element ---"+stt);
	
	String ssss = driver.getWindowHandle();
	System.out.println("-------------------- value "+ssss);
	
	for (String string11 : stt) 
	{
		if(!str.equalsIgnoreCase(string11))
		{
			driver.switchTo().window(string11);
			Thread.sleep(4000);
			String urlss =driver.getCurrentUrl();
			System.out.println("The url is ---"+urlss);
			driver.close();
		}
	}

	}

}
