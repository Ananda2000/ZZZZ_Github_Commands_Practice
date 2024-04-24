
// THIS PROGRAM WE ARE DESELECTING ALL OPTIONS IN AT A TIME..
package dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class De_selectAll_optionsAtaTime 
{
	
	@Test
	public void de_selectAll()
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
			
		}
// HERE WE ARE USING DESELECTALL() METHOD TO ALL SELECTED OPTIONS FROM DROPDOWN....
		seell.deselectAll();
			
			
	}

}
