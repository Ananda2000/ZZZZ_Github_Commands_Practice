// THIS PROGRAM WILL DISPLAY THE FILE INFORMATION.....

package fileHandling;

import java.io.File;

public class Getfileinformation 
{
	public static void main(String []args)
	{
		File f1= new File("D://Laerdal_Docs/anand.txt");
		if(f1.exists())
		{

			System.out.println("File name is --> "+f1.getName());
			System.out.println("-----------------------------------");
			System.out.println("is file readable --> "+f1.canRead());

			System.out.println("-----------------------------------");
			
			System.out.println("File path (absolute path)--> "+ f1.getAbsolutePath());

			System.out.println("-----------------------------------");
			
			System.out.println("Can we write to file ---> "+f1.canWrite());

			System.out.println("-----------------------------------");
			
			System.out.println("The file length --> "+f1.length());
			System.out.println("-----------------------------------");
			
			
		}
		else {
			System.out.println("File does not exist");
		}
	}
	

}
