package ProductionLevelElements_Encapsulation;

import java.util.ArrayList;

public class Employee_Example {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee("sai","sampath","8247757805",21,30000));
		al.add(new Employee("sai","sampath","8247757805",21,30000));
	}

}
class Employee implements Comparable<Employee>{
	String firstname;
	String lastname;
	String mobilenumber;
	int age;
	double salary;
	Employee(String firstname,String lastname,String mobilenumber,int age,double salary){
		this.firstname = firstname;
		this.lastname = lastname;
		this.mobilenumber = mobilenumber;
		this.age = age;
		this.salary = salary;
	}
	public int compareTo(Employee e) {
		
		return this.firstname.compareTo(e.firstname);
	}
	
	
}

