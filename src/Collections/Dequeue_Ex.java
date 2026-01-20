package Collections;

import java.util.*;

public class Dequeue_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque dq = new ArrayDeque();
		dq.offer(12);
		dq.offerFirst(23);
		dq.offer(34);
		dq.offerLast(90);
		dq.offer(3);
		System.out.println(dq.getFirst());
		dq.pollFirst();
		System.out.println(dq);
		
		for(Object o:dq) {
			System.out.println(o);
		}
		
		
		
	}

}
