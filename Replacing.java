package taskPrograms;

public class Replacing 
{
	public static void main(String[] args) 
	{
		String s="Hello";
		s=s.toLowerCase();
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
			{
				s1=s1+"*";
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		String s2="";
		for(int i=0;i<s.length();i++)
		{
			if(i%2!=0)
			{
				s2=s2+"#";
			}
			else
			{
				s2=s2+s1.charAt(i);
			}
		}
		
		System.out.println(s2);
	}
}
