// THIS PROGRAM WE READING THE DATA FROM A TXT FILE..

package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.stream.Stream;

public class ReadingFromFile 
{
	public static void main (String [] args)
	{
		File f11 = new File("D://Laerdal_Docs/anand.txt");
		Path paths = Paths.get("D://Laerdal_Docs/anand.txt");
		long len =0;
		
		try {
			len = Files.lines(paths).count();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		System.out.println("The lines are  --> "+len);
		int count = 0;
		if (f11.exists())
		{
			try {
				Scanner sca = new Scanner(f11);
				while(sca.hasNextLine())
				{
					count++;
					String line = sca.nextLine();
					//System.out.println("The data is -->"+line);
					//System.out.println(line);
					if(count==5)
					{
						System.out.println(line);	
						String [] aa = line.split(" ");
						int leng= aa.length;
						for(int i=0;i<=leng;i++)
						{
							if(i==1)
							{
								System.out.println(aa[i]);
							}
						}
					}
					
				
					
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		else {
			System.out.println("The file not founds ---");
		}
	}

}
