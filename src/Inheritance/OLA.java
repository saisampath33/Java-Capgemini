package Inheritance;

import java.util.Scanner;

class Cab{
	
}
class Mini extends Cab{
	
}
class Sedan extends Cab{
	
}
class Luxary extends Cab{
	
}
public class OLA {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to OLA!! ");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. Luxary");
		System.out.println("Enter your Choice: ");
		int choice = sc.nextInt();
		Cab c = null;
		switch(choice) {
		case 1:{
			c  = new Mini();
		}
		break;
		case 2:{
			c = new Sedan();
		}
		break;
		case 3:{
			c = new Luxary();
		}
		break;
		default:
			System.out.println("Invalid Input");
		}
		System.out.println(c);
	}

}
