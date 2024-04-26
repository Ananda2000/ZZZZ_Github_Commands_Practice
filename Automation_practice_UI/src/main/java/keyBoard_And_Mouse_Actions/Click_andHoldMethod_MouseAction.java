package keyBoard_And_Mouse_Actions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// use this url for this testing 
//https://selenium08.blogspot.com/2020/01/click-and-hold.html
import org.testng.annotations.Test;

public class Click_andHoldMethod_MouseAction 
{
	@Test
	public void clickAndHoldMouseAction()
	{
		
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.jqueryscript.net/demo/tap-hold-event-handler/");
		//WebElement ele = driver.findElement(By.xpath("//h3[contains(text(),'Click and Hold in Selenium')]"));
		WebElement ele = driver.findElement(By.xpath("//code[contains(text(),'1')]"));
		
		//ele.click();
		Actions act = new Actions(driver);
		act.clickAndHold(ele).build().perform();
		
		
		
	}

}
