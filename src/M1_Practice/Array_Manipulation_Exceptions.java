package M1_Practice;

import java.util.Scanner;

public class Array_Manipulation_Exceptions {

	public static void main(String[] args) {
		UserInterface u = new UserInterface();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence ");
		String sentence = sc.nextLine();
		System.out.println("Enter num1 ");
		int num1 = sc.nextInt();
		System.out.println("Enter num1 ");
		int num2 = sc.nextInt();
		System.out.println( u.extractString(sentence, num1, num2));

	}

}
class UserInterface{
	public String extractString(String sentence,int number1, int number2) {
		int n = sentence.length();
		String res="";
		try {
			if(number1<=0 || number1>n ||number1<=0 || number1>n) {
				throw new StringIndexOutOfBoundsException();
			}else {
				res = sentence.substring(number1,number2)+". Thanks for using the application";
			}
		}catch(StringIndexOutOfBoundsException e) {
			res += "Invalid index position. Thanks for using the application";
		}
		return res;
	}
}