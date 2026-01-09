package Polymorphism;

public class Banking_Interest_Calculator {

	public static void main(String[] args) {
		BankAccount b = new SavingsAccount();
		BankAccount b1 = new FixedDeposit();
		BankAccount b2 = new CurrentAccount();
		b.calculateInterest();
		b1.calculateInterest();
		b2.calculateInterest();
	}
}

class BankAccount{
	void calculateInterest() {
		System.out.println("Calculating the Intrest");
	}
}

class SavingsAccount extends BankAccount{
	void calculateInterest() {
		System.out.println("Calculating the Intrest in Savings Account");
	}
}

class FixedDeposit extends BankAccount{
	void calculateInterest() {
		System.out.println("Calculating the Intrest in Fixed Deposit");
	}
}
class CurrentAccount extends BankAccount{
		void calculateInterest() {
			System.out.println("Calculating the Intrest in Current Account");
		}
}

