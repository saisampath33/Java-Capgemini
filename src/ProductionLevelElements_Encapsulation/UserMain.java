package ProductionLevelElements_Encapsulation;

import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 3;
		User u1 = new User("Sampath Kumar", "sampath@gmail.com", "Sampath@33");
		System.out.println("Hello," + u1.getName());
		System.out.println("Welcome to ABC bank login page, Please enter your credentials!");

		while (count > 0) {
			if (count == 3) {
				System.out.println("Please enter your password");

			} else {
				System.out.println("Please enter the correct password");

			}

			String password = sc.next();
			if (!password.equals(u1.getPassword())) {
				System.out.println("Wrong password! you have " + (count - 1) + " chances to try again");
			} else {
				System.out.println("Welcome to the ABC Finance Bank pvt.ltd");
				break;

			}
			count--;
			if (count == 0) {
				System.out.println("Forgot Password? Please type yes/no");
				String check = sc.next().toLowerCase();
				if (check.equals("yes")) {
					System.out.println("Please enter the new password");
					String newPassword = sc.next();
					System.out.println("Please confirm the password again");
					String confirmPassword = sc.next();
					if (newPassword.equals(confirmPassword)) {
						u1.setPassword(confirmPassword);
						System.out.println("Password is changes successfully!");
						System.out.println("Do you want to login again?");
						check = sc.next();
						if (check.equals("yes")) {
							count = 3;
						} else {
							System.out.println("Thank you, We are glad to have you.");
							System.out.println("Visit us again");
						}
					}else {
						System.out.println("Password does not match");
					}
				}
			}
		}

	}

}

