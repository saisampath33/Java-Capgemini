package Collections;

import java.util.ArrayList;
import java.util.List;

public class List_Removal_Methods {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		for(int i =1;i<6;i++) {
			al.add(i);
		}
		System.out.println("Before Removal: "+al);
		al.remove(0);
		System.out.println("After Removal: "+al);
		
		
		
		ArrayList<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> list2 = new ArrayList<>(List.of(2,4));

		list1.removeAll(list2);
		System.out.println(list1);   // [1, 3, 5] Removes common items
		
		ArrayList<Integer> list3 = new ArrayList<>(List.of(1,2,3,4,5));
		ArrayList<Integer> list4 = new ArrayList<>(List.of(2,4,6));

		list3.retainAll(list4);
		System.out.println(list3);   // [2, 4]

		
		ArrayList<String> list = new ArrayList<>();
		list.add("X");
		list.add("Y");

		list.clear();
		System.out.println(list);  // []


	}

}
