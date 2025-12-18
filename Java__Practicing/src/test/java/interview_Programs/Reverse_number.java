package interview_Programs;

public class Reverse_number 
{
	public static void main(String [] args)
	{
		int a =24;
		int rev=0;
	while(a!=0)
	{
		int reminder = a%10;
		rev= rev*10+reminder;
		a=a/10;
		
	}
	System.out.println(rev);
}
}
