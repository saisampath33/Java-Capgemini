package OOPS;


class Student{
	String pan;
	String aadhar;
	String votingcard;
	Student(){
		
	}
	Student(String pan){
		this.pan = pan;
	}
	Student(String pan,String aadhar){
		this.pan = pan;
		this.aadhar = aadhar;
	}
	Student(String pan,String aadhar,String votingcard){
		this.pan = pan;
		this.aadhar = aadhar;
		this.votingcard = votingcard;
	}
};

//Constructor Chaining

class Student1{
	String pan;
	String aadhar;
	String votingcard;
	Student1(){
		
	}
	Student1(String pan){
		this();
		this.pan = pan;
	}
	Student1(String pan,String aadhar){
		this(pan);
		this.aadhar = aadhar;
	}
	Student1(String pan,String aadhar,String votingcard){
		this(pan,aadhar);
		this.votingcard = votingcard;
	}
};

public class Student_Admission {
	
	public static void main(String[] args) {
		
		Student st = new Student();
		Student st1 = new Student("12345");
		Student st2 = new Student("12367","ASDFGHJK");
		Student st3 = new Student("qwertyu","asdfgh","asdfghj");
		System.out.println("Constructor Overloading: ");
		System.out.println(st1.pan);
		System.out.println(st2.aadhar);
		System.out.println(st3.votingcard);
		
		System.out.println("Constructor Chaining: ");
		Student1 obj = new Student1("ytfuv","yttyv","yrdry");
		System.out.println(obj.pan);
		
	}

}
