package LinkedList;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LL_HashSet {

	public static void main(String[] args) {
		LinkedHashSet set = new LinkedHashSet();
		set.add(10);
		set.add(12);
		set.add(12);
		set.add(null);
		set.add(null);
		System.out.println(set);
		System.out.println(set.getFirst());
		set.addLast(56);
		System.out.println("Using for each: ");
		set.forEach(n->System.out.println(n)); 
		System.out.println("Using Iterator: ");
		Iterator<Integer> i = set.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
