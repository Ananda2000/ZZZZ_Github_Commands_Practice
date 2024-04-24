package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectSingleOptionFromDropdown 
{
	@Test
	public void singleoptionSelection()
	{
		String ch_DriverPath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", ch_DriverPath);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		WebElement ele = driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select ss = new Select(ele);
// here we selecting based on index..
		ss.selectByIndex(55);
		List<WebElement> aa =ss.getAllSelectedOptions();
		
		System.out.println(aa.size());
		System.out.println("SELECT BY INDEX  ---"+aa.get(0).getText());

		
// Here we using select by visible text.	      
		ss.selectByVisibleText("Option2");
		List<WebElement> Option2222 = ss.getAllSelectedOptions();
		System.out.println("By VISIBLE TEXT ---"+Option2222.get(0).getText());

// Here we are doing based on value..
		ss.selectByValue("option3");
		List<WebElement> A3OPTION = ss.getAllSelectedOptions();
		System.out.println("SELECT BY VALUE --"+A3OPTION.get(0).getText());
		
	
	}

}
