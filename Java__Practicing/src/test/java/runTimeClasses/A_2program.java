// CHECK THE HOW MANY PROCESSORS ARE AVAILABLE . USING JAVA CODE..

package runTimeClasses;

public class A_2program 
{
	public static void main(String[] args)
	{
		Runtime rr = Runtime.getRuntime();
		
		System.out.println("Available processors -- "+rr.availableProcessors());
	
		//System.out.println("The free");
		int freememory =(int) rr.freeMemory();
		int totalmemory = (int)rr.totalMemory();
		int usedmemory =totalmemory-freememory;
		System.out.println("THE TOTAL MEMORY IS --"+rr.totalMemory());
		System.out.println("THE FREE MEMORY IS -- "+rr.freeMemory());
		
		System.out.println("-----------------------------------------------------");
		System.out.println("The used memory is -- "+usedmemory);
	}
	

}
