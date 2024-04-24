package checkbox_selection;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MultiCheckboxSelection 
{
	@Test
	public void multiple_Selection()
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		System.setProperty("webdriver.chrome.driver", driverpath);
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// getting the total number of checkbox count....
		List<WebElement> ele =  driver.findElements(By.xpath("//label//input[@type='checkbox']"));
		
		System.out.println(ele.size());
		
// Iterating to click on multiple check boxes...
		for(int i=0;i<ele.size();i++)
		{
			ele.get(i).click();
		}
		
		
	}

}
