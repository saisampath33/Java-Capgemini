package Encapsulation;

public class EncapsulationOnilneShopping {

	static class Cart {
		private int totalAmount;

		public int getTotalAmount() {
			return totalAmount;
		}

		public void addItem(int itemPrice) {
			if (itemPrice <= 0) {
				System.out.println("Invalid price");
				return;
			}
			totalAmount += itemPrice;
		}

		public void removeItem(int itemPrice) {
			if (itemPrice > totalAmount || itemPrice <= 0) {
				System.out.println("Invalid amount, amount cannot be greater than total amount");
				return;
			}
			totalAmount -= itemPrice;

		}
	}

	public static void main(String[] args) {
		Cart cart = new Cart();
		cart.addItem(1500);
		cart.removeItem(-3);
		System.out.println(cart.getTotalAmount());
	}

}
