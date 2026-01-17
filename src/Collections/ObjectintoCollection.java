package Collections;

import java.util.ArrayList;

public class ObjectintoCollection {

	public static void main(String[] args) {
		ArrayList students = new ArrayList();
//		adding custom object
		students.add(new Student("Sampath",10));
		students.add(new Student("Rishi",11));
		System.out.println(students);
		
	}

}
class Student{
	String name;
	int id;
	Student(){
		
	}
	Student(String name,int id){
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Student [name= "+name+", id= "+id+"]";
	}
}