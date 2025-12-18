package Excel_File_Reading;

import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Write_DataInto_ExcelFile 
{
	public static void main(String [] args) throws IOException
	{
		// creating the workbook
		XSSFWorkbook xlsx_wb = new XSSFWorkbook();
		// creating the sheet in workbook....
		//XSSFSheet wb_Sheet = xlsx_wb.createSheet("nanda1");
	//	
		// creating a row object
		XSSFRow row ;
		
		Map<String, Object[]> map1 = new TreeMap<String, Object[]>();
		
		map1.put("1", new Object[] {"Roll No", "NAME", "Year"});
		
		map1.put("2" , new Object[] {"130", "Mohan","2nd year"});
		
		map1.put("3", new Object[] { "131", "Radha","2nd year"});
		
		xlsx_wb.close();
		
		
	}

}
