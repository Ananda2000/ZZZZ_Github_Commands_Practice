//input	String str="asd123 dgw35df wi13gdf9";
//o/p : 123+35+13+9=180

package interview_Programs;

public class Thermofisher_program 
{
	public static void main(String [] args)
	{
		String str="asd123 dgw35df wi13gdf9";
		StringBuffer strb;
		
		int sum=0;
	
	int len = str.length();
	//char ch ;
	for(int i=0;i<len;i++)
	{
		strb = new StringBuffer();
		boolean ch = Character.isDigit(str.charAt(i));
		if(ch)
		{
			
		while(ch)
		{
			//System.out.println(i);
			strb = strb.append(str.charAt(i));
			i++;
			if(i==len) 
			{
				break;
			}
			ch = Character.isDigit(str.charAt(i));
		}
	
		String ggg =strb.toString();
		
		int aaa = Integer.parseInt(ggg);
		System.out.println("=="+aaa);
		sum +=aaa; 
		}
		
			//sfadfa ..aaa this program is not executing..aaa hence observe the stack overflow..
	}
	System.out.println("The total is "+ sum);
	
	}
}
