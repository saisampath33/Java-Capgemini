package Inheritance;

class Shapes {
	double area;
	Shapes(){
		
	}
	Shapes(double area) {
		this.area = area;
	}
	void show_area() {
		System.out.println("Area of Shape is " + area);
	}
}

class Traingle extends Shapes{
	int base;
	int height;
	Traingle(){
		
	}
	Traingle(int base,int height){
		this.base = base;
		this.height = height;
	}
	void getarea() {
		area = 0.5*base*height;
	}
	
}

class Circle extends Shapes{
	int radius;
	Circle(){
		
	}
	Circle(int radius){
		this.radius = radius;
	}
	void getarea() {
		area = Math.PI*radius*radius;
	}
}
public class Shape{
	public static void main(String[] args) {
		Circle c = new Circle(5);
		Traingle t = new Traingle(10,5);
		c.getarea();
		c.show_area();
		t.getarea();
		t.show_area();
	}
}


