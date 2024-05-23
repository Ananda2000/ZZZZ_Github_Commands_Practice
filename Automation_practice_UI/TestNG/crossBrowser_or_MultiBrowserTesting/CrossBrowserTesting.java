package crossBrowser_or_MultiBrowserTesting;

import javax.annotation.ParametersAreNonnullByDefault;
import javax.annotation.PropertyKey;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	
	@Parameters("Browser")
	@Test
	public void BrowserLaunch_Setup(String browser1)
	{
		if(browser1.equalsIgnoreCase("chrome"))
		{	
			
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		}
		if(browser1.equalsIgnoreCase("IE"))
		{
			System.out.println("launching IE browser ----");
			String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\msedgedriver.exe";
			System.setProperty("webdriver.edge.driver", driverpath);
			
			WebDriver driver = new InternetExplorerDriver();
			driver.get("https://www.facebook.com/");
		}
		if(browser1.equalsIgnoreCase("FF"))
		{
			System.out.println("Launching Firefox browser---");

			/*String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
			System.setProperty("webdriver.chrome.driver", driverpath);
			
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");*/
		}
		
		
	}
	/*
	@Test
	@Parameters("IE")
	public void IE_Browser_Launching(String IE)
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver1 = new InternetExplorerDriver();
		driver1.get("https://www.facebook.com/");
	}

*/
}
