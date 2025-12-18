package Excel_File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_data_using_arrayobjects 
{
	public static void main(String [] args) throws IOException
	{
		String str = "D:\\FileHandlingPRactice\\Nanda_1234.xlsx";
		File fl = new File(str);
		
		FileInputStream filns = new FileInputStream(fl);
		
		XSSFWorkbook wb = new XSSFWorkbook(filns);
		
		XSSFSheet wb_sheet = wb.getSheet("Sheet1");
		
		Object[][] country_data = {
				 {"SNo", "Country", "Capital", "Currency"}, 
		          {"1", "India", "Delhi", "Indian Rupee"}, 
		          {"2", "France", "Paris", "Euro"},
		          {"3", "canada", "toronto", "dollar"}
		};
		
		int rowcount=0;
		for(Object[] arraydata: country_data)
		{
		Row rows = wb_sheet.createRow(rowcount++);
		
			int columnCount=0;
			
			for(Object coumobj: arraydata)
			{
				Cell colmn = rows.createCell(columnCount++);
				
				if(coumobj instanceof String)
				{
					colmn.setCellValue((String)coumobj);
				}
				
				if(coumobj instanceof Integer)
				{
					colmn.setCellValue((Integer)coumobj);
				}
			}
		
		
			
			
		}
		
		FileOutputStream flos = new FileOutputStream(str);
		wb.write(flos);
		flos.close();
		System.out.println("data was written successfully");
	}

}
