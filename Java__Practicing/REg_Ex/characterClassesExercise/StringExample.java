package characterClassesExercise;

public class StringExample 
{
	public static void main(String [] args)
	{
		 /*String str = "geekss@for@geekss";
	        String[] arrOfStr = str.split("@");
				int aaa = arrOfStr.length;
				
				System.out.println(aaa);
		*/		
		String str = "www.gaagle.com";
        String[] arrOfStr = str.split("\\.");
        
        System.out.println(arrOfStr.length);
		
        //System.out.println(arrOfStr[1]);
        StringBuffer str1 = new StringBuffer(arrOfStr[1]);
        
        StringBuffer str2 =new StringBuffer();
        
        for(int i=0;i<str1.length();i++)
        {
        	if(str1.charAt(i)=='a')
        	{
        		str2.append('o');
        	}
        	else
        	{
        		str2.append(str1.charAt(i));
        	}
        }
        System.out.println(str2);
        
		
	}

}
