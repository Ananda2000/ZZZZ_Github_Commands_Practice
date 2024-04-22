package checkbox_selection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Single_checkboxSelection 
{
	@Test
	public void checkboxSingle()
	{
		
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		WebDriver driver = new ChromeDriver();
		
		System.setProperty("webdriver.chrome.driver", driverpath);
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement ele = driver.findElement(By.xpath("//input [@type ='checkbox' and @id='checkBoxOption1']"));
		ele.click();
		if(ele.isEnabled())
		{
			System.out.println("check box is checked...");
		}
		else
		{
			System.out.println("It is not selected..");
		}
		
		
		
	}

}
