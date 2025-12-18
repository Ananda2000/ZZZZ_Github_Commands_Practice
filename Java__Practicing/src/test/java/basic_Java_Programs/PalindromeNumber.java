package basic_Java_Programs;

public class PalindromeNumber {
	
	public static void main(String [] args)
	{
		int r,sum=0,temp;
		int n=454;
		temp=n;
		while(n>0)
		{
			r = n%10;
			System.out.println("The r value = "+r);
			sum = (sum*10)+r;
			System.out.println("The sum is = "+sum);
			n=n/10;
			System.out.println("The n value ="+n);
			System.out.println("======================================");
		}
	}

}
