package taskPrograms;

import java.util.Scanner;

public class Delimeter
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner("hi-hello-how are you");
		scn.useDelimiter("-| ");
		while(scn.hasNext())
		{
			System.out.println(scn.next());
		}
	}
}
