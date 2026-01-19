package Collections;
import java.util.*;

public class Searching_Name_Employee {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(1,"Sai"));
		al.add(new Employee(2,"Varun"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee name: ");
		String nameString = sc.next();
		boolean found = true;

		ListIterator listIterator = al.listIterator();
		while (listIterator.hasNext()) {
			Employee tempEmployee = (Employee) listIterator.next();
			if (tempEmployee.name.equals(nameString)) {
				found = false;
				System.out.println("Employee exists");
				System.out.println("Employee Name: " + tempEmployee.name + " Employee age: " + tempEmployee.id);
			}
		}

		if (found) {
			System.out.println("Employee is not in the list");
		}
	}

}
