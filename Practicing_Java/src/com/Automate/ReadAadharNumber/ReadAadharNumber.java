package com.Automate.ReadAadharNumber;

import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.support.ui.ExpectedConditions


import javax.xml.xpath.XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class ReadAadharNumber 
{
	@Test
	public void readAadharNumber() throws InterruptedException
	{
		System.out.println("This is testing");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANANDA K R\\Downloads\\chromedriver_win32\\chromedriver.exe");
		String url ="https://myaadhaar.uidai.gov.in/verifyAadhaar";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		//WebElement Aadhaar_Number = driver.findElement(By.xpath("//label[text()='Enter Aadhaar Number']"));
		
		WebElement  Aadhaar_Number= driver.findElement(By.xpath("//input[@name='uid']"));
		WebDriverWait webwait = new WebDriverWait(driver, 20);
		//webwait.until(ExpectedConditions)
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//JavascriptExecutor js = (JavascriptExecutor) driver;
	Aadhaar_Number.click();
		// js.executeScript("arguments[0].click()", Aadhaar_Number);
		Aadhaar_Number.sendKeys("000000000087");
															
		
	}

}
