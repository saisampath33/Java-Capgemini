package Collections;

import java.util.ArrayList;
import java.util.Iterator;  //only forward
import java.util.ListIterator; //for both forward and backward

public class Accessing_List {
	public static void main(String[] args) {
		ArrayList<Student> al = new ArrayList<>(); //Only Student type of data will be added

		al.add(new Student("Rao", 1));
		al.add(new Student("Eleven", 11));
		al.add(new Student("Sampath", 33));
		al.add(new Student("Mani", 13));
		//get method
//		System.out.println(al.get(0));
//		System.out.println(al.get(1)); 
		//forEach
//		al.forEach(n -> System.out.println(n));
		
		// Iterator

//		Iterator i = al.iterator();
//		System.out.println(i.next());
//		System.out.println(i.next());
		//using hasNext
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}

		// ListIterator

		ListIterator<Student> i1 = al.listIterator(1); //if we pass in constructor then it will start from that number which is index
		int end = 3; // this index onwards it will not print
		while (i1.hasNext() && i1.nextIndex()<end) {
			System.out.println(i1.next());
		}
		System.out.println("Previous: ");
		
		while (i1.hasPrevious()) {
			System.out.println(i1.previous());
		}

	}

}