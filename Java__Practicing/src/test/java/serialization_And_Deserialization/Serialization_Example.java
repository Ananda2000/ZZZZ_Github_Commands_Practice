package serialization_And_Deserialization;

import java.io.Serializable;

public class Serialization_Example implements Serializable
{
	public int a;
	public String s1;
	
	public Serialization_Example(int a, String s1)
	{
		this.a =a;
		this.s1=s1;
		
	}
}
