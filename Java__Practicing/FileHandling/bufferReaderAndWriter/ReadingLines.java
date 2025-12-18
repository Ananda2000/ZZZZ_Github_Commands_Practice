package bufferReaderAndWriter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingLines 
{
	public static void main(String [] args) throws IOException
	{
		FileReader flr = new FileReader("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\bufferedwritter.txt");
		BufferedReader bfr = new BufferedReader(flr);
		int lines=0;
		
		while(bfr.readLine()!=null)
		{
			System.out.println(bfr.readLine());
			
			/*if(lines ==0)
			{
				String str = bfr.readLine();
				System.out.println("The line is --"+str);
			}
			lines++;*/
		}
		
		
	}

}
