package synchronizationInMultiThreading;

public class ImplementingThreadclass extends Thread
{
	Sender sender;
	String msg;
	
	ImplementingThreadclass(String s1, Sender sdr)
	{
		msg =s1;
		sender = sdr;
	}
	
	public void run()
	{
		synchronized (sender) 
		{
			sender.messagesending(msg);
			
		}
	}

}
