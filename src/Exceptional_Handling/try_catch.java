package Exceptional_Handling;

import java.util.Scanner;

public class try_catch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Value: ");
		int a = sc.nextInt();
		System.out.println("Enter b Value: ");
		int b = sc.nextInt();
		String s = null;
		try {
			System.out.println(a/b);//If exception came here it cant go to the down line
//			System.out.println(s.toLowerCase());
		}
		catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Caught AE");
		}
		catch(NullPointerException e) {
			System.out.println("Caught");
		}finally {
			System.out.println("Done with the code");
		}
	}

}
