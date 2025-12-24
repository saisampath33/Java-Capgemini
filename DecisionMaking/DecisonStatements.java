package DecisionMaking;

import java.util.*;

public class DecisonStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int age = 18;
//		if(age>18) {
//			System.out.println("Welcome!!\nYou are eligible for voting");
//			System.out.println("Thank you");
//		}else {
//			System.out.println("Welcome!!");
//			System.out.println("Thank you");
//		}
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the price: ");
		int price = sc.nextInt();
		int discount = (price *10)/100;
		if(price>5000) {
			price -= (discount * 2);
			System.out.println("Discounted price is: "+price);
		}else if(price>=2000) {
			price -= discount;
			System.out.println("Discounted price is: "+price);
		}else {
			System.out.println("No Discount");
		}
	}

}
