package basic_Java_Programs;

import java.util.Collections;
import java.util.Vector;

public class VectorDemo 
	{
		
		public static void main(String [] args)
		{
			Vector v1 = new Vector();
			System.out.println("vector size ----"+v1.capacity());
			
			Vector v2 = new Vector (15);
			System.out.println("This is with parameters ---"+v2.capacity());
			
			Vector v3 = new Vector (4, 5);
			System.out.println("this is  ----------"+v3.capacity());
			
			v3.add(1);
			v3.add(3);
			v3.add(5);
			v3.add(6);
			v3.add(0);
			///v3.add(9);
			
			System.out.println("this is  ----------"+v3.capacity());
			
			Vector v4 = new Vector(v3);
			
			System.out.println("-------------------------"+v4);
			
			Collections.sort(v3);
			System.out.println("After sorting ----------"+v3);
			
		}

	}
	
