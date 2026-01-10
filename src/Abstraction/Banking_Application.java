package Abstraction;

public class Banking_Application {
	public static void main(String[] args) {
	
		BankAccount acc = new Savings(10000);
		BankAccount acc1 = new Current(12000);
		acc.deposit(1230);
		acc.withdraw(30);
		acc.calculateInterest();
		acc1.calculateInterest();
	}
}

abstract class BankAccount{
	protected double balance;
	
	BankAccount(double balance){
		this.balance = balance;
	}
	abstract void calculateInterest();
	void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited the amount "+amount);
		System.out.println("Current Balance is "+balance);
	}
	void withdraw(double amount) {
		balance -= amount;
		System.out.println("Withdraw Amount: "+amount);
		System.out.println("Current Balance: "+balance);
	}
}

class Savings extends BankAccount{
	Savings(int balance){
		super(balance);
	}
	void calculateInterest() {
		double intrest = balance*0.04;
		System.out.println("Savings Account intrest is "+intrest);
	}
}

class Current extends BankAccount{
	Current(int balance){
		super(balance);
	}
	void calculateInterest() {
		System.out.println("No interest in current account");
	}
}