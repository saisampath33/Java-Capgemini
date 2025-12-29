package Methods;
import java.util.*;
public class Method_Basics {
	
	static void m1() {
		System.out.println("Hellloo");
	}
	public static void add() {
		//No argument Method 
		int a =10;
		int b=20;
		int sum = a+b;
		System.out.println(sum);
	}
	static void area() {
		int radius = 10;
		int area = (int)Math.PI*radius*radius;
		System.out.println("The area of Circle: "+area);
	}
	static void traingle() {
		int base = 5;
		int height = 10;
		float area = (float)(0.5)*base*height;
		System.out.println("The area of Traingle is: "+area);
	}
	static void square() {
		int length = 10;
		int breadth = 20;
		int area = length * breadth;
		System.out.println("The area of Square: " +area);
	}
	static int add1(int a,int b) {
		int sum = a+b;
		return sum;
	}
	public static void main(String[] args) {
		m1();
		add();
		area();
		traingle();
		square();
		int a = add1(5,19);
		System.out.println(a);
	}

}
