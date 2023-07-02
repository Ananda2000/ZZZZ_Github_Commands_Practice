// THIS PROGRAM WE DELETE A FILE PROGRAMATICALLY....

package fileHandling;

import java.io.File;
import java.io.IOException;

public class Delete_A_File 
{
		public static void main(String [] args) throws InterruptedException
		{
			File f12 = new File("D://Laerdal_Docs/anand1.txt");
			if(!f12.exists())
			{
				try {
					f12.createNewFile();
					System.out.println("The file name is -->"+f12.getName());
					Thread.sleep(9000);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			else
			{
				System.out.println("File already created");
			}
			
			
			if(f12.exists())
			{
				f12.delete();
				System.out.println("The file deleted successfully"+f12.getName());
			}
			else
			{
				System.out.println("File does not found----TO DELETE");
			}
		}

}
