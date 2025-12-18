//THIS PROGRAM IS INTERRUPTED, USE OF ISINTERRUPTED OR INTERRUPTED METHODS

package multiThreading_InterruptedMethods;

public class Program4 extends Thread
{
	public void run()
	{
		for(int i=1;i<=2;i++)
		{
			if(Thread.interrupted())
			{
				System.out.println("Thread is interrupted");
			}
			else
			{
				System.out.println("Thread is running");
			}
		}
	}

	public static void main(String []args)
	{
		Program4 t1 = new Program4();
		Program4 t2 = new Program4();
		
		t1.start();
		t1.interrupt();
		
		t2.start();
	}
}
