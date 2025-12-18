package basic_Java_Programs;

import java.util.ArrayList;
import java.util.List;

public class zzzz_testing_pojoboject 
{
	public static void main(String [] args)
	{
		List<zzz_pojo_student> lis = new ArrayList<zzz_pojo_student>();
		zzz_pojo_student std1 = new zzz_pojo_student(1, "anand");
		zzz_pojo_student std2 = new zzz_pojo_student(2, "anand_1");
		lis.add(std1);
		lis.add(std2);
		System.out.println(std1 instanceof Object);
		
		System.out.println("THIS IS ARRAY LIST---	"+lis);
		
		System.out.println("array list size"+lis.size());
		for (zzz_pojo_student object : lis) 
		{
			System.out.println(object.getId());
		}
		
		
	}
	
		
}
