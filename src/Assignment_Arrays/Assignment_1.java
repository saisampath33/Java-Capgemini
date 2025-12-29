package Assignment_Arrays;

import java.util.Scanner;

import Demo.Main;
import Number_Programs.Assignment_Numbers;

public class Assignment_1 {
	
	public static void divby5(int[] arr) {
		System.out.println("Elements div by 5 are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%5==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void evenindex(int[] arr) {
		System.out.println("Elements at even index are: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void evenelement(int[] arr) {
		System.out.println("Even elements are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void oddelement(int[] arr) {
		System.out.println("Odd elements  are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void oddindex(int[] arr) {
		System.out.println("Elements at odd index are: ");
		for(int i=0;i<arr.length;i++) {
			if(i%2!=0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void posevenelement(int[] arr) {
		System.out.println("Elements of pos and even are: ");
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0 && arr[i]%2==0) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	
	public static void firstandlast(int[] arr) {
		System.out.println("first nd last elements are: ");
		System.out.print(arr[0]+" ");
		System.out.print(arr[arr.length-1]);
		System.out.println();
	}
	public static int sumofelements(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int sumevenelements(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	public static int sumoddelements(int[] arr) {
		int sum =0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2!=0) {
				sum+=arr[i];
			}
		}
		return sum;
	}
	public static int average(int[] arr) {
		int sum =0;
		int cnt =0;
		for(int i=0;i<arr.length;i++) {
			sum += arr[i];
			cnt++;
		}
		
		return sum/cnt;
	}
	public static int avgevenelements(int[] arr) {
		int sum =0;
		int cnt=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}
			cnt++;
		}
		return sum/cnt;
	}
	public static int diffevenandoddsum(int[] arr) {
		int sum =0;
		int sum1=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				sum+=arr[i];
			}else {
				sum1 += arr[i];
			}
		}
		return Math.abs(sum-sum1);
	}
	
	static boolean armstrong(int i) {
		int sum=0,cnt=0;
		int temp =i;
		while(i>0) {
			cnt++;
			i=i/10;
		}
		i = temp;
		while(i>0) {
			int ld = i%10;
			sum += Math.pow(ld,cnt);
			i=i/10;
		}
		return sum == temp;
		
	}
	static boolean palindrome(int n) {
		int rev =0;
		int temp = n;
		while(n>0) {
			int ld = n%10;
			rev = (rev * 10)+ld;
			n=n/10;
		}
		return temp==rev;
	}
	public static void armstronginarray(int[] arr) {
		System.out.println("Armstrong elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			if(armstrong(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void palindromeinarray(int[] arr) {
		System.out.println("Palindrome elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			if(palindrome(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void primeinarray(int[] arr) {
		System.out.println("Prime elements in the array: ");
		for(int i=0;i<arr.length;i++) {
			if(Assignment_Numbers.prime(arr[i])) {
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
	}
	public static void palindromicarray(int[] arr) {
		boolean ispalindrome = true;
		int i=0,j=arr.length-1;
		while(i<j) {
			if(arr[i]!=arr[j]) {
				ispalindrome = false;
				break;
			}
			i++;
			j--;
		}
		if(ispalindrome) {
			System.out.println("Palindromic Array");
		}else {
			System.out.println("Not a Palindromic array");
		}
		System.out.println();
	}
	public static int[] copyarray(int[] arr) {
		int[] copy = new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			copy[i] = arr[i];
		}
		return copy;
	}
	public static void insertinindex(int element,int index,int[] arr) {
		int[] newarr = new int[arr.length+1];
		System.out.println("Array after inserting: ");
		for(int i=0,j=0;i<newarr.length;i++) {
			if(i==index) {
				newarr[i] = element;
			}else {
				newarr[i] = arr[j]; //j is one step behind i and after inserting it copies old value to next position
				j++;
			}
		}
		for(int i=0;i<newarr.length;i++) {
			System.out.print(newarr[i]+" ");
		}
		System.out.println();
	}
	public static int largest(int[] arr) {
		int large = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				large = arr[i];
			}
		}
		return large;
	}
	public static int secondlargest(int[] arr) {
		int large = Integer.MIN_VALUE,slarge = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				slarge = large;
				large = arr[i];
			}else if(arr[i]<large && arr[i]>slarge) {
				slarge = arr[i];
			}
		}
		return slarge;
	}
	static void swap(int[] arr,int i,int j) {
		 int temp = arr[i];
		 arr[i] = arr[j];
		 arr[j] = temp;
	}
	public static void reverse(int[] arr) {
		    int i = 0, j = arr.length - 1;
		    while (i < j) {
		        swap(arr,i,j);
		        i++;
		        j--;
		    }

		    for (int k = 0; k < arr.length; k++) {
		        System.out.print(arr[k] + " ");
		    }
		    System.out.println();
	}
	
	public static void merge(int[] arr,int[] arr1) {
		int[] mergearr = new int[arr.length+arr1.length];
		System.out.println("Merged Array: ");
		for(int i=0;i<arr.length;i++) {
			mergearr[i] = arr[i];
		}
		for(int j=0;j<arr1.length;j++) {
			mergearr[j+arr.length] = arr1[j];
		}
		
		for(int i=0;i<mergearr.length;i++) {
			System.out.print(mergearr[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int[] arr;
		arr = new int[] {1,2,5,121,8,153,-4,-3,232}; //size is 8   
		int[] arr1 = {1,2,1};
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter the size: ");
//		int n = sc.nextInt();
//		int[] arr = new int[n];
//		System.out.println("Enter the elements: ");
//		for(int i=0;i<n;i++) {
//			arr[i] = sc.nextInt();
//		}
//		Assignment_Numbers obj = new Assignment_Numbers();
		Assignment_Numbers.armstrong(153); // For static methods no  need create objects calling that method from class Assignment_Numbers from another package
		divby5(arr);
		evenindex(arr);
		evenelement(arr);
		oddelement(arr);
		oddindex(arr);
		posevenelement(arr);
		firstandlast(arr);
		System.out.println("Sum is: "+sumofelements(arr));
		System.out.println("Sum of even elements is: "+sumevenelements(arr));
		System.out.println("Sum of odd elements is: "+sumoddelements(arr));
		System.out.println("Average: "+average(arr));
		System.out.println("Average of even elements: "+avgevenelements(arr));
		System.out.println("Difference of even and odd sum: "+diffevenandoddsum(arr));
		armstronginarray(arr);
		palindromeinarray(arr);
		primeinarray(arr);
		palindromicarray(arr1);
		System.out.println("Copy array is: ");
		int[] arr2 = copyarray(arr); // new array created
		for(int i=0;i<arr2.length;i++) {
			System.out.print(arr2[i]+" ");
		}
		System.out.println();
		
		//copy elements in another array by this also
//		int[] b = arr;   // both point to same array NO new array is created and b stores the same reference as a Both point to one single array in memory
//		for(int i=0;i<b.length;i++) {
//			System.out.print(b[i]+" ");
//		}
		
		insertinindex(10,2,arr);
		System.out.println("Largest element in array: "+largest(arr));
		System.out.println("Second Largest element in array: "+secondlargest(arr));
//		swap(5,10);
		reverse(arr);
		merge(arr,arr1);
	}

}
