package dataProvider_Annotation;

import org.testng.annotations.Test;

public class XL_Dataprovider_method 
{
	@Test(dataProvider="xlanand",dataProviderClass=XL_reading_Dataprovider.class )
	public void display_XLdata(String uname, String pw)
	{
		System.out.print(uname+"---");
		System.out.println(pw);
		
	}

}
