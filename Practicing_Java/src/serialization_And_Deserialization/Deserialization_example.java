package serialization_And_Deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization_example 
{
	public static void main (String[] args) throws IOException, ClassNotFoundException
	{
		FileInputStream finstr = new FileInputStream("D:\\harish\\TestingSerialiazeAndDeserialize\\file.ser");
		ObjectInputStream objinpstr = new ObjectInputStream(finstr);
		Serialization_Example ss2 =(Serialization_Example) objinpstr.readObject();
		
		System.out.println(ss2.a +"---"+ss2.s1);
		
		objinpstr.close();
		
		
	}

}
