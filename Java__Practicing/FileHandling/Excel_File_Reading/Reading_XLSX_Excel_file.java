package Excel_File_Reading;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.*;



public class Reading_XLSX_Excel_file 
{
	// STEPS >>>>>>=>>>>>>>>>>>>=>>>>>>>>>>.
	// 1st create the excel fle with xlsx format, keep in excel file.
	
	public static void main(String[] args) throws IOException
	{
		File xlsxFile = new File("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\My_notes\\Files_stored_forTesting\\xlsx_Format.xlsx");
		FileInputStream fis = new FileInputStream(xlsxFile);
		System.out.println("File exists -------"+xlsxFile.exists());
	 XSSFWorkbook    xssf_wb;
	 XSSFSheet wb_sheet;
		
		if(xlsxFile.exists())
		{
			xssf_wb = new XSSFWorkbook(fis);
			//wb_sheet = xssf_wb.getSheet("ananda");
// HERE WE DISPLAYING THE TOTAL NUMBER OF SHEETS IN WORK BOOK -------------------------
			System.out.println("TOTAL NUMBER OF SHEETS --<"+xssf_wb.getNumberOfSheets());
			
// GETTING THE SHEET NMAES IN THE WORKBOOK..
			System.out.println("The sheet name is --- "+xssf_wb.getSheetName(0));

			
			
			//System.out.println("The total number of sheets -<-:"+xssf_wb.getNumberOfSheets());
			
			wb_sheet = xssf_wb.getSheetAt(0);
// HERE WE USING TO DISPLAY THE TOTAL NUMBER OF ROWS IN SHEET..
			int total_rownumber = wb_sheet.getLastRowNum();
			System.out.println(wb_sheet.getPhysicalNumberOfRows());
			
			System.out.println(1+total_rownumber+"----The total number of rows --<-");
			
					
			Iterator<Row> rows = wb_sheet.iterator();
			
			while(rows.hasNext())
			{
				Row row = rows.next();
				
				
				Iterator<Cell> cells = row.iterator();
				while(cells.hasNext())
				{
					Cell cell_data= cells.next();
					
					switch(cell_data.getCellType())
					{
						case Cell.CELL_TYPE_STRING:
					
							System.out.println(cell_data.getStringCellValue());
							break;
						case Cell.CELL_TYPE_NUMERIC:
							System.out.println(cell_data.getNumericCellValue());
							break;
							default:
					}
				}
				//System.out.println("------------------------------------------------------");
			}
		}
		else
		{
			System.out.println("File doest not exist.. please check the path or file name .. ");
		}
		
	}

}
