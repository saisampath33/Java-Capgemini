package Collections;
import java.util.*;
public class Searching_Attribute_In_Object {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		List<Student> studentsList = new ArrayList<>();
		studentsList.add(new Student("Varun", 21));
		studentsList.add(new Student("Tharun", 19));
		studentsList.add(new Student("Hari", 21));
		studentsList.add(new Student("Lohith", 21));
		
		
		System.out.println("Enter the student name: ");
		String nameString = scanner.next();
		boolean found = false;

		ListIterator listIterator = studentsList.listIterator();
		while (listIterator.hasNext()) {
			Student tempStudent = (Student) listIterator.next();
			if (tempStudent.name.equals(nameString)) {
				found = true;
				System.out.println("Student exists");
				System.out.println("Student Name: " + tempStudent.name + " Student age: " + tempStudent.id);
			}
		}

		if (found) {
			System.out.println("Student is not in the list");
		}
	}
}
