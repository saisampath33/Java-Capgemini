package ObjectClass;

import java.util.*;

public class multipleObjectsWithToString {

	static class Phone {
		String brand;
		int price;

		Phone(String brand, int price) {
			this.brand = brand;
			this.price = price;
		}

		public String toString() {
			return "Brand: " + brand + ", Price: " + price;

		}

	}

	public static void main(String[] args) {
//		Phone[] phones = { new Phone("I phone", 100), new Phone("Samsung", 200), new Phone("Real me", 300) };

		List<Phone> phones = new ArrayList<>();
		phones.add(new Phone("Iphone", 250));
		phones.add(new Phone("Samsung", 500));

		for (Phone phone : phones) {
			System.out.println(phone);
		}

	}

}
