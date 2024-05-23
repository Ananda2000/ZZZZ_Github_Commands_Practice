package annotations;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.Test;
public class Groups_BeforeAndAfter_Annotation 
{
	@BeforeGroups("G1")
	public void beforegroups()
	{
		System.out.println("----------------This is before groups..---------------");
	}
	@BeforeMethod
	public void beforemethod()
	{
		System.out.println("@Before method");
	}
	@Test(groups="G1")
	public void Method1G1()
	{
		System.out.println("Am in Method 1 Group 1");
	}
	@Test(groups="G1")
	public void Method2G1()
	{
		System.out.println("In Method 2 Group 1");
	}
	@Test
	public void Method3()
	{
		System.out.println("Not inside any group");
	}
	@AfterGroups("G1")
	public void AfterGroups()
	{
		System.out.println("----------THIS IS AFTER GROUPS METHOD------------");
	}

}
