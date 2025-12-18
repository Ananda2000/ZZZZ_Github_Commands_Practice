// This method is used, check the file/directory exists or not...
package file_Class;

import java.io.File;

public class Exists_Method 
{
	public static void main(String [] args)
	{
		File fl = new File("D:\\FileHandlingPRactice\\create_newFile.txt");
		boolean existts = fl.exists();
		if(existts)
		{
			System.out.println("The file Create_newFile is present");
		}
		else
		{
			System.out.println("The file is not present....");
		}
	}
}
