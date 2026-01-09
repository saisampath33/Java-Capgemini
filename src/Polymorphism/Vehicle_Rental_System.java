package Polymorphism;

public class Vehicle_Rental_System {

	public static void main(String[] args) {
		Vehicle v = new Car();
		Vehicle v1 = new Bike();
		Vehicle v2 = new Truck();
		v.calculateRent();
		v1.calculateRent();
		v2.calculateRent();

	}

}
class Vehicle{
	void calculateRent() {
		System.out.println("Calculating the Rent");
	}
}
class Car extends Vehicle{
	static int rent = 2000;
	void calculateRent() {
		System.out.println("Calculating the Rent of car is "+rent);
	}
}
class Bike extends Vehicle{
	static int rent = 1000;
	void calculateRent() {
		System.out.println("Calculating the Rent of bike is "+rent);
	}
}
class Truck extends Vehicle{
	static int rent = 5000;
	void calculateRent() {
		System.out.println("Calculating the Rent of Truck is "+rent);
	}
}

