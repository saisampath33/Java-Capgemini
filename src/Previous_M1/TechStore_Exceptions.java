package Previous_M1;

import java.util.Scanner;

public class TechStore_Exceptions {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of gadget entries");
		int n = sc.nextInt();
		sc.nextLine();
		TechStore tc = new TechStore();
		for(int i=1;i<=n;i++) {
			System.out.println("Enter the gadget "+i+" details");
			String input = sc.nextLine();
			String[] parts = input.split(":");
			int period = Integer.parseInt(parts[2]);
			try {
				tc.validateGadget(parts[0]);
				tc.validateWarrantyPeriod(period);
				System.out.println("Warranty accepted, Stock Updated");
				
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
class TechStore{
	public boolean validateGadget(String gadgetID) {
		if(!(gadgetID.matches("[A-Z]\\d{3}"))) {
			throw new InvalidGadgetException("Invalid gadget ID");
		}
		return true;
	}
	public boolean validateWarrantyPeriod(int period) {
		if(period <6 || period>36) {
			throw new InvalidGadgetException("Invalid warranty period");
		}
		return true;
	}
}

class  InvalidGadgetException extends RuntimeException{
	public InvalidGadgetException(String message) {
		super(message);
	}
}