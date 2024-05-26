package reports;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


public class SimpleExtentReport 
{
	static ExtentTest test;
	static ExtentReports report;
	
	@Test
	public void Extentpass()
	{
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("ExtentReportResults12345.html");
		report = new ExtentReports();
		
		report.attachReporter(htmlReporter);
		test = report.createTest("aaaaaaaaaa");
		
		System.out.println("This is pass");
		//Assert.assertEquals(false, false);
		test.log(Status.INFO, "This is just info ----");
		test.pass("this is pass");
		

		//report.removeTest(test);
		report.flush();

		//report.removeTest(test);
		
	}
}
