package ObjectClass;


class Box
{
	int price;
	public String toString() {
		return "Price: "+price;
	}
}
class Phone{
	int ram;
	int rom;
	Phone(int ram,int rom){
		this.ram=ram;
		this.rom = rom;
	}
	@Override
	public String toString() {
		return "Phone-->[ Ram: "+ram+" Rom: "+rom+" ]";
	}
	
}
class Student{
	String name;
	int id;
	String address;
	Student(String name,int id,String address){
		this.name = name;
		this.id = id;
		this.address = address;
	}
	public String toString() {
		return "Student Name";
	}
	public boolean equals(Student s) {
		return this.name == s.name && this.id== s.id && this.address == s.address;
	}
}

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Box b1 = new Box();
//		Box b2 = new Box();
//		System.out.println(b1.toString());
//		Phone p = new Phone(5,5);
//		Phone p1 = new Phone(15,5);
//		System.out.println(p);
		Phone[] arr = new Phone[] {new Phone(5,5),new Phone(50,5),new Phone(51,5),new Phone(5,50)};
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
