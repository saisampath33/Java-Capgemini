package Looping_Statements;

public class Pattern8 {

	public static void main(String[] args) {
//		int num = 5;
//		for(int i=1;i<=num;i++) {
//			for(int j=1;j<=num;j++) {
//				if(i==j) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println("");
//		}
		
		int num = 6; //cross pattern 
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i+j==num+1 || i==j) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
