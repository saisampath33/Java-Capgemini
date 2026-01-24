package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

class Student{
	private int id;
	private String name;
	
	Student(int id,String name){
		this.id = id;
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public String toString() {
		return "Id: "+id+" Name: "+name;
	}
}
public class Encapsulation_Stream {

	public static void main(String[] args) {
		Student s = new Student(1,"Sampath");
		List<Student> st = new ArrayList<>();
		st.add(s);
		st.add(new Student(1,"Varun"));
		st.add(new Student(2,"Vishnu"));
		st.add(new Student(3,"Rishi"));
		
		st.stream()
			.filter(j->j.getName().startsWith("S"))
			.forEach(System.out::println);
		
		
		
	}

}
