package Abstraction;

public class Ride_Booking_Application {
	public static void main(String[] args) {
		Ride r = new BikeRide();
		r.rideDetails();
		r.calculateFare(15);
		Ride r1 = new AutoRide();
		r1.calculateFare(20);
		Ride r2 = new CarRide();
		r2.calculateFare(25);
	}

}

abstract class Ride{
	 abstract void calculateFare(int distance);
	 public void rideDetails() {
		 System.out.println("Here is the Riding Details");
	 }
}

class BikeRide extends Ride{
	@Override
	void calculateFare(int distance) {
		System.out.println("Bike Ride is "+(distance+10));
	}
}

class AutoRide extends Ride{
	@Override
	void calculateFare(int distance) {
		System.out.println("Auto Ride is "+(distance+20));
	}
}

class CarRide extends Ride{
	@Override
	void calculateFare(int distance) {
		System.out.println("Car Ride is "+(distance+30));
	}
}