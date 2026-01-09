package Encapsulation;

public class EncapsulationLibraryBook {
	
	static class Library{
		private int price;

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			if(price<0) {
				System.out.println("Book price cannot be negative");
				return;
			}
			this.price = price;
		}
		
	}
	

	public static void main(String[] args) {
		
		Library book1=new Library();
		book1.setPrice(1000);
		System.out.println(book1.getPrice());

	}

}
