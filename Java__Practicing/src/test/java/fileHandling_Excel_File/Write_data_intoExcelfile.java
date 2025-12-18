package fileHandling_Excel_File;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
/*
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
*/
public class Write_data_intoExcelfile 
{

	/*
	public static void main(String[] args)
	{
		//File fwrite = new file("D://Automation_Test_Data//xlsFile1.xls");
		//create an empty work book...
		HSSFWorkbook hfwk = new HSSFWorkbook();
		
		// Generate the sheet
		HSSFSheet hfsheet = hfwk.createSheet("Ananda");
		
		// create the row.
	HSSFRow row = null;
	
	// create the data in object form.
	
	Map<String, Object[]> map = new TreeMap<String, Object[]>();
	map.put("1", new Object[] {"emp id","emp name","Designation"});
	

	map.put("2", new Object[] {"Emp_01","Nanda","Senior software engineer"});

	map.put("3", new Object[] {"emp_02","Kumar","manager"});

	map.put("4", new Object[] {"emp_03","emp name","Designation"});
	
	Set <String> key = map.keySet();
	
	int rowid=0;
	
	for(String s1: key)
	{
		row=hfsheet.createRow(rowid++);
		Object[] objectarr = map.get(s1);
		int cellid=0;
		for(Object obj: objectarr)
		{
			Cell cell = row.createCell(cellid++);
			cell.setCellValue((String)obj);
			System.out.println(cell.getStringCellValue());
			
			
		}
	}
	try {
		FileOutputStream fout = new FileOutputStream("D://Automation_Test_Data//xlsFile1.xls");
		hfwk.write(fout);
		fout.close();
		System.out.println("Data was writtens successfully");
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	}
*/
}
