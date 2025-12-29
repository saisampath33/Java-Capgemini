package Looping_Statements;

public class DiamondPattern {

	public static void main(String[] args) {
		int num = 4;
		for(int i=1;i<num*2;i++) {
			for(int j=1;j<num*2;j++) {
				if(i+j>=num+1 && i+j<=(num*3-1) && i-j<=3 && j-i<=3) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
