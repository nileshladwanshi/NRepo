package collectionUse;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueusage {

	public static void main(String[] args) {
		PriorityQueue<Object> prique=new PriorityQueue<>(Collections.reverseOrder());
		prique.add(7554);
		//prique.add("shyam");
		prique.add(55683);
		//prique.add('S');
		//prique.add("ki jai");
//		prique.add(null);
//		prique.add(null);
		//prique.add('S');
		//prique.add("shyam");
		prique.add(435);
		prique.add(4876);
		
		prique.add(7554);
		System.out.println(prique);


		System.out.println("===== foe each loop");
		for(Object pq:prique)
		{
			System.out.println(pq);
		}
		System.out.println("===for iterator");
		
		Iterator<Object> iterPrioQue= prique.iterator();
		
		while(iterPrioQue.hasNext()) {
			System.out.println(iterPrioQue.next());
		}
		
		
		
	}

}
