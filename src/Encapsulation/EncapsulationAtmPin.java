package Encapsulation;

public class EncapsulationAtmPin {

	static class Account {
		private int pin;

		public Account(int pin) {
			this.pin = pin;

		}

		public boolean verifyPin(int enteredPin) {
			return this.pin == enteredPin;

		}

		public void changePin(int oldPin, int newPin) {
			if (!verifyPin(oldPin)) {
				System.out.println("Incorrect OLD PIN, Cannot change!");
				return;
			}

			if (newPin < 1000 || newPin > 9999) {
				System.out.println("PIN must be 4 digits");
				return;

			}

			this.pin = newPin;
			System.out.println("PIN changed Successfully");

		}

	}

	public static void main(String[] args) {
		Account account = new Account(1234);
		account.changePin(1234, 4567);

	}

}
