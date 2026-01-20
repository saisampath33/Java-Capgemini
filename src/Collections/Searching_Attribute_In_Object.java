package Collections;
import java.util.*;

public class Searching_Attribute_In_Object {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Student3> studentsList = new ArrayList<>();
		studentsList.add(new Student3("Varun", 21));
		studentsList.add(new Student3("Tharun", 19));
		studentsList.add(new Student3("Hari", 21));
		studentsList.add(new Student3("Lohith", 21));
		
		
		System.out.println("Enter the student name: ");
		String nameString = scanner.next();
		boolean found = false;

		ListIterator<Student3> listIterator = studentsList.listIterator();
		while (listIterator.hasNext()) {
			Student3 tempStudent = (Student3) listIterator.next();
			if (tempStudent.name.equals(nameString)) {
				found = true;
				System.out.println("Student exists");
				System.out.println("Student Name: " + tempStudent.name + " Student age: " + tempStudent.id);
			}
		}

		if (!found) {
			System.out.println("Student is not in the list");
		}
	}
}

class Student3{
	String name;
	int id;
	Student3(){
		
	}
	public char[] contains(Student3 s1) {
		return null;
	}
	Student3(String name,int id){
		this.name = name;
		this.id = id;
	}
	public String toString() {
		return "Student [name= "+name+", id= "+id+"]";
	}
	public boolean equals(Object obj) {
        Student3 other = (Student3) obj;
        return id == other.id && name.equals(other.name);
    }
}