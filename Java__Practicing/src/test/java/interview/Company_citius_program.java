// this program on 8-june-2024, asked citius company.. 
// find the words which is having t and r characters...
//{"Monday","Tuesday","Wednesday","Thursday","Friday"};


package interview;

public class Company_citius_program
{
	public static void main(String [] args)
	{
		String [] aaa={"Monday","Tuesday","Wednesday","Thursday","Friday"};
		//String [] bb = {" "};
		StringBuffer strb = new StringBuffer();
		
		int leng = aaa.length;
		System.out.println(leng);
		
		for(int i=0;i<leng;i++)
		{
			int lengths = aaa[i].length();
			System.out.println();
			System.out.println("---"+lengths);
			for(int j=0;j<lengths;j++)
			{
				char aa =(aaa[i].charAt(j));	
				if(aa=='r' || aa=='t' || aa=='T' || aa=='R')
				{
					System.out.println("------ Inside r and t");
						//bb[i]=bb[i].concat(aaa[i]);
					strb.append(aaa[i]);
						break;
				}
			}
			System.out.println(strb);
			
		}
	
	}

}
