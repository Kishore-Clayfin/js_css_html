package taskPrograms;

import java.util.Scanner;

public class CountWords 
{
	static int countWords(String paragraph,String find)
	{
		String[] s=paragraph.split(" ");
		int count=0;
		for(int i=0;i<s.length;i++)
		{
			if(find.equals(s[i]))
			{
				count++;
			}	
		}
		if(count==0)
		{
			System.out.println("The given word is not Valid");
		}
		return count;
	}
	public static void main(String[] args)
	{
		String paragraph="Humans (Homo sapiens) are the most is abundant and widespread species of primate characterized by bipedalism and large complex brains This has enabled the development of advanced tools culture and language Humans are highly social is and tend to live in complex social structures composed of many cooperating and competing groups from families and kinship networks to political states Social interactions between humans have established a wide variety of values social norms and rituals which bolster human society Curiosity and the human desire to understand and influence the environment and to explain and manipulate phenomena have motivated humanity's is development of science philosophy is mythology religion and other fields of study";
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter the word to find ");
		String find=scn.next();
		int count=countWords(paragraph,find);
		if(count>0)
		{
			System.out.println("The word "+find +" repeated for: "+count);
		}
	}
	
}
