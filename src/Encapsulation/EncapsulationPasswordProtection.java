package Encapsulation;

public class EncapsulationPasswordProtection {
	static class AccountProtection {
		private String password;

		public void setPassword(String password) {
			if (password == null) {
				System.out.println("Password cannot be null");
				return;
			}
			if (password.length() < 6) {
				System.out.println("Password is too weak! MIN Characters is 6");
				return;
			}
			this.password = password;
			System.out.println("Password is set Successfully!");
		}

		public boolean validatePassword(String enteredPassword) {

			return password != null && password.equals(enteredPassword);
		}

		public void changePassword(String oldPassword, String newPassword) {
			if (!validatePassword(oldPassword)) {
				System.out.println("Old password is incorrect, Sorry!");
				return;
			}
			if (newPassword == null || newPassword.length() < 6) {
				System.out.println("New password is too weak");
				return;
			}

			this.password = newPassword;
			System.out.println("Password changes successfully!");
		}
	}

	public static void main(String[] args) {
		AccountProtection accountProtection = new AccountProtection();
		accountProtection.setPassword("svarunk");
		accountProtection.changePassword("svarunk", "Svarunk");

	}
}
