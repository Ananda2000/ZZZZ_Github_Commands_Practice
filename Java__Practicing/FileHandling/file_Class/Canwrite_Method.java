package file_Class;
import java.io.File;

public class Canwrite_Method 
{
	public static void main(String [] args)
	{
		File fl = new File("D:\\FileHandlingPRactice\\create_newFile.txt");
		boolean can_write = fl.canWrite();
		if(can_write)
		{
			System.out.println("Can successfully write into File");
		}
		else
		{
			System.out.println("Cant able to write into File --");
		}
	}
}
