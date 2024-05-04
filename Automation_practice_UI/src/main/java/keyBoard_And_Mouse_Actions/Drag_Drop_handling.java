// use the url....
/// https://the-internet.herokuapp.com/drag_and_drop

package keyBoard_And_Mouse_Actions;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Drag_Drop_handling 
{
	@Test
	public void drap_drop_handling()
	{
	String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", driverpath);
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://the-internet.herokuapp.com/drag_and_drop");
	
	Actions act = new Actions(driver);
	WebElement source = driver.findElement(By.xpath("//div[@id='columns']/child::div[1]"));
	
	WebElement destination = driver.findElement(By.xpath("//div[@id='columns']/child::div[2]"));
	
	act.dragAndDrop(source, destination).build().perform();
	
	String text = source.getText();
	System.out.println("The text is ---"+text);
	
	}
	
}
