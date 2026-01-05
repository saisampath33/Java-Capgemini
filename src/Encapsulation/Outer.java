package Encapsulation;

public class Outer{
	static class Inner{
		static void display() {
			System.out.println("Static-Method");
		}
		void test() {
			System.out.println("Non-static Method");
		}
	};
	public static void main(String[] args) {
		Outer.Inner.display(); //use this if you are in different package static method 
		Inner.display();
		Outer.Inner  obj = new Outer.Inner();
		obj.test();
	}
};
