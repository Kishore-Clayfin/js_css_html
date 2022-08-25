package taskPrograms;

import java.util.Scanner;

class Student
{
	private String name;
	private int rollNumber;
	private int standard;
	private String section;
	
	public String getSection() 
	{
		return section;
	}
	public void setSection(String section) 
	{
		this.section = section;
	}
	public String getName()
	{
		return name;
	}
	public  void setName(String name)
	{
		this.name=name;
	}
	public int getRollNumber()
	{
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) 
	{
		this.rollNumber = rollNumber;
	}
	public int getStandard() 
	{
		return standard;
	}
	public void setStandard(int stanadrd)
	{
		this.standard = stanadrd;
	}
	
}

public class Encapsulation
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		Student s=new Student();
		System.out.println("Enter your Name");
		String s1=scn.next();
		
		System.out.println("Enter your Standard");
		int s2=scn.nextInt();
		
		System.out.println("Enter your Section");
		String s3=scn.next();
		
		System.out.println("Enter your Roll Number");
		int s4=scn.nextInt();
		
		s.setName(s1);
		s.setStandard(s2);
		s.setSection(s3);
		s.setRollNumber(s4);
		
		System.out.println("Name: "+s.getName()+" Standard: "+s.getStandard()+" Section: "+s.getSection()+" Roll Number: "+s.getRollNumber());
	}
}
