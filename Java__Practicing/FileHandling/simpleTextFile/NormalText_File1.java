package simpleTextFile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class NormalText_File1 
{
	public static void main(String [] args) throws IOException
	{
		File fl = new File("D:\\FileHandlingTesting\\ananda.txt");
		String fileLines ="D:\\FileHandlingTesting\\ananda.txt";
		String line;
		FileReader fr = new FileReader(fl);
		BufferedReader br ;
		Stream<String> linesss =Files.lines(Paths.get(fileLines));
		System.out.println((int)linesss.count());
		br = new BufferedReader(fr);
		while ((line=br.readLine())!=null)
		{
			System.out.println(line.split(" "));
		}
		
	}

}
