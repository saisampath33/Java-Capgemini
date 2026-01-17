package Collections;

import java.util.ArrayList;

public class SearchElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10); //objectname.methodname  
		al.add(20);
		al.add("hello");
		al.add(null);
		System.out.println(al);
		System.out.println(al.contains(20)); //gives boolean value
		System.out.println(al.indexOf(20)); //gives index
		
		

	}

}
