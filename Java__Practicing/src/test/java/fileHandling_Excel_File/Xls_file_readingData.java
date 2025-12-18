package fileHandling_Excel_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/*import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FormulaEvaluator;
*/
public class Xls_file_readingData 
{
/*	public static void main(String [] args) throws IOException
	{
	File f_excel = new File("D://Automation_Test_Data//xlsFile.xls");
	FileInputStream f11 = new FileInputStream(f_excel);
	
	HSSFWorkbook wb=new HSSFWorkbook(f11); 
	HSSFSheet sheet=wb.getSheetAt(0);
	HSSFRow row;
	HSSFCell cell;
	FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
	
	int rownum=sheet.getLastRowNum();
	int rows = rownum+1;
	
	System.out.println("The row last row number is --"+rows);
	
	int columnCount = sheet.getRow(0).getPhysicalNumberOfCells();
	System.out.println("The total number of columns --"+columnCount);
	
	for(int i=0;i<rows;i++)
	{
		row = sheet.getRow(i);
		if(row!=null)
		{
			for(int c=0;c<columnCount;c++)
			{
				
				cell =row.getCell(c);
				if(cell!=null)
				{
					System.out.print(cell);
				System.out.print("-----");
				}
			}
			System.out.println();
		}
	}
		
	}
*/
	}
