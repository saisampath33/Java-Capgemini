package Looping_Statements;

public class Hollow_Traingle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 12;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<num*2;j++) {
				if(i+j==num+1 || j-i==num-1 || i==num) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}

	}

}
