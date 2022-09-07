package taskPrograms;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Loop 
{
	public static void main(String[] args) throws IOException 
	{
		FileReader fr=new FileReader("a.txt");
		BufferedReader br=new BufferedReader(fr);
		String s;
		while((s=br.readLine()) !=null)
		{
			System.out.println(s);
		}
	}
}
