package interview;

public class String_examples 
{
	public static void main(String[] args)
	{
		String str ="ananda";
		System.out.println("----------"+str.hashCode());
		
		 str= str+"123";
		 
		 System.out.println("---------"+str.hashCode());
		 
		 StringBuilder strbuild = new StringBuilder("hello");
		 
		 System.out.println("----------string Build ---"+strbuild+"----"+strbuild.hashCode());
		 
		 strbuild =strbuild.append("jjjjj");
		 System.out.println("----------string Build ---"+strbuild+"----"+strbuild.hashCode());
		 System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		 
		 StringBuffer strbuff = new StringBuffer("nanda");
		 
		 System.out.println("----------string Build ---"+strbuff+"----"+strbuff.hashCode());
		 
		 strbuff = strbuff.append("999");
		 System.out.println("----------string Build ---"+strbuff+"----"+strbuff.hashCode());
			
		 
		 
		 
		 
	}

}
