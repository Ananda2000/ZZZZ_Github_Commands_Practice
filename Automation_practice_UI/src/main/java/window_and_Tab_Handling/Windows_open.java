package window_and_Tab_Handling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Windows_open 
{
	@Test
	public void windowopen() throws InterruptedException
	{
		
		System.out.println("THIS PROGRAM FOR MULTIPLE WINDOW HANDLING......");
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chomre.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/browser-windows");
		WebElement ele = driver.findElement(By.xpath("//div[@id='windowButtonWrapper']/child::button"));
		
		String str = driver.getWindowHandle();
		System.out.println("The string elements are ---"+str);
		
		ele.click();
		ele.click();
		Set<String> stt = driver.getWindowHandles();
		
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
		//driver.switchTo().window(str);

		//driver.switchTo().window(nameOrHandle)
		
		System.out.println("-------------"+stt);
		
	}

}
