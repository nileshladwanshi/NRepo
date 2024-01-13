package collectionUse;

import java.util.HashSet;
import java.util.Iterator;

public class Hashset {

	public static void main(String[] args)
	{
		HashSet<Object> hs=new HashSet<>();
		hs.add(78);
		hs.add(89);
		hs.add("shyam");
		hs.add("ji ki jai");
		hs.add(null);
		hs.add('d');
		hs.add(null);//ONly 1 null value allow		
		hs.add(78);//No Duplicate value is allow
		System.out.println(hs);//Order of insertion is RANDOM
		
		System.out.println(hs.contains(89));
		System.out.println(hs.clone());
		System.out.println(hs.equals(hs));
		System.out.println(hs.size());
		
				System.out.println("============foe each loop==========");
		for(Object s:hs)
		{
			System.out.println(s);
		}
		System.out.println("==============Iterator");
	
		 Iterator<Object> hsi = hs.iterator();
		
		while(hsi.hasNext())
		{
			System.out.println(hsi.next());
		}      
		
	}
	
	
}
