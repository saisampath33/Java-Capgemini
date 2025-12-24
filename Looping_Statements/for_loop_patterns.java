package Looping_Statements;

public class for_loop_patterns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//L star pattern
		
		int num = 6;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(j==1 || i==num) {
					System.out.print("* ");
				}
			}
			System.out.println("");
		}
	}

}
