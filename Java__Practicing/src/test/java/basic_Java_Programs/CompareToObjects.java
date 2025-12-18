package basic_Java_Programs;

public class CompareToObjects 
{
	public static void main(String [] args)
	{
		Double x = new Double (1234.455);
		
		Long ll = new Long(123456);
		
		System.out.println(x.equals(ll));
		System.out.println(x.equals(1234.455));
	}

}
