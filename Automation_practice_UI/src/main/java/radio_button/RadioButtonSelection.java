
// THIS PROGRAM WE ARE SELECTING THE RADIO BUTTON..
package radio_button;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class RadioButtonSelection
{
	
	@Test
	public void radioButton()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele = driver.findElement(By.xpath("//input [@type ='radio' and @value='radio1']"));
		ele.click();
		boolean bb =ele.isSelected();
		System.out.println("is enabled ---"+bb);
		Assert.assertEquals(bb, true);
		

		
		
		System.out.println("This is testing.");

		
	}

}
