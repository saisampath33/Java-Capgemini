package Exceptional_Handling;

import java.util.Scanner;

class UnderAgeException extends RuntimeException{
//	String message;
	UnderAgeException(){
		
	}
	UnderAgeException(String message){
		super(message);
	}
//	public String getMessage() {
//		return message;
//	}
//	The comment part is not mandatory it can take the message from parent class
}
class OverAgeException extends RuntimeException{
	String message;
	OverAgeException(){
		
	}
	OverAgeException(String message){
		this.message = message;
	}
	@Override
	//overriding from runtimeexception
	public String getMessage() {
		return message;
	}
}
public class Age_Checking {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		int age = sc.nextInt();
		if(age<16) {
			throw new UnderAgeException("Age should greater than 16");
		}else if(age>41) {
			throw new OverAgeException("Age should less than 41");
		}else {
			System.out.println("You are eligible");
		}

	}

}
