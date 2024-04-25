// HERE WE ARE USING THE PIXILS TO MOVE THE SCROLL BAR VERTICALLY...

package scrolle_bar_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Pixils_Vertical_ScrollUsing 
{

	@Test
	public void pixils_scrolling()
	{
		String driverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driverr = new ChromeDriver();
		
		driverr.get("https://rahulshettyacademy.com/AutomationPractice/");
		driverr.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driverr;
		js.executeScript("window.scrollBy(0,1000)");
		
		
		
		
		
		
	}
}
