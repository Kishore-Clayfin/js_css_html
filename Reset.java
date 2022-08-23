package taskPrograms;

import java.util.Locale;
import java.util.Scanner;

public class Reset 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner("hi-hello-how are you");
		scn.useRadix(15);
		scn.useLocale(Locale.CHINA);
		System.out.println("Before Reset");
		System.out.println(scn.radix());
		System.out.println(scn.locale());
		scn.reset();
		System.out.println("After Reset");
		System.out.println(scn.radix());
		System.out.println(scn.locale());
	}
}
