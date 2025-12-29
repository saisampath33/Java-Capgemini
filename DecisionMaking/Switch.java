
package DecisionMaking;
import java.util.*;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome!!, Enter the input: ");
//		int a = sc.nextInt();
//		switch(a) {
//			case 1:
//				System.out.println("Welcome!!");
//				break;
//			case 2:
//				System.out.println("Welcome2!!");
//				break;
//			case 3:
//				System.out.println("Welcome3!!");
//				break;
//			default:
//				System.out.println("Welcome!! by default");
//		}
		
		char c= sc.next().charAt(0);
		switch(c) {
		
		case 'A':
			System.out.println("A for Apple");
			break;
		case 'B':
			System.out.println("B for Ball");
			break;
		case 'C':
			System.out.println("C for Cat");
			break;
		}
	}

}
