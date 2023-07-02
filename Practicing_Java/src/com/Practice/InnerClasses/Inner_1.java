// Member inner class examples
package com.Practice.InnerClasses;

public class Inner_1 
{
	private int a =30;
		class inner_2 
		{
			void msg()
			{
				System.out.println("This is method in inner class --"+a);
			}
		}
		public static void main(String[] args)
		{
			Inner_1 i1 = new Inner_1();
			Inner_1.inner_2 i2 = i1.new inner_2();
			
			i2.msg();
		}

}
