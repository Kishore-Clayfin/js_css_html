package collection;

import java.util.ArrayList;
import java.util.List;

import taskPrograms.NumbersToWords;

public class GenericEg
{
	public static void main(String[] args)
    {
 
        // Upper Bounded Integer List
        List<Integer> l = new ArrayList<Integer>();
        l.add(4);
        l.add(5);
        l.add(25);
        l.add(7);
        l.add(8);
        // printing the sum of elements in list
        System.out.println("Total sum is:" + sum(l));
 
        List<Double> l2 = new ArrayList<Double>();
        l2.add(4.1);
        l2.add(5.1);
        l2.add(25.1);
        l2.add(7.1);
        l2.add(8.1);
        
        System.out.println(sum(l2));
      
    }
 
	private static double sum(List<? extends Number> list)
    {
        double sum = 0.0;
        for (Number i : list) {
            sum += i.doubleValue();
        }
 
        return sum;
    }

}
