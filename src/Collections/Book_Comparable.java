package Collections;
import java.util.*;

public class Book_Comparable implements Comparable<Book_Comparable>{

	int price;
	
	Book_Comparable(){
		
	}
	Book_Comparable(int price){
		this.price = price;
	}
	@Override
	public int compareTo(Book_Comparable o) {
		return this.price - o.price; // sort by id
	}
	
	 public String toString() {
	        return price+"";
	 }
	
	public static void main(String[] args) {
		List<Book_Comparable> list = new ArrayList<>(); 
        list.add(new Book_Comparable(3));
        list.add(new Book_Comparable(10));
        list.add(new Book_Comparable(1));
        Collections.sort(list); //Sorting acc to id which was passed in object
        System.out.println(list);
	}

}
