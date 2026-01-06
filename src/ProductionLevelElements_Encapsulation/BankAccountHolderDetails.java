package ProductionLevelElements_Encapsulation;

public class BankAccountHolderDetails {
	
	private final int accountNumber;
	private String accountHolderName;
	private int balance;
	
	private static final int MINIMUM_BALANCE = 500;
	public BankAccountHolderDetails(int accountNumber,String accountHolderName, int balance) 
	{
		if (accountHolderName == null || accountHolderName.trim().isEmpty()) {
			throw new IllegalArgumentException("Invalid account holder name");
		}
		if (balance < MINIMUM_BALANCE) {
			throw new IllegalArgumentException("Initial balance must be at least " + MINIMUM_BALANCE);
		}
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName.trim();
		this.balance = balance;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public int getAvailableBalance() {
		return balance - MINIMUM_BALANCE;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void deposit(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount");
		}
		balance += amount;
	}
	public void withdraw(int amount) {
		if (amount <= 0 || amount > (balance - MINIMUM_BALANCE)) {
			throw new IllegalArgumentException("Invalid withdraw amount");
		}
		balance -= amount;
	}

	public String getAccountSummary() {
		return "Account Number: " + accountNumber + "\nAccount Holder: " + accountHolderName + "\nAvailable Balance: "

				+ getAvailableBalance();
	}
}
