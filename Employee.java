package taskPrograms;

class Alpha extends Employee
{
	
}
class Beta extends Employee
{
	
}
public class Employee
{
	static int count=0;
	Employee() 
	{
		count++;
	}
	public static void main(String[] args) 
	{
		Employee e1=new Employee();
		Employee e2=new Employee();
		
		Alpha a1=new Alpha();
		Alpha a2=new Alpha();
		
		Beta b1=new Beta();
		Beta b2=new Beta();
		
		
		System.out.println(count+" Objects Created");
	}
}
