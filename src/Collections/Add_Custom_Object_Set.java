package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Add_Custom_Object_Set {
	public static void main(String[] args) {
		Teacher t1 = new Teacher(1,"sai");
		Teacher t2 = new Teacher(1,"sai");
		Set<Teacher> st = new HashSet<>();
		st.add(t1);
		st.add(t2);
		st.add(new Teacher(2,"varun"));
		System.out.println(st);
		
		// we override equals and hash code so duplicates are not going into set
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name to search: ");
		String input = sc.next();
		boolean found = false;
		Iterator<Teacher> i = st.iterator();
		while(i.hasNext()) {
			Teacher s1 = (Teacher) i.next();
			if(s1.name.equals(input)) {
				found = true;
				System.out.println(s1);
				System.out.println("Exists in set");
			}
		}
		if(!found) {
			System.out.println("Not Exists in Set");
		}
		
	}
}

class Teacher{
	int id;
	String name;
	Teacher(int id,String name){
		this.id = id;
		this.name = name;
	}
	public int hashCode() {
		return 	name.hashCode() +id;
	}
	public boolean equals(Object o) {
		Teacher s = (Teacher) o;
		return (this.id == s.id) && (this.name == s.name);
	}
	public String toString() {
		return name+" : "+id;
	}
}