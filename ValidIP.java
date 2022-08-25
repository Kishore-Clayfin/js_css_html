package taskPrograms;

import java.util.Scanner;

public class ValidIP
{
	static void checkValidIP(String s)
	{
		String[] s1=s.split("[.]");
		int[] arr=new int[s1.length];
		int count=0;
		if(arr.length==4)
		{
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=Integer.parseInt(s1[i]);
				if(arr[i]<=255 && arr[i]>=0)
				{
					
					count++;
				}
				
			}
			if(count==4)
			{
				System.out.println(s+" The IP address is valid");
			}
			else 
			{
				System.out.println(s+" The IP address is not valid");
			}
		}
		else
		{
			System.out.println(s+" The IP address is not valid");
		}
 	}
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the IP Address");
		String s=scn.next();
		checkValidIP(s);
	}
}
