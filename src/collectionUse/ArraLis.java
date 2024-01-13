package collectionUse;

import java.util.ArrayList;



public class ArraLis {

	public static void main(String[] args) {

		ArrayList<Object> al= new ArrayList<>();
		System.out.println(al.add("Pune"));
		System.out.println(al);
		al.add(0, "Katraj");
		System.out.println(al);
		al.add(77);
		al.add(null);
		al.add('h');
		al.add(78);
		al.add("jai");
		al.add("shree");
	    al.add("shyam");
	    al.add(null);
		
//		al.clear();
//		System.out.println();
		Object alNew = al.clone();
		System.out.println("cloned array list--> "+alNew);
		System.out.println(al.contains("Pune"));
	
		System.out.println(al.isEmpty());
	
		System.out.println(al.get(5));
		System.out.println(al);
		System.out.println(al.lastIndexOf(null));
		al.ensureCapacity(3);
	
		Object alc = al.clone();
	
		System.out.println(al.equals(alc));
		System.out.println(al.indexOf("shree"));

	
		System.out.println(al.indexOf("shyam"));
	
		System.out.println(al.get(4));
	System.out.println(al.contains('h'));
	
	System.out.println(al.set(5, 864));// remove value and add new value
	System.out.println(al.size());
	al.remove(2);
	System.out.println(al);
	System.out.println(al.size());
	
	}

}
