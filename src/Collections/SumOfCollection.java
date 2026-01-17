package Collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class SumOfCollection {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i=1;i<10;i++) {
			al.add(i);
		}
		System.out.println(al);
		ListIterator<Integer> li = al.listIterator(2); //First Two elements will be ignored Starts from 2nd index
		int sum =0;
		int end = 7; // starts at 2nd index and ends before 7th index(6th index)
		while(li.hasNext()  && li.nextIndex()<end) {
			sum += li.next();
		}
		System.out.println("Sum is: "+sum);
		
		int sum1 =0;
		while(li.hasPrevious()) {
			sum1 += li.previous();
		}
		
		System.out.println(sum1);
	}

}
