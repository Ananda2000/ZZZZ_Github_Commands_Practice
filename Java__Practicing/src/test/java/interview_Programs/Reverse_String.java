package interview_Programs;

public class Reverse_String 
{
	public static void main(String [] args)
	{
		String str ="This is java";
		
		int len = str.length();
		String ss = reversing(len,str);
		System.out.println(ss);
	}
	
	public static String reversing(int aa, String stt)
	{
		StringBuffer strb = new StringBuffer();
		for(int i=aa-1; i>=0;i--)
		{
			strb.append(stt.charAt(i)); 
		}
		String ggg = strb.toString();
		return ggg;
	}

}
