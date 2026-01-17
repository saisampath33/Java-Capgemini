package Wrapper_Classes;

public class Boxing {

	public static void main(String[] args) {
		//boxing
		
		int a = 10;
		Integer z = new Integer(a); //(OLD / Deprecated
		System.out.println(z);
		
		int b = 20;
		Integer i = Integer.valueOf(b);
		System.out.println(i);
		
		//Auto Boxing
		int x = 30;
		Integer y = x;
		System.out.println(y);
		
		//Un-boxing
		int u = y.intValue();
		System.out.println(u);
		
		//boxing and un-boxing
		byte x1 = 50;
		Byte y1 = Byte.valueOf(x1); //box
		byte z1 = y1.byteValue(); //un box
		System.out.println(z1);
		
		//auto un-boxing
		int var = 77;
		Integer d1 = var;
		int f1 = d1;
		System.out.println(f1);
	}

}
