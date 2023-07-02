// THIS PROGRAM WILL CREATE NEW FILE IF THE FILE DOES NOT EXISTS....

package fileHandling;

import java.io.File;
import java.io.IOException;

public class CreateNewFile 
{

	public static void main(String [] args)
	{
		File f0 = new File("D://Laerdal_Docs/anand.txt");
		if(f0.exists())
		{
			System.out.println("The file already present....");
			
		}
		else {
			try {
				f0.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("The file created successfully - FILE NAME IS -->  "+f0.getName());
			
		}
	}
}
