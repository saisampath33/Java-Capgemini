package Regular_Expressions;

public class Regex_Alphabet {

	public static void main(String[] args) {
		System.out.println("Matching only one alphabet");
		String s1 = "a";
		System.out.println(s1.matches("[a-z]"));
		
		System.out.println("Matching one or more alphabet");
		String s2 = "abc";
		System.out.println(s2.matches("[a-z]+"));
		
		System.out.println("Matching more alphabets in uppercase");
		String s3 = "ABC";
		System.out.println(s3.matches("[A-Z]+"));
		
		System.out.println("Matching alphabets in both upper and lower case");
		String s4 = "aAbBcC";
		System.out.println(s4.matches("[a-zA-Z]+"));
		
		System.out.println("Matching alphanumeric");
		String s5 = "aA11bbVVC124";
		System.out.println(s5.matches("[a-zA-Z0-9]+"));
		
		System.out.println("Checking GMAIL");
		String s6 = "sampath.may10@gmail.com";
		System.out.println(s6.matches("[a-z0-9.]+@gmail\\.com"));
	

		System.out.println("Exact match");
		String s7 = "outlook";
		System.out.println(s7.matches("outlook"));
		
		

	}

}
