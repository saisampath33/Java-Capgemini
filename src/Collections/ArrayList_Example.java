package Collections;
import java.util.ArrayList;

public class ArrayList_Example {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10); //objectname.methodname  
		al.add(20);
		al.add("hello");
		al.add(null);
		System.out.println(al);
		
		ArrayList al1 = new ArrayList();
		al1.add(30);
		al1.add(40);
		al1.add(50);
		al1.addAll(al); //it will add collection normally
		al1.add(al); // adding collection into another collection like just keeping a box into another box
		
		al1.add(4,100); //add 50 at 4th index
		al1.add(0,3); //add 3 at 0th index
		
		al1.addAll(0,al); //adding al collection at index 0
		
		System.out.println(al1);
		
		//add() accept object type of reference
		//addAll() accept collection type of reference
	
	}

}
