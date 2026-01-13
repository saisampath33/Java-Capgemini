package ObjectClass;


class Student1 {
	String name;
	int age;
	String address;

	public Student1(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	public int hashCode() {
		return this.name.hashCode() + age + this.address.hashCode(); //.hashcode() converts String to integer
	}
}	

public class HashCode {

	public static void main(String[] args) {
		Student1 s1 = new Student1("Sai",11,"VSKP");
		Student1 s2 = new Student1("Sai",11,"VSKP");
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode() == s2.hashCode()); //checks for address of each object we use == because it retrns a primitive datatype int
		
		System.out.println(s1.getClass());
	}

}
