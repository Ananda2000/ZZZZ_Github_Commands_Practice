// HERE WE ARE CHECKING METHODS THAT HELPFUL TO PERFORM OPERATIONS ON FILE..

package simpleTextFile;

import java.io.File;

public class Methods_of_File_Handling
{
	public static void main(String [] args)
	{
		File fle = new File("D:\\FileHandlingPRactice\\kumar.txt");
		
		System.out.println("CANEXECUTE() THE FILE---"+fle.canExecute());
		
		System.out.println("CanRead() the file ---"+fle.canRead());
		
		System.out.println("getName() the file name -- "+fle.getName());
		
		System.out.println("It will display absolute path of file..--  "+fle.getAbsolutePath());
		
		System.out.println(" It will display the last modified date.--   "+fle.lastModified());
		
		System.out.println("Verify it is file or directory --  "+fle.isFile());
		
		
		
	}

}
