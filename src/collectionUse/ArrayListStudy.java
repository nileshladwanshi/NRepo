package collectionUse;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListStudy {

	public static void main(String[] args) {
	
		ArrayList<Object> all=new ArrayList<>();
		
		all.add('s');
		all.add("jai");
		all.add(null);
		all.add(44);
		all.add(true);
		System.out.println(all);
		all.add(2, 'h');
		System.out.println(all);
		
		System.out.println("array clone is "+all.clone());
		
		System.out.println(all.contains(44));
		
		//System.out.println(all.equals('h'));
		
		System.out.println(all.get(4));
		
		System.out.println(all.isEmpty());
		System.out.println(all);
		
		System.out.println(all.lastIndexOf(44));
		System.out.println(all.remove(null));
		System.out.println(all);
		System.out.println(all.set(2, 'v'));// set 'v' and remove 'h'
	
		System.out.println(all);
	
		System.out.println(all.size());
		System.out.println();
		System.out.println("=====iterator=======");
		Iterator<Object> it = all.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("======for loop ======");
		
		for(Object arli:all)
		{
			System.out.println(arli);
		}
		
		
		all.remove(1);
		System.out.println(all);
		System.out.println(all.equals(all));
		
		
		
		
		
		
		
		
	}

}
