package multiThreading;

public class Runnable_Interface implements Runnable{

	public void run() {
		
		// TODO Auto-generated method stub
		System.out.println("this using runnable interface....");
		System.out.println();
	}

	public static void main(String [] args)
	{
		Runnable_Interface rns = new Runnable_Interface();
		Thread tr= new Thread(rns, "Nanda");
		tr.start();
		String str = tr.getName();
		System.out.println("The thread name is -----"+str);
}
}
