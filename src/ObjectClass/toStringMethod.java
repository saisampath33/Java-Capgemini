package ObjectClass;

public class toStringMethod {
	static class Demo {
		int price;
		
		Demo(){
			
		}

		Demo(int price) {
			this.price = price;
		}

		public String toString() {
			return "Price: " + price;
		}

	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		System.out.println(demo);

		Demo demo1 = new Demo();
		System.out.println(demo1);
		
		Demo demo2=new Demo(100);
		System.out.println(demo2);
	}

}
