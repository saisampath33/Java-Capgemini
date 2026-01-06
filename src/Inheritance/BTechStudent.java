package Inheritance;

public class BTechStudent extends Student{
	String specialization;
	BTechStudent(){
		
	}
	BTechStudent(String name,int id,String specialization){
		super(name,id);
		this.specialization = specialization;
	}
	BTechStudent(String name,String specialization){
		this.name = name;
		this.specialization = specialization;
	}
	void display() {
		System.out.println(name);
		System.out.println(super.id);
		System.out.println(specialization);
	}
	
	public static void main(String[] args) {
		BTechStudent obj = new BTechStudent("Rao","CSE");
		obj.display();
	}
}
