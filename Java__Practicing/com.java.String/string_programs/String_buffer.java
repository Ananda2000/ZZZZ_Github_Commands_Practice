package string_programs;

public class String_buffer 
{
	public static void main(String [] args)
	{
		StringBuffer str_buff = new StringBuffer("ananda");
		

		System.out.println("This is string buffer --"+str_buff);
		
		str_buff.reverse();
		System.out.println("This is string buffer --"+str_buff);
	}

}
