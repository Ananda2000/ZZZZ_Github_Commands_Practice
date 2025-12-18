package interview_Programs;

public class FindalphabestAndNumbersInString 
{
	public static void main(String [] args)
	{
		String str = "bala 2024";
		int dig =0;
		int charss =0;
		char [] aa = str.toCharArray();
		
		for (char cc : aa) 
		{
			if(Character.isDigit(cc))
			{
				dig++;
			}
			if(Character.isLetter(cc))
			{
				charss++;
			}
			
		}
		
		System.out.println("this is are numbers ---"+dig);
		System.out.println("The total number characters --"+charss);
	}

}
