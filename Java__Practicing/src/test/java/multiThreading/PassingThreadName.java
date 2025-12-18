package multiThreading;

public class PassingThreadName extends Thread
{
	String str ;
	PassingThreadName (String name)
	{
		str=name;
	}
	public void run()
	{
		System.out.println("This is passing ");
		System.out.println("The thread name is --"+str);
	}
	
	public static void main(String[] args)
	{
		PassingThreadName t12 = new PassingThreadName("anand");
		t12.start();
	String str1=	t12.getName();
	System.out.println("The name is ---"+str1);
		
		
	}

}
