package serialization_And_Deserialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Demo1
{
	public static void main(String [] args)
	{
		Serialization_Example sea = new Serialization_Example(1,"Ananda");
		String fname = "D:\\harish\\TestingSerialiazeAndDeserialize\\file.ser";
		
		try {
			FileOutputStream fout = new FileOutputStream(fname);
			ObjectOutputStream objout = new ObjectOutputStream(fout);
			objout.writeObject(sea);
			objout.close();
			fout.close();
			
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		Serialization_Example obj1=null;
		
		
		
	}

}
