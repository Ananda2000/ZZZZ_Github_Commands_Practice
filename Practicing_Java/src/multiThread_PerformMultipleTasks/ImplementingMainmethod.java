package multiThread_PerformMultipleTasks;

public class ImplementingMainmethod 
{
	public static void main(String [] args)
	{
		int num=5;
		Add_AndEvenNumbersMethods_ExtendsThreadClass oe = new Add_AndEvenNumbersMethods_ExtendsThreadClass(num);
		Thread t1 = new Thread(){
			public void run()
			{
				oe.displayEvenNumber();
			}
		};
		
		Thread t2 = new Thread(){
			public void run()
			{
				oe.displayOddNumber();
			}
		};
		
		t1.start();
		t2.start();
		
	}

}
