package dropdown_handling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DynamicDropdowns 
{
	@Test
	public void dynamic_dropdowns() throws InterruptedException
	{
		String driverpath ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chomre.driver", driverpath);
		
		WebDriver dri = new ChromeDriver();
		dri.get("https://loan.icicibank.com/asset-portal-all/check-eligibility?loanType=pl&WT.mc_id=Desk_NLI_cms_pl_index_ChkEli&_gl=1*sasjeu*_ga*OTkwMDkwMTc5LjE2NTAwNDQ4NzQ.*_ga_SKB78GHTFV*MTY1MDA0NDg3NC4xLjAuStriMTY1MDA0NDg4MC41NA");
		dri.manage().window().maximize();
		 WebElement ele = dri.findElement(By.xpath("//input[@name='CUSTCOMMUCITY']"));
		 ele.click();
		 ele.sendKeys("Bang");
		 Thread.sleep(2000);
		 List<WebElement> ele1 =dri.findElements((By.xpath("//ul[@id='ui-id-1']//child::li")));
		  int sizes = ele1.size();
		 for(int i=0;i<sizes;i++)
		 {
			 String wordss = ele1.get(i).getText();
			 System.out.println("the word is --"+wordss);
			 
			 if(wordss.equalsIgnoreCase("BANGA"))
			 {
				 System.out.println("this is testing ---");
				 ele1.get(i).click();
			}
			 
		 }
		 
		 
		 
	}

}
