package Looping_Statements;

public class Traingle1 {

	public static void main(String[] args) {
		int num = 5; //rows
		//Normal Traingle
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {
//				if(i+j>=num+1 && j-i<=num-1) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		//reverse traingle 
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<num*2;j++) {
//				if(i+j<=num*2 && i<=j) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		//Right Traingle
		
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<=num;j++) {
//				if(i+j<=num*2 && j<=i) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		//Left Traingle
		
		for(int i=1;i<num*2;i++) {
			for(int j=1;j<=num;j++) {
				if(i+j>=num+1 && i-j<=num-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		

	}

}
