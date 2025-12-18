package string_programs;

public class Split_methodUse 
{
	public static void main(String[] args)
	{
		String split1 ="this.is.java";
		//String replace = 
		
		String [] aftersplit =split1.split("\\.");
		for (String jjjj : aftersplit) 
		{
			System.out.println(jjjj);
		}
	}

}
