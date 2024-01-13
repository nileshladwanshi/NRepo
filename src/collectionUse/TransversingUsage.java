package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class TransversingUsage {

	public static void main(String[] args) {
		ArrayList<Integer> in=new ArrayList<>();
		in.add(45);
		in.add(55);
		in.add(565);
		in.add(78);
		in.add(552);
		in.add(4555);
		System.out.println(in);

		System.out.println("========for loop=========");
		
		for(int i=0;i<=in.size()-1;i++)
		{
			System.out.println(in.get(i));
		}
		System.out.println("==========for each loop========");
		
		for(Integer ind:in)
		{
			System.out.println(ind);
		}
	
		System.out.println("==========for iterator loop==========");
       Iterator<Integer> il = in.iterator();
	while(il.hasNext())
	{
		System.out.println(il.next());
	}
	
	System.out.println("==========for listiterator loop==========");

	ListIterator<Integer> lis = in.listIterator();
	while(lis.hasNext())
	{System.out.println(lis.next());}
	
	System.out.println("==========for listiterator loop in reverse direction==========");

	while(lis.hasPrevious())
	{System.out.println(lis.previous());}
	
	
	
	
	
	
	}

}
