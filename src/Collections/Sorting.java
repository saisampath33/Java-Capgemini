package Collections;

import java.util.*;

public class Sorting {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		
		al.add(20);
		al.add(10);
		al.add(50);
		al.add(2);
		al.add(78);
		System.out.println("Before Soring: "+al);
		Collections.sort(al);
//		al.sort(null);
		System.out.println("After Sorting: "+al);
		
	}

}
