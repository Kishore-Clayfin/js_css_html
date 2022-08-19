package taskPrograms;

import java.util.Scanner;

public class IndividualWordFormat 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=scn.nextInt();
		String s=Integer.toString(a);
		char [] ch=s.toCharArray();
		String result="";
		for(int i=0;i<ch.length;i++)
		{
			char value=ch[i];
			String temp="";
			switch (value) 
			{
				case '0':
					temp="zero";
					break;
				case '1':
					temp="one";
					break;
				case '2':
					temp="two";
					break;
				case '3':
					temp="three";
					break;
				case '4':
					temp="four";
					break;
				case '5':
					temp="five";
					break;
				case '6':
					temp="six";
					break;
				case '7':
					temp="seven";
					break;
				case '8':
					temp="eight";
					break;
				case '9':
					temp="nine";
					break;	
			}
			result=result+" "+temp;
			
		}
		
		System.out.println(result);
	}
}
