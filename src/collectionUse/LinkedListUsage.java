package collectionUse;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListUsage {

	public static void main(String[] args) {
	
		LinkedList<String> ll=new LinkedList<String>();
		
		ll.add(null);
		ll.add("shyam");
		
		ll.add("shree shyam");
		ll.add("jai");
		System.out.println(ll);
		//ll.clear();
		System.out.println("clone is "+ll.clone());

		ll.addFirst(null);
		ll.addLast(null);
		System.out.println(ll);
		System.out.println(ll.contains(null));
		
		
		System.out.println(ll.get(3));

		System.out.println(ll.isEmpty());
		System.out.println(ll.peek());
		System.out.println(ll.lastIndexOf(null));		
	
		System.out.println(ll.getFirst());
	System.out.println(ll.getLast());
	System.out.println(ll.offer(null));// adding any value at end (tail)
	System.out.println(ll.offerFirst("jai"));
	System.out.println(ll.offerLast("shyam"));
	System.out.println(ll);
	System.out.println(ll.peek()); //fetch first value but not delete value 
	System.out.println(ll);

	System.out.println(ll.poll());//fetch first value and delete value 
	System.out.println(ll);

	System.out.println(ll.pollFirst());//fetch first value and delete value
	System.out.println(ll.pollLast());//fetch last value and delete value
	System.out.println(ll);
	System.out.println(ll.getFirst());//fetch first value but not delete value
	System.out.println(ll.getLast());//fetch last value but not delete value
	System.out.println(ll);
	
	System.out.println(ll.element());//fetch first value but not delete value
	System.out.println(ll.peekFirst());//fetch first value but not delete value
	System.out.println(ll.peekLast());//fetch last value but not delete value
	
	System.out.println("=========for loop============");
	System.out.println(ll.size());
	
	
	for(int i=0;i<=ll.size()-1;i++)
	{
		System.out.println(ll.get(i));
	}
	System.out.println("-----for each loop----");
	
	for(String el:ll)
	{
		System.out.println(el);
		}
	
	System.out.println("------- iterator loop--------");
	Iterator<String> itt = ll.iterator();
	while(itt.hasNext()) {
		System.out.println(itt.next());
	}
	System.out.println("===for list itorator=====");
	 ListIterator<String> lli = ll.listIterator();
	 
	 while(lli.hasNext())
	 {System.out.println(lli.next());
	 }
	
	System.out.println("======for iterator in reverse direction=====");
	while(lli.hasPrevious())
	{
		System.out.println(lli.previous());
	}
	
	
	}

}
