package Relationships;

import java.util.ArrayList;
import java.util.List;

public class LazyInitializationExample {
	static class Tyre {
		private String brand;

		public String getBrand() {
			return brand;
		}

		public Tyre(String brand) {
			this.brand = brand;
		}
	}

	static class Car {
		// static
//		private Tyre[] tyres = new Tyre[4];
//
//		public Tyre[] getTyres() {
//			return tyres;
//		}
//
//		public void setTyres(Tyre[] tyres) {
//			this.tyres = tyres;
//		}
//
//		int i = 0;
//
//		void addTyre(Tyre tyre) {
//			tyres[i] = tyre;
//			i++;
//		}
		
		
		//dynamic 

		private List<Tyre> tyres;

		public Car() {
			this.tyres = new ArrayList<>();
		}

		public List<Tyre> getTyres() {
			return tyres;
		}

		public void addTyre(Tyre tyre) {
			tyres.add(tyre);
		}
	}

	public static void main(String[] args) {
		Car c = new Car();

		// here i need four tyres so now i can create 4 tyres with the help of addTyre
		// method when i needed
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));
		c.addTyre(new Tyre("MRF"));

//		for (int i = 0; i < c.getTyres().size(); i++) {
//			System.out.println(c.getTyres()[i].getBrand());
//		}
		for (Tyre t : c.getTyres()) {
			System.out.println(t.getBrand());
		}

	}

}
