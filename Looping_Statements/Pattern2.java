package Looping_Statements;

public class Pattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 6;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i==num || j==num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println("");
		}
	}

}
