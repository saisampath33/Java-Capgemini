package Abstraction;

public class Employee_Management_System {

	public static void main(String[] args) {
		Employee e1;
		e1 = new FullTime("Sampath",12,200000);
		e1.displayDetails();
		e1.calculateSalary();

	}

}

abstract class Employee{
	protected String name;
	protected int  id;
	
	Employee(String name,int id){
		this.name = name;
		this.id = id;
	}
	abstract void calculateSalary();
	public void displayDetails() {
		System.out.println("Employee Details are: ");
		System.out.println("Name: "+name+"\nid: "+id);
	}
}

class FullTime extends Employee{
	
	private double salary;
	FullTime(String name,int id,double salary){
		super(name,id);
		this.salary = salary;
	}
	void calculateSalary() {
		System.out.println("Monthly Salary is: "+salary);
	}
}
class PartTime extends Employee{
	private int dailysalary;
	PartTime(String name, int id,int dailysalary) {
		super(name, id);
		this.dailysalary = dailysalary;
	}

	@Override
	void calculateSalary() {
		System.out.println("Daily Salary is "+dailysalary);
	}
	
}
