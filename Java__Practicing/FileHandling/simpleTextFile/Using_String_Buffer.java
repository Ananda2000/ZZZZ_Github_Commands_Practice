package simpleTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Using_String_Buffer 
{
	public static void main(String [] args) throws IOException
	{
		File flee = new File("D:\\FileHandlingPRactice\\kumar.txt");
		
		FileReader flr = new FileReader(flee);
		BufferedReader bufrdr = new BufferedReader(flr);
		StringBuffer strbfr = new StringBuffer();
		List<String> liss = new ArrayList<String>();
		String line ;
		int count =0;
		while((line=bufrdr.readLine())!=null)
		{
			count =count+1;
			if(count==2)
			{
			strbfr.append(line);
			strbfr.append("\n");
		
			}
			liss.add(line);
		}
		System.out.println(strbfr);
		System.out.println(liss);
	}

}
