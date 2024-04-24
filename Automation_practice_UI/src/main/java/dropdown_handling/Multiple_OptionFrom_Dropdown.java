package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Multiple_OptionFrom_Dropdown 
{
	@Test
	public void multipleSelection_dropdown()
	{
		System.out.println("THIS PROGRAM FOR SELECTING MULTIPLE OPTIONS IN DROPDOWN...");
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chomre.driver", driverpath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://techcanvass.com/Examples/multi-select.html");
		WebElement ele = driver.findElement(By.xpath("//select[@id='multiselect']"));
		
		Select seell = new Select(ele);
		boolean bln = seell.isMultiple();
		
		System.out.println(bln);
		if(bln)
		{
			// SELECT BY INDEX..
			seell.selectByIndex(0);
	// SELECT BY VISIBLE TEXT...
			seell.selectByVisibleText("Maruti Suzuki");
	// SELECT BY VALUE 
			seell.selectByValue("audi");
			
			
			List<WebElement> mul = seell.getAllSelectedOptions();
			//List<WebElement> mul = seell.getOptions();
			System.out.println("The list of selected options are ------------------");
			for(int i=0;i<mul.size();i++)
			{
			System.out.println(mul.get(i).getText());
			
			}
		}
		
		
	}

}
