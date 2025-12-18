// Here we are using createNewFile method to create a new file if it does no 
/*The createNewFile() method/function is a part of File class in java. It creates new empty file. The function returns true if the abstract file path does not exists and new file is created.  
It returns false if the file name already exists.
*/
package file_Class;
import java.io.File;
import java.io.IOException;
public class CreatingNewFile {
	
	public static void main(String [] args) throws IOException
	{
		File fl = new File("D:\\FileHandlingPRactice\\create_newFile.txt");
		if(fl.createNewFile())
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("File already existing..");
		}
	}
}
