package ProductionLevelElements_Encapsulation;

public class BankMain {

	public static void main(String[] args) {
		
		BankAccountHolderDetails user1 = new BankAccountHolderDetails(12345,"Sampath",50000);
		user1.deposit(3000);
		user1.withdraw(2000);
		System.out.println(user1.getAccountNumber());
		System.out.println(user1.getAccountHolderName());
		System.out.println(user1.getAvailableBalance());
		System.out.println(user1.getAccountSummary());
		
	}

}
