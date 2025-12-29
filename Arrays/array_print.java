package Arrays;

import java.util.Scanner;

public class array_print {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = {1,2,3,4,5};
		int arr1[] = new int[] {1,2,3,3};
		
		System.out.println(arr1[1]);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the elements in array: ");
		int arr3[] = new int[5];
		for(int i=0;i<5;i++) {
			arr3[i]=sc.nextInt();
		}
		
		for(int i=0;i<arr3.length;i++) {
			System.out.print(arr3[i]+" ");
		}
		
		
 	}

}
