package threadScheduler;

public class Thread1_scheduler extends Thread{
	
	public void run()
	{
		System.out.println("---"+Thread.currentThread().getName());
		System.out.println("this is running");
	}
	public static void main(String [] args)
	{
		Thread1_scheduler t1= new Thread1_scheduler();
		Thread1_scheduler t2 = new Thread1_scheduler();
		t1.setName("Ananda");
		t2.setName("anand2");
		System.out.println(t1.getName());
	
		t1.setPriority(5);
		t2.setPriority(2);
		t1.start();
		
		t2.start();
		
		}

}
