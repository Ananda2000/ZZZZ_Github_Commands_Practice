package Excel_File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Append_dataInto_Excelfile 
{
	public static void main(String [] args) throws IOException
	{
		String file_location ="D:\\FileHandlingPRactice\\Nanda_1234.xlsx";
		File fle = new File(file_location);
		
		FileInputStream fiis = new FileInputStream(fle);
		
		
		XSSFWorkbook wb = new XSSFWorkbook(fiis);
	
		XSSFSheet wb_sheet = wb.getSheet("Sheet1");
		
		int count = wb_sheet.getPhysicalNumberOfRows();
		System.out.println("active row numbers ---"+count);
		
		Row row = wb_sheet.createRow(count++);
		int cellss =0;
		Cell cell = row.createCell(cellss++);
		cell.setCellValue("5");
		
		Cell cell1 = row.createCell(cellss++);
		cell1.setCellValue("anand");
		
		Cell cell2 = row.createCell(cellss++);
		cell2.setCellValue("anand1");
		
		Cell cell3 = row.createCell(cellss++);
		cell3.setCellValue("pound");
		
		FileOutputStream flos = new FileOutputStream(fle);
		
		wb.write(flos);
		flos.close();
		wb.close();
		
		System.out.println("Data updated successfully---");
		
		
		
	}

}
