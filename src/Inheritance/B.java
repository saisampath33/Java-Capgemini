package Inheritance;

public class B extends A{
	public void display() {
		System.out.println(a);
	}
	public static void main(String[] args) {
		B b = new B();
		System.out.print("Call from display method in class B ");
		b.display();
		method1();
		A a = new A();
		a.method2();
		System.out.println("Non static variable from class A "+a.b);
	}

}
