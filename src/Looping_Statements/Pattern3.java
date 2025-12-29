package Looping_Statements;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 6;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==1 || j==num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
