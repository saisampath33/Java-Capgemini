package Collections;

import java.util.ArrayList;

public class ObjectintoCollection {

	public static void main(String[] args) {
		ArrayList students = new ArrayList();
//		adding custom object
		students.add(new Student("Sampath",10));
		students.add(new Student("Rishi",11));
		System.out.println(students);
		Student s1 = new Student("Sampath",10);
//		students.add(12);
//		System.out.println(students.contains(12)); 
		System.out.println(students.contains(s1)); // after overriding it checks the content not reference
		//searching primitive give true because in wrapper class already tostring and equals are overiden
		//But in normal object we should overide the equals method like it should check contents 
		//contains does this s1.equals(existingStudentInList)
		//Searching element based on the attribute
		
		
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
	public boolean equals(Object obj) {
        Student other = (Student) obj;
        return id == other.id && name.equals(other.name);
    }
}