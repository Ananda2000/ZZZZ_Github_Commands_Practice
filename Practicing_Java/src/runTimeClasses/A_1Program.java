// open the notepad in system using java program...

package runTimeClasses;

import java.io.IOException;

public class A_1Program 
{
	public static void main(String [] args)
	{
		try {
			Runtime.getRuntime().exec("notepad");
			System.out.println("Notepad opeened successfully.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
