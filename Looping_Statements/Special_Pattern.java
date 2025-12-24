package Looping_Statements;

public class Special_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Hollow Rectangle in middle of square
//		int num = 15;
//		for(int i=1;i<num*2;i++) {
//			for(int j=1;j<num*2;j++) {
//				if(!(i+j>=num+1 && i+j<=(num*3-1) && i-j<=3 && j-i<=3)) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		//Butterfly
		int num = 6;
		for(int i=1;i<num*2;i++) {
			for(int j=1;j<num*2;j++) {
				if(i+j==2*num | i==j || i==num || j==1 || j==num*2 -1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
