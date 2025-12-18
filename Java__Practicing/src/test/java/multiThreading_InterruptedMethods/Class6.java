package multiThreading_InterruptedMethods;

public class Class6 
{
	public static void main(String[] args)
	{
		Class5 t1 = new Class5();
		Class5 t2 = new Class5();
		Class5 t3 = new Class5();
		
		t1.start();
		t2.start();
		t3.start();
	}

}
