// Here we are checking we can read the file or not
package file_Class;
import java.io.File;

public class Can_read_file 
{
	public static void main(String [] args)
	{
		File fl = new File("D:\\FileHandlingPRactice\\create_newFile.txt");
// BELOW CHECKING CAN READ THE FILE USING {canread()} method its return type is boolean.
		boolean canread_method = fl.canRead();
		System.out.println(canread_method);
		if(canread_method)
		{
			System.out.println("We can read the file");
		}
		else
		{
			System.out.println("You can not read the file.");
		}
	}
}
