package annotations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Suit_annotation 
{
	
	//@AfterTest
	public void AfterTest_method()
	{
		System.out.println("   ");
		System.out.println("@AFtertest --- Annotation...");
	}
	//@AfterSuite
	public void AfterSuit_method()
	{
		System.out.println("                  ");
		System.out.println("@AFTERSUIT annotation..");
	}
	
	//@BeforeSuite
	public void BeforeSuit_method()
	{
		System.out.println("                    ");
		System.out.println("@BeforeSuite annotation..");
	}
	
	
	//@BeforeTest
	public void BeforeTest_Method()
	{	
		System.out.println("              ");
		System.out.println("@BEFORETEST ANNOTATION..");
	}
	
		
	//@BeforeClass
	public void Beforeclass_method()
	{
		System.out.println("                      ");
		System.out.println(" @BeforeClass Annotation -----");
	}
	
	//@AfterClass
	public void Afterclass_Method()
	{
		System.out.println("                 ");
		System.out.println(" @After classs Annotation ------------");
	}
	
	
	
	//@Test
	public void Test_method1()
	{
		System.out.println("              ");
		System.out.println("@Test annotation method--1--");
	}
	
	//@Test
	public void Test_method2()
	{
		System.out.println("   ");
		System.out.println("@Test annotation Method--2 --");
	}
	
	//@BeforeMethod
	public void BeforeMethod_annotation()
	{
		System.out.println("            ");
		System.out.println("@BeforeMethod Annotation ---------------");
	}
	
	//@AfterMethod
	public void AfterMethod_annotation()
	{
		System.out.println("                    ");
		System.out.println("@AfterMethod Annotation ----------------------");
		
		
	}

}
