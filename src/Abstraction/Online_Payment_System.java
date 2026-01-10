package Abstraction;

public class Online_Payment_System {

	public static void main(String[] args) {
		Payment p = new CreditCard();
		p.printReceipt();
		p.processPayment(122.00);
		Payment p1 = new UPI();
		p1.processPayment(122);
		Payment p2 = new NetBanking();
		p2.processPayment(256);
		

	}

}

abstract class Payment{
	abstract public void processPayment(double amount);
	public void printReceipt() {
		System.out.println("Printing Receipt");
	}
}

class CreditCard extends Payment{

	@Override
	public void processPayment(double amount) {
		int service = 10;
		System.out.println("Service Charge for Credit Card "+(service+amount));
	}
	
}

class UPI extends Payment{

	@Override
	public void processPayment(double amount) {
		int service = 5;
		System.out.println("Service Charge for UPI "+(service+amount));
	}
	
}

class NetBanking extends Payment{

	@Override
	public void processPayment(double amount) {
		int service = 15;
		System.out.println("Service Charge for NetBanking "+(service+amount));
	}
	
}