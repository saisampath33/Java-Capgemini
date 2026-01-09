package Encapsulation;

public class EncapsulationBank {

	static class Bank {
		private int accountNumber;
		private int balance;

		Bank(int accountNumber, int balance) {

			this.accountNumber = accountNumber;
			this.balance = balance;
		}

		public int getaccountNumber() {
			return accountNumber;
		}

		public int getBalance() {
			return balance;
		}

		public void deposit(int amount) {
			if (amount > 0) {
				balance += amount;
			} else {
				System.out.println("Invalid Amount");
			}
		}

		public void withdraw(int amount) {

			if (amount < 0 || amount > balance) {
				System.out.println("Invalid withdraw amount");
			} else {
				balance -= amount;
			}
		}
	}

	public static void main(String[] args) {
		Bank sbi = new Bank(12345, 3000);
		System.out.println(sbi.getaccountNumber());
		System.out.println(sbi.getBalance());
		sbi.deposit(100);
		sbi.withdraw(50);
		System.out.println(sbi.getBalance());
	}

}
