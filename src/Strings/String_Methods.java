package Strings;

public class String_Methods {

	public static void main(String[] args) {
		String s = "Hello";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("H"));
		System.out.println(s.endsWith("Z"));
		System.out.println(s.charAt(0));
		char[] c = s.toCharArray();
		System.out.println(c); // we will not get the reference we get the hello
		
		String s2 = "Hii Hello Bye";
		String[] str = s2.split(" ");
		for(String ch : str) {
			System.out.print(ch+" ");
		}
		
		String x = "Hi";
		System.out.println(x.concat("Everyone"));
		System.out.println(s.substring(2));
		System.out.println(s2.substring(2,7)); // we will not get the 7th char
	}

}
