package DecisionMaking;

import java.util.Scanner;

public class Assignment2 {
	
	public static void divby5and11(int num) {
		if(num%5==0 && num%11==0) {
			System.out.println("Divisible By both 5 and 11");
		}else {
			System.out.println("Not divisible");
		}
	}
	public static void maxof3(int a,int b,int c) {
		int max;
		if(a>b) {
			if(a>c) {
				max = a;
			}else {
				max =c;
			}
		}else {
			if(b>c) {
				max = b;
			}else {
				max = c;
			}
		}
		System.out.println("Maximum numbber is: "+max);
	}
	public static void vowelorconsonent(char ch) {
		char c = Character.toLowerCase(ch);
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			System.out.println("Character is Vowel ");
		}else {
			System.out.println("Character is Consonent");
		}
	}
	public static void evenorodd(int num) {
		if(num%2==0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
	}
	public static void posorneg(int num) {
		if(num>0) {
			System.out.println("Positive");
		}else if(num==0) {
			System.out.println("Zero");
		}else {
			System.out.println("Negative");
		}
	}
	public static void numberofdaysinmonth(String monthname) {
		String m = monthname.toLowerCase();
		switch(m) {
			case "january":
				System.out.println("Number of days are 30");
				break;
			case "february":
				System.out.println("Number of days are 28");
				break;
			case "march":
				System.out.println("Number of days are 31");
				break;
			case "april":
				System.out.println("Number of days are 30");
				break;
			case "may":
				System.out.println("Number of days are 31");
				break;
			case "june":
				System.out.println("Number of days are 30");
				break;
			case "july":
				System.out.println("Number of days are 31");
				break;
			case "august":
				System.out.println("Number of days are 31");
				break;
			case "september":
				System.out.println("Number of days are 31");
				break;
			case "october":
				System.out.println("Number of days are 31");
				break;
			case "november":
				System.out.println("Number of days are 31");
				break;
			case "december":
				System.out.println("Number of days are 31");
		}
	}
	public static void checkchar(char ch) {
		if(Character.isUpperCase(ch)) {
			System.out.println("UpperCase");
		}else if(Character.isLowerCase(ch)) {
			System.out.println("Lowercase");
		}else if(Character.isDigit(ch)) {
			System.out.println("Digit");
		}else {
			System.out.println("Special Character");
		}
	}
	public static void percentageandgrade(int sub1,int sub2,int sub3,int sub4,int sub5) {
		int percent = ((sub1+sub2+sub3+sub4+sub5)/500)*100;
		if(percent>=90) {
			System.out.println("Grade A+");
		}else if(percent>=80) {
			System.out.println("Grade A");
		}else if(percent>=70) {
			System.out.println("Grade B");
		}else {
			System.out.println("Failed");
		}
	}
	public static void traingle(int a,int b,int c) {
		if(a==b && b==c && c==a) {
			System.out.println("Equilateral Traingle");
		}else if(a!=b && b!=c && c!=a) {
			System.out.println("Scalene Traingle");
		}else {
			System.out.println("Isosceles Traingle");
		}
	}
	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter number to check: ");
//		int num = sc.nextInt();
//		System.out.println("Enter Character to check: ");
//		char ch = sc.next().charAt(0);
//		System.out.println("Max of 3 numbers: ");
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		int c = sc.nextInt();
//		System.out.println("Month: ");
//		String str = sc.next();
//		divby5and11(num);
//		vowelorconsonent(ch);
//		maxof3(a,b,c);
//		System.out.println("Even or ODD: ");
//		evenorodd(num);
//		posorneg(num);
//		numberofdaysinmonth(str);
//		checkchar(ch);
		traingle(12,14,13);
		
	}

}
