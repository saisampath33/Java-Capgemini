package Static_Methods;
class College{
	static String collegename = "LPU";
	String Name;
	int roll;
	int age;
	void getdetails() {
		System.out.println("The name is: "+Name+" roll no is "+roll+" collegename is "+collegename+" age is "+age);
	}
	College(String Name){
		this.Name = Name;
	}
	College(String Name,int roll){
		this(Name);
		this.roll = roll;
	}
	College(String Name,int roll,int age){
		this(Name,roll);
		this.age = age;
	}
	static void get() {
		System.out.println("Hello");
	}
}
public class Example {

	public static void main(String[] args) {
		College obj = new College("Sampath",21);
		obj.getdetails();
		College.get();

	}

}
