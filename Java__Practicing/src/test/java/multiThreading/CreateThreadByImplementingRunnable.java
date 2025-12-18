package multiThreading;

public class CreateThreadByImplementingRunnable implements Runnable{

	public void run() {
		
		System.out.println("This is by using implementing runnable interface");
	}
	
	public static void main(String [] args)
	{
		CreateThreadByImplementingRunnable runtr= new CreateThreadByImplementingRunnable();
		Thread t1= new Thread(runtr);
		t1.start();
	}
	
	

}
