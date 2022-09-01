package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GenericEg2 
{
	public static void main(String[] args) 
	{

		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(4);
		l1.add(5);
		l1.add(25);
		l1.add(7);
		l1.add(8);

		List<Integer> l2 = new ArrayList<Integer>();
		l2.add(4);
		l2.add(5);
		l2.add(25);
		l2.add(7);
		l2.add(8);

		print(l1);
		print(l2);

		// List<Double> list3 = Arrays.asList(4.5, 5.4, 6.5, 7.6);

		// print(list3); ==> compile time error
	}

	public static void print(List<? super Integer> list)
	{
		System.out.println(list);
	}
}
