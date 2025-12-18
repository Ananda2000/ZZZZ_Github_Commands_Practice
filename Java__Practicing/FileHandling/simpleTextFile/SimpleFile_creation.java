package simpleTextFile;
// IN THIS PROGRAM WE ARE CHECKING THE FILE, IF IT NOT EXISTS, CREATE THE FILE,, ELASE IT WILL DISPLAY 
// FILE ALREADY PRESENT MESSAGE//.



import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class SimpleFile_creation 
{
	public static void main(String [] args) throws IOException
	{

		System.out.println("please enter the file name :");
		Scanner scn = new Scanner(System.in);
		String filename = scn.next();
		File filess = new File("D:\\FileHandlingPRactice\\"+filename);
		
		if(filess.exists())
		{
			System.out.println("file already present");
		}
		else if (!filess.exists()) 
			
		{
			filess.createNewFile();
			System.out.println("File created successfully");
		}
		else {
			System.out.println("file not created ---- please check the program");
		} 
	}

}
