
// HERE WE ARE TAKING FULL PAGE SCREENSHOT.. WITH THE HELP OF ASHOT THIRD PARTY LIBRARY...
package screenshot_taking;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class FullPage_ScreenShot 
{
	
	@Test
	public void fullpage_Screenshot() throws IOException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com");
		
		driver.manage().window().maximize();
		
		Screenshot flsc = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		ImageIO.write(flsc.getImage(), "PNG", new File("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\"
				+ "ChormeDriver\\chromedriver-win64\\fullscreen.png"));
	}

}
