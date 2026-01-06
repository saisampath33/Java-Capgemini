package Relationships;

public class HasAMethodMultipleObjects {
	
	static class Tyre {
		private String brand;

		public String getBrand() {
			return brand;
		}

		public void setBrand(String brand) {
			this.brand = brand;
		}

		public Tyre() {

		}

		public Tyre(String brand) {
			this.brand = brand;
		}

	}

	static class Car {

		private Tyre[] tyres = { new Tyre("MRF"), new Tyre("MRF"), new Tyre("MRF"), new Tyre("MRF") };

		public Tyre[] getTyres() {
			return tyres;
		}

		public void setTyres(Tyre[] tyres) {
			this.tyres = tyres;
		}

	}

	public static void main(String[] args) {

		Car c = new Car();
		for (int i = 0; i < c.getTyres().length; i++) {
			System.out.println(c.getTyres()[i].getBrand());
		}

	}
}
