package basic_Java_Programs;

public class Class_forTesting implements TestingInterface{
	
	public void run()
	{
		System.out.println("This is run method.");
	}
	
	
	public static void main (String [] args)
	{
		Class_forTesting cls = new Class_forTesting();
		cls.run();
	}

}
