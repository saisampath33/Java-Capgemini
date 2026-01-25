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
		Student obj = new Student(1,"Sampath");
		List<Student> st = new ArrayList<>();
		st.add(obj);
		st.add(new Student(1,"Varun"));
		st.add(new Student(2,"vishnu"));
		st.add(new Student(3,"rishi"));
		
		st.stream()
			.filter(j->j.getName().startsWith("S"))
			.forEach(System.out::println);
		
		List<String> st1 = st.stream()
			    .map(s -> s.getName().substring(0, 1).toUpperCase() + s.getName().substring(1))
			    .collect(Collectors.toList());

//		charAt(0) → char
//		substring() → String
//		You need String + String, not char + String
//			st1.forEach(System.out::println);	
		System.out.println(st1);
		

			
		
	}

}
