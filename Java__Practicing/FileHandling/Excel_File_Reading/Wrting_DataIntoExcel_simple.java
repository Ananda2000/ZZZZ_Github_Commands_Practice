// HERE WE ARE HARD CODING THE DATA INTO PROGRAMMING.... AND WRITING INTO EXCELFILE..

package Excel_File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Wrting_DataIntoExcel_simple 
{
	public static void main(String [] args) throws IOException
	{
		
		// read the file
		File fil = new File("D:\\FileHandlingPRactice\\nanda_123.xlsx");
		FileInputStream flins= new FileInputStream(fil);
		
// creating the workbook.		
		XSSFWorkbook wb = new XSSFWorkbook(flins);
		
// creating the sheet in file.
			 //wb.createSheet("sheet_me_1");
			XSSFSheet wb_Sheet=wb.getSheet("Sheet1");
			
// Now read the rows in sheet..
				XSSFRow rows = wb_Sheet.getRow(1);
				
				XSSFCell cells = rows.createCell(2);
				cells.setCellValue("pass1");
				
				wb_Sheet.getRow(2).createCell(2).setCellValue("fail1");
				wb_Sheet.getRow(3).createCell(2).setCellValue("pass1");
				
				FileOutputStream fsop = new FileOutputStream(fil);
				
				wb.write(fsop);
				
				fsop.close();
				System.out.println("Data was successfully writtne into file..");
				
		
			}

}
