package Encapsulation;

class Product{
	private int price;
	public void setPrice(int price) {
		//validation
		if(price>0) {
			this.price = price;
		}
	}
	public int getPrice() {
		return price;
	}
}
public class MainApp {
	public static void main(String[] args) {
		Product p1 = new Product();
		p1.setPrice(23);
		System.out.println("Number: "+p1.getPrice());
	}
}
