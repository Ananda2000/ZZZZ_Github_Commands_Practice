package basic_Java_Programs;

public class TestCustomException1 
{
	static void validate(int age) throws InvalidAgeException
	{
		if(age<18)
		{
			throw new InvalidAgeException("Not elligible to vote");
		}
		else
		{
			System.out.println("Welcome to vote");
		}
	}
	public static void main(String [] args)
	{
		try
		{
			validate(13);
		}
		catch (InvalidAgeException e) {
			// TODO: handle exception
			System.out.println("Caught the exception");
			System.out.println("Exception occured --"+e);
		}
		System.out.println("Rest of the code");
	}
}
