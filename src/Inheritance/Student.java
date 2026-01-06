package Inheritance;

public class Student extends Person {
	int id=3;
	Student(){
		
	}
	Student(String name,int id){
//		this.name = name;
		super(name); //name passing to super class that is person class
		this.id = id;
	}
	void display() {
		System.out.println(name);
		System.out.println(id);
	}
	public static void main(String[] args) {
		Student st = new Student("Sampath",23);
		st.display();
	}
}
