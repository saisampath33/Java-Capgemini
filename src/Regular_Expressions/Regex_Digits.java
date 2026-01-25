package Regular_Expressions;

public class Regex_Digits {

	public static void main(String[] args) {
		System.out.println("Checks for one digit");
		String s1 = "1";
		System.out.println(s1.matches("\\d")); //only for one digit
		
		
		System.out.println("Checks for more than one digit");
		String s2 = "123";
		System.out.println(s2.matches("\\d+"));
		
		System.out.println("For accepting empty string and string with digits also");
		String s3="";
		System.out.println(s3.matches("\\d*"));
		
		System.out.println("From starting to ending all are digits");
		
		String s4 = "45678a";
		System.out.println(s4.matches("^\\d+$"));
		
		System.out.println("String contains only 3 digits ");
		String s5 = "123";
		System.out.println(s5.matches("\\d{3}"));
		
		System.out.println("String in particular range ");
		String s6 = "12214933";
		System.out.println(s6.matches("\\d{4,8}")); //string length is between 4 and 8
		
		System.out.println("For Decimal");
		String s7 = "10.588 xyz";
		System.out.println(s7.matches("\\d+\\.\\d+"));
		
		
}
}