package string_programs;

public class ToStringMEthodClass 
{
	int rollno;
	String name;
	public ToStringMEthodClass(int rollno, String name) {
		//super();
		this.rollno = rollno;
		this.name = name;
	}
	@Override
	public String toString()
	{
		return "Name :"+name+" -- rollno :"+rollno ;
		
	}
	
	
	
	

}
