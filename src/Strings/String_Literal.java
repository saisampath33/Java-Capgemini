package Strings;

public class String_Literal {

	public static void main(String[] args) {
		String s1 = "Hello";
//		System.out.println(s1);
		String s2 = "Hii";
		String s3 = "Hello";
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));
		
		
		//using new keyword
//		String s4 = new String("Hoi");
//		String s5 = new String("Hoi");
//		System.out.println(s4 == s5); different reference
//		System.out.println(s4.equals(s5)); //content checking which was already overridden by String class
	}
}
