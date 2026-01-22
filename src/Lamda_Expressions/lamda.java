package Lamda_Expressions;

interface A{
	void test();
}
interface B{
	int operation(int a,int b);
}
interface C{
	String statement(String a);
}
public class lamda {

	public static void main(String[] args) {
		A a = ()->System.out.println("Hello");
		a.test();
		
		B add = (int x,int y)-> x+y;
		B subtract = (int x,int y)->x-y;
		B multiply = (int x,int y)->x*y;
		System.out.println(add.operation(10,12));
		System.out.println(subtract.operation(30,10));
		System.out.println(multiply.operation(2, 6));
		
		
		C c = (String x)-> x; //Lamda expression
		C d = (String x)-> {
			System.out.println("This is the line");
			return x;
		};
		System.out.println(c.statement("Capgemini"));
		System.out.println(d.statement("Accenture"));
	}

}
