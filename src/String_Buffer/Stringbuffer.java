package String_Buffer;

public class Stringbuffer {

	public static void main(String[] args) {
		
		StringBuffer s1 = new StringBuffer();
		s1.append("Hello");
		System.out.println(s1);
		
		//insert
		s1.insert(1,"ii");
		System.out.println(s1);
		
		//reverse
		s1.reverse();
		System.out.println(s1);
		System.out.println(s1.reverse());
		
		//replace
		s1.replace(1, 3, "Zero");
		System.out.println(s1);
		
		//delete
		System.out.println(s1.delete(3, s1.length()));
		
		//capacity - by default buffer capacity is 16
		System.out.println(s1.capacity());
	}

}
