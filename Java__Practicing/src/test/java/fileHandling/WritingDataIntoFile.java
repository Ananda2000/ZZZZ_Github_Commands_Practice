package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WritingDataIntoFile 
{
	public static void main(String [] args)
	{
		try {
			FileWriter f11= new FileWriter("D://Laerdal_Docs/anand.txt");
			
			f11.write("This is anand here");
			f11.close();
			
			System.out.println("File was written successfully");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Unexpected error occured.");
		}
		
	
		
	}

}
