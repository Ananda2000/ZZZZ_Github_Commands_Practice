// THIS IS SAMPLE PROGRAM FOR BUFFERD WRITTER..

package bufferReaderAndWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class BufferedWritter 
{
	public static void main(String [] args) throws IOException
	{
		FileWriter fwr = new FileWriter("C:\\Users\\ANANDA K R\\Desktop\\JavaNotes\\bufferedwritter.txt",true);
		BufferedWriter bfw = new BufferedWriter(fwr);
		bfw.newLine();
		bfw.write("this is anand");
		bfw.newLine();
		bfw.write("this is 2nd line...");
		bfw.flush();
		bfw.close();
		System.out.println("this is success");
		
	}

}
