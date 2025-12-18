package basic_Java_Programs;

public class FactorialMethod 
{
	public int fact(int a)
	{
		int g=a;
		int temp =1;
		
		while (g>0)
		{
			temp = temp*g;
			g--;
		}
		System.out.println("The factorail of g -"+temp);
		return temp;
	}

}
