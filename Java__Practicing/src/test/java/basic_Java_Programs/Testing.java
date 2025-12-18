package basic_Java_Programs;

public class Testing 
{
	public static void main(String[] args) {
        String str1 ="I am an automation tester";
        
        
        int j = str1.length();
        System.out.println(j);
        
        j = j-1;
       for(int i=0;j>=i;j--)
        //for(int i=0;j>i;j--)
        {
            System.out.print(str1.charAt(j));
        }
        //System.out.println("Hello, World!");
    }

}
