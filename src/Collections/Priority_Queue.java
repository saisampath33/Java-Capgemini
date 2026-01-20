package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class Priority_Queue {

	public static void main(String[] args) {
		PriorityQueue q = new PriorityQueue();
		q.offer(10);
		q.offer(20);
		q.offer(5);
		q.offer(23);
		q.add(2);
		System.out.println(q);
		q.poll();
		System.out.println("Fisr element is: "+q.peek());
		
		Iterator i = q.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}

	}

}
