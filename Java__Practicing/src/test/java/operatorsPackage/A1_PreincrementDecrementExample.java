package operatorsPackage;

public class A1_PreincrementDecrementExample 
{
	public static void main(String [] args)
	{
		int x=2;
		int y=0;
		
		//y= x +x *x++;
		//x+= x++ + ++x/2;
		y =++x *x +x;
		//y=++x +x;
		//x++ ;
		System.out.println("The y values =="+y);
		System.out.println("The x vlaue == "+x);
	}

}
