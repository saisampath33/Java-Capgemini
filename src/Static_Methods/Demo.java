package Static_Methods;

public class Demo {
	static int a;
	public static void m1() {
		System.err.println("Static-Method");
	}
	public static void main(String[] args) {
		m1(); //method signature
//		Demo.m1();
		System.out.println(Demo.a);
		System.out.println(a);
	}

}
