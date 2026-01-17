package Strings;

public class Advance_String_Problems {
	public static boolean string_contains_digits(String s) {
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)<'0' || s.charAt(i)>'9') {
				return false;
			}
		}
		return true;
	}
	
	public static boolean string_contains_digits_builtin(String s) {
		for(char c : s.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static String removeSpecial(String s) {
		return s.replaceAll("[^a-zA-Z0-9]", s);
	}
	public static void main(String[] args) {
		
		String s ="123";
		System.out.println("string_contains_digits: "+string_contains_digits(s));
		System.out.println("string_contains_digits_builtin: "+string_contains_digits(s));
		System.out.println(removeSpecial("Cap@2026#India!"));

	}

}
