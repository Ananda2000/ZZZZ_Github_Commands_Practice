package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
import org.apache.poi.ss.usermodel.Row;

public class TestingExcelfile 
{

	public static void main (String [] args) throws IOException
	{
		File f_excel = new File("D://Automation_Test_Data//xlsFile.xls");
		FileInputStream f11 = new FileInputStream(f_excel);
		
		HSSFWorkbook wb=new HSSFWorkbook(f11); 
		HSSFSheet sheet=wb.getSheetAt(0);  
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		
		int rownum=sheet.getLastRowNum();
		int rows = rownum+1;
		System.out.println("The row last row number is --"+rows);
	}
}
