package multiThreading_InterruptedMethods;

public class Program_2 extends Thread 
{
	public void run()
	{
		try {
			Thread.sleep(2000);
			System.out.println("Thread is executed");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Thread is running .....");
		
	}
	
	public static void main(String [] args)
	{
		Program_2 t1= new Program_2();
		t1.start();
		
		t1.interrupt();
		
		
	}
}
