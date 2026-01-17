package Wrapper_Classes;

public class parsing {

	public static void main(String[] args) {
		
		//Parsing -> String to primitive
		int a = Integer.parseInt("123");
		System.out.println(a);
		
		double b = Double.parseDouble("12233.98765");
		System.out.println("String to double: "+b);
		
		//primitive to string
		float f =  13.9f;
		String s = String.valueOf(f);
		System.out.println("float to String: "+s);
		

	}

}
