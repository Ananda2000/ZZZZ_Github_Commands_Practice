package basic_Java_Programs;

public class InvalidAgeException extends Exception
{
	public InvalidAgeException(String str)
	{
		//calling the constructor of parent exception...
		super(str);
	}
	

}
