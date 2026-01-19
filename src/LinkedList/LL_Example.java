package LinkedList;

import java.util.*;

public class LL_Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList<>();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(null);
		list.add("Hello");
		System.out.println(list);
		System.out.println(list.contains(20));
		System.out.println(list.indexOf(30));
		
//		list.forEach(n->System.out.println(n));	
		list.addFirst(100); //linked list method
		list.addLast(9.8);
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
//		list.pollFirst(); //removes 100
		list.removeFirst();
		ListIterator li = list.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
	}

}
