//IN THIS PROGRAM WE ARE TAKING SCREEN SHOT FOR CURRENT SCREEN.....

package screenshot_taking;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.utils.FileUtil;

public class CurrentScreen_ScreenShot 

{

	@Test
	public void launch_chrome_facebookURL() throws IOException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
	// CREATING OBJECT FOR WEBDRIVER...
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	// PASSING 
		driver.get("https://www.facebook.com/");
		
// taking the screen shot....
		File FF = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
// WE COPY FROM SOURCE TO DESTINATION...
		//FileUtils.copyFile(source, destination);
		FileUtils.copyFile(FF, new File("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\ggg.png"));
		
		driver.close();

		
	}
}
