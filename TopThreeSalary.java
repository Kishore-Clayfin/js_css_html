package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TopThreeSalary 
{
	public static void main(String[] args) 
	{
		List l=new ArrayList();
		l.add(new Employee("ABC",101, 500000.0));
		l.add(new Employee("WXY",103, 100000.0));
		l.add(new Employee("ART",105, 205000.0));
		l.add(new Employee("GHI",104, 300000.0));
		l.add(new Employee("JLL",102, 200000.0));
		l.add(new Employee("XYZ",106, 250000.0));
		System.out.println(l);
		
		Collections.sort(l);
		Collections.reverse(l);
		
		System.out.println();
		System.out.println("Top Three paid Salary for Employees  ");
		for(int i=0;i<3;i++)
		{
			System.out.println(l.get(i));
		}
		
		
	}
	
}
class Employee implements Comparable<Employee>
{
	private String name;
	private int id;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Employee(String name, int id, double salary) {
	
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", salary=" + salary + "]";
	}
	@Override
	public int compareTo(Employee o) 
	{
		if(this.salary>o.salary)
			return 1;
		else if(this.salary<o.salary)
			return -1;
		else
			return 0;
	}
		
}

