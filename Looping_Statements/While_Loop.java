package Looping_Statements;

import java.util.Scanner;

public class While_Loop {

	public static void main(String[] args) {
//		int i=0;
//		while(i<10) {
//			System.out.println("*");
//			i++;
//		}
//		Scanner sc = new Scanner(System.in);
//		char ch;
//		do {
//			System.out.println("Welcome");
//			System.out.println("Do you want me to print again y or n");
//			ch = sc.next().charAt(0);
//		}while(ch=='y' || ch=='Y');
		
		for(int i=1;i<=10;i++) {
			System.out.println("2 * "+i+" = "+(2*i));
		}
		System.out.println(" ");
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
	}

}
