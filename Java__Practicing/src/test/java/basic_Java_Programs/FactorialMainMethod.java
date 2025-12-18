package basic_Java_Programs;

import java.util.Scanner;

import javax.swing.text.html.HTMLEditorKit.Parser;
import javax.xml.bind.ParseConversionEvent;

public class FactorialMainMethod 
{
	public static void main(String [] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("PLEASE ENTER THE NUMBER --");
		String s1 = sc.next();
		FactorialMethod fm = new FactorialMethod();
		int kk =Integer.valueOf(s1);
		System.out.println(fm.fact(kk));
	}

}
