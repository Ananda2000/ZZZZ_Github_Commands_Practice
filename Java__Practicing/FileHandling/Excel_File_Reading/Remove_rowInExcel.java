package Excel_File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//import org.apache.poi.hslf.model.Sheet;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Remove_rowInExcel 
{
	public static void main(String [] args) throws IOException
	{
		System.out.println("this is testing..");
		File fle = new File("D:\\FileHandlingPRactice\\Nanda_1234.xlsx");
		
		if (fle.exists())
		{
			FileInputStream fl_ins = new FileInputStream(fle);
			
			XSSFWorkbook wb = new XSSFWorkbook(fl_ins);
			XSSFSheet wb_Sheet = wb.getSheet("Sheet1");
			
			int rowcount = wb_Sheet.getLastRowNum();
			System.out.println("total number of rows  ---<- "+rowcount);
			
			XSSFRow rowss = wb_Sheet.getRow(4);
			wb_Sheet.removeRow(rowss);
			int rowcountAfter = wb_Sheet.getLastRowNum();
			System.out.println("Total number of rows  after removal ---< "+rowcountAfter);
		}
	}

}
