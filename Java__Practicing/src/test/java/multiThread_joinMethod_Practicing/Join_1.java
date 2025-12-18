package multiThread_joinMethod_Practicing;

public class Join_1 
{
	public static void main(String [] args) throws InterruptedException
	{
		Join_1a jjj = new Join_1a();
		
		Thread th = new Thread(jjj);
		Thread th1 = new Thread(jjj);
		System.out.println("Starting thread 1");
		th.start();
		th.join();
		th.join();
		System.out.println("Starting thread 2");
		th1.start();
		
		
		
		
		
	}

}
