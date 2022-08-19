package taskPrograms;
import java.util.Scanner;

public class SingleNumber
{
	public static void main(String[] args) 
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scn.nextInt();
		int sum=0;
		while(n>0)
		{
			int temp=n%10;
			sum=sum+temp;
			n=n/10;	
		}
		
		if(sum<9)
		{
			System.out.println(sum);
		}
		else 
		{
			int sum1=0;
			while(sum>0)
			{
				int temp=sum%10;
				sum1=sum1+temp;
				sum=sum/10;	
			}	
			if(sum1>9)
			{
				int sum2=0;
				while(sum1>0)
				{
					int temp=sum1%10;
					sum2=sum2+temp;
					sum1=sum1/10;	
				}	
				System.out.println(sum2);
			}
			else
			{
				System.out.println(sum1);
			}
		}
	
	}
}
