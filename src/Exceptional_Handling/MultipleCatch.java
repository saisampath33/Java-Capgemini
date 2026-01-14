package Exceptional_Handling;

public class MultipleCatch {

	public static void main(String[] args) {
		try {
//			System.out.println(10/0);
			int a = Integer.parseInt("123abc");
		}catch(ArithmeticException | NullPointerException | NumberFormatException e) {
			e.printStackTrace();
			System.out.println("This is the exception");
		}
	}

}
