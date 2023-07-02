package synchronizationInMultiThreading;

public class Sender {
	
	//String msg;
	
	public void messagesending(String msg)
	{
		System.out.println("message is sending "+msg);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(msg+"sent successfully.-----------");
		
	
	}

}
