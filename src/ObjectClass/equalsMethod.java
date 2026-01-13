package ObjectClass;

public class equalsMethod {

	static class Student {
		String name;
		int age;
		String address;

		public Student(String name, int age, String address) {
			this.name = name;
			this.age = age;
			this.address = address;
		}

		// overriding the toString method
		public String toString() {
			return "Student Name: " + name + " \nStudent age: " + age + " \nStudent Address: " + address;
		}

//		public boolean equals(Student s) {
//			return this.name == s.name && this.age == s.age && this.address == s.address;
//		}
		
		public boolean equals(Object o) {
			Student s =  (Student) o; //downcast object class to student to use the student properties
			return this.name == s.name && this.age == s.age && this.address == s.address;
		}

	}

	public static void main(String[] args) {

		Student student1 = new Student("Sampath Kumar", 21, "Telangana");
		Student student2 = new Student("Sampath Kumar", 21, "Telangana");
		Student student3 = student1; //copy

		System.out.println(student1.equals(student3));
		System.out.println(student1.equals(student2));
		System.out.println(student1 == student2);
		
		System.out.println(student1);
		System.out.println(student2);

	}

}
