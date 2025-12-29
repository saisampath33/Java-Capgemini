package Core_Java_Basics;

public class TypeCasting {

	public static void main(String[] args) {
		int a = 10;
		float b = a; //implicit and widening
		System.out.println(b);
		//narrowing
		short c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		double e = 9.768;
		int f = (int) e;
		System.out.println(f);
		
		int i = 130;
		byte z = (byte) i;  // z = -126 the range crossed and (Byte range is -128 to 127)
		System.out.println(z);

	}

}
