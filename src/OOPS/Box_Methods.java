package OOPS;

class Box{
	double length;
	double bredth;
	Box(double length,double bredth){
		this.length = length;
		this.bredth = bredth;
	}
	double getArea() {
		return length*bredth;
	}
};
public class Box_Methods {

	public static void main(String[] args) {
		Box obj = new Box(12.30,34.8);
		System.out.println(obj.getArea());
	}

}
