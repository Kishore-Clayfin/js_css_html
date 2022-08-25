package taskPrograms;
//Parent class and child class has same variable name
class A
{
	int a=10;
}
class B extends A
{
	
	 int a=5;
}
public class practise1
{
	
	public static void main(String[] args) 
	{
		B b1=new B();
		b1.a=25;
		System.out.println(b1.a);
	
	}
}
