package Encapsulation;

public class NonStaticInner {

	class InnerClass {
		void test() {
			System.out.println("Non static Method");
		}
	}

	public static void main(String[] args) {

		// so in this case we have to create the object of outer class
		// and access the inner class by the outer object and then create the object for
		// inner class
		// the we can access the methods inside the inside non static class
		NonStaticInner o1 = new NonStaticInner();
		InnerClass i1 = o1.new InnerClass();
		i1.test();

	}

}
