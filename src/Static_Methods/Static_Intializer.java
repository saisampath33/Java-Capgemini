package Static_Methods;

public class Static_Intializer {
	//non static initializer
	{
		//to execute common initialization for every object
		int x=10;
		System.out.println("From non static initializer "+x); 
	}
	static {
		int x=1;
		System.out.println("Hi from static block "+x);
	}
	static {
		int x=2;
		System.out.println("Hi from static block "+x);
	}
	public static void m1(int x) {
		System.out.println("From static method "+x);
	}
	public static void main(String[] args) {
		Static_Intializer st = new Static_Intializer();
//		m1(10);
	}
}