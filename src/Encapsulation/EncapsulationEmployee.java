package Encapsulation;

public class EncapsulationEmployee {

	static class Employee {
		private int salary;

		public int getSalary() {
			return salary;
		}

		public void setSalary(int salary) {
			if (salary < 0) {
				System.out.println("Salary cannot be negative");
				return;
			}
			this.salary = salary;
		}

	}

	public static void main(String[] args) {
		Employee employee=new Employee();
		employee.setSalary(1000);
		System.out.println(employee.getSalary());
	}

}
