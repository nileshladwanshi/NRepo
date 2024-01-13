package collectionUse;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetUsage {

	public static void main(String[] args)
	{
		TreeSet<Integer> ts=new TreeSet<Integer>();
		
//		ts.add(null);   No NULL value is acceptable if integer
//ts.add(null);
		ts.add(879);
		ts.add(247);
		ts.add(4566);
		ts.add(554);
		ts.add(784);
		ts.add(7);
		ts.add(8715);
		ts.add(879);
		ts.add(453204045);
		ts.add(4582);
		ts.add(247);
		System.out.println(ts.size());
		System.out.println("========");

		System.out.println(ts.tailSet(879));//Returns whose elements are greater than or equal to fromElement
		System.out.println("========");

		System.out.println(ts.remove(879));
		System.out.println("========");

		System.out.println(ts.ceiling(4582));
		System.out.println("==============");
		System.out.println(ts.first());
		
		
		System.out.println("========");
		
		System.out.println(ts.floor(4582));
		System.out.println("========");
		
		System.out.println(ts.pollFirst());//return and remove lowest element 
		System.out.println("========");

		System.out.println(ts.last());
	System.out.println("========");

				
		System.out.println(ts.higher(247));
		System.out.println("========");

System.out.println(ts.lower(4582));
		

//		for(int i=0;i<=ts.size()-1;i++)
//		{
//			System.out.println(ts.getClass());
//		}
		System.out.println("======for each loop");
		
		for(Integer fl:ts)
		{
			System.out.println(fl);
		}
		System.out.println("===Iterator");
	
		Iterator<Integer> treesetIterator=ts.iterator();
		
		while(treesetIterator.hasNext())
		{
			System.out.println(treesetIterator.next());
		}
		
		
		
		
	}
}
