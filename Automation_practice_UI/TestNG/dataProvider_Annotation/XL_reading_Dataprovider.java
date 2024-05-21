package dataProvider_Annotation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class XL_reading_Dataprovider 
{
	static String path ="C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\My_notes\\dataProvider.xlsx";
	
	
	@DataProvider(name="xlanand")
	public static Object[][] DP_method() throws IOException
	{
		Object[][] aa =readExcel(path);
		return aa;
		
	}
	
	
	public static Object[][] readExcel(String path1) throws IOException 
	{
		FileInputStream filin= new FileInputStream(path1);

		XSSFWorkbook xssfWK = new XSSFWorkbook(filin);

		XSSFSheet xssfSheet = xssfWK.getSheet("Sheet1");

		int rows = xssfSheet.getLastRowNum();
		int columnn = xssfSheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[rows][columnn];

		for(int i=0;i<rows ;i++)
		{
			XSSFRow row = xssfSheet.getRow(i+1);
			for(int j=0;j<columnn;j++)
			{
		
				XSSFCell cellss = row.getCell(j);
		
				switch (cellss.getCellType()) {
				case Cell.CELL_TYPE_NUMERIC:
				data[i][j] = cellss.getNumericCellValue();
				System.out.println("Inside num value");
				break;
				
				case Cell.CELL_TYPE_STRING:
					data[i][j] = cellss.getStringCellValue();
					//System.out.println("Inside string --- "+cellss.getStringCellValue());
					break;
			
				case Cell.CELL_TYPE_BOOLEAN:
					data[i][j] = cellss.getBooleanCellValue();
					System.out.println("Inside boolean....");
						break;

				default:
					break;
		}
	}
}	
	return data;


}
}



//}