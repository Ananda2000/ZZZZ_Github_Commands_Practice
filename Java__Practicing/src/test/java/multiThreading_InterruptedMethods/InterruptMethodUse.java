// HERE WE ARE USING INTERRUPT METHOD FOR PRACTICING..

package multiThreading_InterruptedMethods;



public class InterruptMethodUse extends Thread 
{
public void run()
{
	try {
		Thread.sleep(8000);
		System.out.println("The system is generated ----");
	} catch (InterruptedException e) {
		
		//e.printStackTrace();
		throw new RuntimeException( "Thread interrupted..."+e);
	}
	
}

public static void main(String [] args)
{
	InterruptMethodUse t1 = new InterruptMethodUse();
	t1.start();
	
	t1.interrupt();
}
	
}
