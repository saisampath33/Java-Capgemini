package Arrays;

public class Array_2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[][] arr = new int[2][2];
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[1][0] = 3;
//		arr[1][1] = 4;
//		for(int i=0;i<arr.length;i++) {
//			for(int j=0;j<arr.length;j++) {
//				System.out.print(arr[i][j]+" ");
//			}
//		}
		
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				System.out.print(arr1[i][j]+" ");
			}
			System.out.println();
		}
 	}

}
