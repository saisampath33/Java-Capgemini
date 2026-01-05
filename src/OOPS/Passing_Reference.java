package OOPS;

class Box1{
	
}
class Bottle{
	
}
public class Passing_Reference {
	public static void main(String[] args) {
		Box1 b1 = new Box1();
		printref(b1);
		Bottle bo = new Bottle();
		printref(bo);

	}
	public static void printref(Box1 b) {
		System.out.println(b);
	}
	public static  void printref(Bottle b) {
		System.out.println(b);
	}
}
