package multiThreading;

public class CreateThreadUsingThreadClass extends Thread
{
	public void run()
	{
		System.out.println("This using thread class");
	}

	public static void main(String[] args)
	{
		CreateThreadUsingThreadClass t = new CreateThreadUsingThreadClass();
		t.start();
	}
}
