package reports;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class TestNG_ExtentREports 
{
	private static ExtentReports extent;
	ExtentHtmlReporter htmlReporter;
	
	@BeforeSuite
	public void setup()
	{
		htmlReporter = new ExtentHtmlReporter("extent_09888.html");
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
	}
	@Test
	public void test1()
	{
		ExtentTest X_test = extent.createTest("My test");
		X_test.log(Status.INFO, "This is info checking..");
		X_test.fail("execution 1");
		//X_test.addScreenCaptureFromPath("aaaa");
	}
	
	@AfterSuite
	public void teardown()
	{
	extent.flush();	
	}
}
