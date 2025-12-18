package reading_Files;
// THIS PROGREAM READS THE DATA CHARACTER BY CHARACTER..
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Use_FileReader
{
	public static void main(String [] args) throws IOException
	{
		FileReader fr = new FileReader("D:\\FileHandlingPRactice\\kuarml9999.txt");
		
		int i=0;
	
		while((i=fr.read())!=-1)
		{
			System.out.print((char)i);
			
		}
		fr.close();
	}

}
