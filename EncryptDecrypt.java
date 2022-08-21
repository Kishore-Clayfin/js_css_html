package taskPrograms;
import java.util.Scanner;
public class EncryptDecrypt 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=scn.next();
		char[] d=encrypt(s);
		decrypt(d);
	}
	static char[] encrypt(String s)
	{
		int key=64;
		char[] ch=s.toCharArray();
		int[] temp=new int[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			 temp[i]=ch[i]-key;
		}
		System.out.print("Encrypted Text: ");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=(char) temp[i];
			System.out.print(ch[i]);
		}
		System.out.println();
		return ch;
	}
	static void decrypt(char[] ch1)
	{
		int key=64;
		int[] temp1=new int[ch1.length];
		for(int i=0;i<ch1.length;i++)
		{
			 temp1[i]=ch1[i]+key;
		}
		System.out.print("Decrypted Text: ");
		for(int i=0;i<ch1.length;i++)
		{
			ch1[i]=(char) temp1[i];
			System.out.print(ch1[i]);
		}
		System.out.println();
	}
}
