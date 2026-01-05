package OOPS;

public class FactoryMethod {
	int length;
	FactoryMethod(){
		
	}
	FactoryMethod(int length){
		this.length = length;
	}
	public static FactoryMethod createBox() {
		return new FactoryMethod();
	}
	public static FactoryMethod createBox(int length) {
		return new FactoryMethod(length);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FactoryMethod f = FactoryMethod.createBox();
		System.out.println(f);
		System.out.println(f.createBox());
	}

}
