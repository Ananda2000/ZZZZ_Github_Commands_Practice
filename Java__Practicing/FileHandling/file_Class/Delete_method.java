package file_Class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Delete_method 
{
	public static void main(String [] args) throws IOException
	{
		
	Path fl2 = Paths.get("D:\\FileHandlingPRactice\\Delete_testing.txt");
	File fl = new File("D:\\FileHandlingPRactice\\Delete_testing.txt");
	if(fl.exists())
	{
		Files.delete(fl2);
	}
	else
	{
		System.out.println("file does not exists so cant perform delete operation...");
	}
	}
}
