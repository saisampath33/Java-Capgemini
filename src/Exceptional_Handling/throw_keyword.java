package Exceptional_Handling;

class WrongInputException extends RuntimeException{
	String message;
	WrongInputException(){
		
	}
	WrongInputException(String message){
		this.message = message;
	}
	public String getMessage() {
		return message;
	}
}
public class throw_keyword {

	public static void main(String[] args) {
		int a =8;
		int b=0;
		if(b==0) {
			throw new WrongInputException("/ by 0"); //parameterized constructor
		}else {
			System.out.println(a/b);
		}

	}

}
