package taskPrograms;
public class Practise2  extends A4 implements I
{
	@Override
	public void get() 
	{
		System.out.println("Override");
	}
	public static void main(String[] args)
	{
		Practise2 p=new Practise2();
		p.get();
	}
}
class A4 
{
	public void get() 
	{
		System.out.println("Hii C");
	}
}
interface I
{
	public void get();
}

