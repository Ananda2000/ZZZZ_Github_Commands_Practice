package scrolle_bar_Handling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageBottonScrolling 
{
	@Test
	public void bottomPageScrolling()
	{
		System.out.println("SCROLL TILL THE PAGE END... ---");
		
		String  str ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\ChormeDriver\\chromedriver-win64\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", str);
		
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		//js.executeScript("window.scrollTo(0,document.Body.scrollHeight)");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
		
	}

}
