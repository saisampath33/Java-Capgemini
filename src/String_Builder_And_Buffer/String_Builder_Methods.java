package String_Builder_And_Buffer;

public class String_Builder_Methods {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		StringBuilder sb1 = new StringBuilder(5); //capacity
		StringBuilder sb2 = new StringBuilder("Hello"); //string
		StringBuilder sb3 = new StringBuilder(sb2); //character sequence
		
		sb1.append("Hi");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
//		sb2.setLength(2); //setting length to 2	original builder also changed
//		System.out.println(sb2);
		
		System.out.println(sb2.charAt(4));
		sb2.setCharAt(0, 'S');
	
		System.out.println(sb2);
		
		sb2.append(23).append(98.00);
//		int[] ch = new int[] {1,2,4,5,6};
//		sb2.append(ch); //object reference
		System.out.println(sb2);
		
		
		sb2.insert(0, "Core Java");
		sb2.insert(15, false);
		System.out.println(sb2);
		
		//delete -> return stringbuilder object
		sb2.delete(0, 5); //removed core
		sb2.deleteCharAt(2); //delete character at given index
		sb2.replace(0, 3, "sai"); //start and end and replace string
		
		//search
		StringBuilder search = new StringBuilder("Java Java Java");

		search.indexOf("Java");        // 0
		System.out.println(search.indexOf("Java", 6));     //searches from index giving(6)
		System.out.println(search.lastIndexOf("Java"));    // 10
		
		StringBuilder sub = new StringBuilder("JavaProgramming");

		String s1 = sub.substring(4); //starts from that index
		String s2 = sub.substring(0, 4); //start and ends (end-1)
		
		sub.reverse();
		System.out.println(sub);
		
		System.out.println(s1+" and "+s2);

		StringBuilder sb5 = new StringBuilder("Java");
		StringBuilder sb6 = new StringBuilder("Java");

		sb5.compareTo(sb6); // 0
		String s = sb5.toString();
		System.out.println(s);
		
		StringBuilder sb10 = new StringBuilder("JaVa ProGRam");

		String lower = sb10.toString().toLowerCase();
		String upper = sb10.toString().toUpperCase();

		sb10 = new StringBuilder(lower); // if you want builder again
		System.out.println(lower);
		
		//converting all even character into uppercase
		
		for(int i=0;i<sub.length();i++) {
			if(i%2 ==0) {
				sub.setCharAt(i, Character.toUpperCase(sub.charAt(i))); //setCharAt() accepts char only
			}
		}
		sub.reverse();
		System.out.println(sub);

		
		StringBuilder sb11 = new StringBuilder("java");
		sb11.replace(0, 1, String.valueOf(
		    Character.toUpperCase(sb11.charAt(0))
		));
		System.out.println(sb11);

		StringBuilder del = new StringBuilder("banana");
//		del.deleteCharAt(1);
//
//		System.out.println(del.indexOf("na"));
		
		String rep = del.toString();
		rep = rep.replaceAll("[aeiou]", "@"); //replace all vowels with @
		System.out.println(rep);
	}

}
