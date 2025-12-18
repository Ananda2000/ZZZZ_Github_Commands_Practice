// THIS PROGRAM WE ARE WRITING DATA INTO FILE FROM USER INPUT...

package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteDataIntoFile_1 
{
	public static void main(String [] args) throws IOException
	{

		System.out.println("Enter the string");
		Scanner st = new Scanner(System.in);
		String str = st.nextLine();
		
		System.out.println("---------------------"+str);
		
		File fil = new File("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\guru.text");
		FileWriter flw = new FileWriter(fil);
		flw.write(str);
		flw.close();
		
		
	}

}
