// THIS PROGRAM SHOWS WHEN THERE IS NO THREAD INTERUPTS ,

package multiThreading_InterruptedMethods;

public class Program_3 extends Thread
{
	public void run ()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	}
	
	public static void main (String [] args)
	{
		Program_3 p3 = new Program_3();
		p3.start(); // STARTING THE THREAD.
		
		p3.interrupt();
		
	
		
		
	}

}
