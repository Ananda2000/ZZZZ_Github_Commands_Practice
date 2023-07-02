//SYNCHROMNIZED BLOCK IN MULTI THREADING..

package synchronizationInMultiThreading;

public class A_1_program {
	public static void main(String [] args)
	{
		Sender s1 = new Sender();
		ImplementingThreadclass t1 = new ImplementingThreadclass("Hello anand", s1);
		ImplementingThreadclass t2 = new ImplementingThreadclass("Good morning ",s1);
		
		t1.start();
		t2.start();
		
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
