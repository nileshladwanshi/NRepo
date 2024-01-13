package collectionUse;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetUse {
public static void main(String[] args) {
	

	LinkedHashSet<Object> lhs=new LinkedHashSet<Object>();
	lhs.add(457);
	lhs.add('S');
	lhs.add(2456);
	lhs.add('s');
	lhs.add("shree Shyam");
	lhs.add(457);//               No duplicate value accept
	lhs.add(null);
	lhs.add(null);//              Only 1 null value accepted
	
	System.out.println(lhs);//    Order of insertion is maintained
	System.out.println(lhs.isEmpty());
	
	System.out.println(lhs.size());
	System.out.println(lhs.contains(null));
	
	
	System.out.println(lhs.containsAll(lhs));
	
	
	System.out.println("================ for loop");
	
	for (Object o:lhs)
	{
		System.out.println(o);
	}
	 //                   ONLY FOR LOOP AND ITERATOR CAN BE CREATED 
System.out.println("===========Iterator");
	Iterator<Object> LinkedhashsetIterator=lhs.iterator();
	
	while(LinkedhashsetIterator.hasNext())
	{
		System.out.println(LinkedhashsetIterator.next());
	}
	
	
	
	
	
	
	
	
}
}
