// FIND THE 2ND LARGEST NUMBER IN ARRAYS WITHOUT INBUILD METHODS...
package interview_Programs;

public class Second 
{
	
	public static void main(String [] args)
	{
		int [] a = {2,4,0,9,1};
		int g;
		int temp;
		
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("------------iiiiiiii----"+i);
			for (int j=i+1;j<a.length;j++)
			{
				System.out.println("------------jjjjjjjjjjj----"+j);
				if (a[i] > a[j])   
                {  
					temp = a[i];  
                    a[i] = a[j];  
                    a[j] = temp;  
                }  
			}
		}
		
		/*int len= a.length;
		for(int j=0;j<len;j++)
		{
			if(k<2)
			{
		if (a[j]< a[k])
			{
				g=a[j+1];
				a[j+1]=a[j];
				a[j]=g;
			}
			k++;
		}
			if(k==2)
			{
				a[j]=a[k];
				break;
			}
		}
		
		for(int h=0;h<len;h++)
		{
			System.out.println(a[h]);
		}

*/
		
		int gg = a[a.length-2];
		System.out.println(gg);
		
	}
}
