// HERE WE ARE READING THE DATA LINE BY LINE FROM THE FILE....

package reading_Files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class User_BufferReader 
{
	public static void main(String [] args) throws IOException
	{
		
		FileReader fr  = new FileReader("D:\\FileHandlingPRactice\\kuarml9999.txt");
		
		BufferedReader bfrd = new BufferedReader(fr);
		int i=0;
		String line;
		List<String> lines = new ArrayList<String>();
		while((line=bfrd.readLine())!=null)
		{
			i++;
			if(i==2)
			{
				System.out.println(i+"--"+line);
				
				String[]  split =line.split(" ");
				int size =split.length;
				System.out.println(split[0]);
				System.out.println(size);
			}
			lines.add(line);
			
		}
		
		
// HERE WE ARE WRITING THE DATA INTO FILE FROM ARRAYLIST....		
		FileWriter flwr = new FileWriter("D:\\FileHandlingPRactice\\anand123.txt");
		BufferedWriter bfwt = new BufferedWriter(flwr);
		System.out.println(lines);
		for (String string : lines) 
		{
			bfwt.write(string);
			bfwt.write("\n");
			System.out.println(string);
			
		}
		bfwt.close();
	}

}
