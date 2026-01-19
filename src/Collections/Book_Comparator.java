package Collections;

import java.util.*;

public class Book_Comparator implements Comparator<Book_Comparable>{
//	int price;
	public int compare(Book_Comparable o1, Book_Comparable o2) {
		// TODO Auto-generated method stub
		return o2.price - o1.price;
	}
	
//	public String toString() {
//		return "Price: "+price;
//	}
	
	public static void main(String[] args) {
		ArrayList<Book_Comparable> al = new ArrayList<>();
		al.add(new Book_Comparable(200));
		al.add(new Book_Comparable(100));
		al.add(new Book_Comparable(50));
		al.add(new Book_Comparable(800));
		 // Using Comparable
        Collections.sort(al);
        System.out.print("Sorted using Comparable (Ascending):  ");
        System.out.println(al);
		
		Collections.sort(al,new Book_Comparator()); //pasing another 
		System.out.print("Sorted using Comparator (Descending):  ");
		System.out.println(al);
	}

	
}
