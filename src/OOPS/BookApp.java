package OOPS;

public class BookApp {

	public static void main(String[] args) {
//		Book b1 = new Book();
//		Book b2 = new Book();
//		Book b3 = new Book();
//		b1.title = "Java";
//		b1.price = 2000;
//		
//		b2.title = "CPP";
//		b2.price = 1000;
//		
//		b3.title = "Python";
//		b3.price = 1500;
//		
//	    System.out.println(b1.title);
//	    System.out.println(b1.price);
		
		//Parameterized Constructor
		Book b4 = new Book("Java",2000);
		System.out.println(b4.title);
		
	}

}
