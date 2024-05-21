package dataProvider_Annotation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hardcoding_dataIn_Dataprovider 
{

//THIS IS @DATAPROVIDER METHOD WITH NAME "ananda"
	@DataProvider(name="ananda")
	public Object[][] dpMethod()
	{
		return new Object[][] {{"First-1"},{"second-2"}};
	}
	
	
// HERE WE PASSED THE DATAPROVIDER AS ATTRIBUTE TO @TEST METHOD..
// THE BELOW TEST CASE WILL EXECUTE 2 TIMES..
	@Test(dataProvider ="ananda")
	public void Dataprovider_Hardcoding(String val)
	{
		System.out.println("The values are --- "+val);
	}

}
