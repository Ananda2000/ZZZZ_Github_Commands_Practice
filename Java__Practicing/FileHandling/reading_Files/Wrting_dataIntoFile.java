// HERE WE ARE USING BUFFEREDWRITER METHOD TO WRITE DATA INTO WRITE DATA INTO FILE..

package reading_Files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Wrting_dataIntoFile 
{
	public static void main(String [] args) throws IOException
	{
		FileWriter fwr = new FileWriter("D:\\FileHandlingPRactice\\anand123.txt");
		BufferedWriter bfwt = new BufferedWriter(fwr);
		List<String> arlist = new ArrayList<String>();
		Scanner scan ;
		System.out.print("please enter the name :-");
		String ch ="y";
		
		do
		{
			scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println("this is name - "+str);
		arlist.add(str);
		
		System.out.println("you like enter one more name type Y");
		scan = new Scanner(System.in);
		ch = scan.nextLine();
		
		}while(ch.equalsIgnoreCase("y"));
		System.out.println(arlist);
		
		for (String string : arlist) 
		{
			bfwt.write(string);
			bfwt.write("\n");
			
		}
		bfwt.close();
		
	}

}
