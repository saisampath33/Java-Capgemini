package Number_Programs;
import java.util.*;
public class Assignment_Numbers {

	public static void count(int n) {
		int cnt =0;
		while(n>0) {
			n = n/10;
			cnt++;
		}
		System.out.println("Count of numbers: "+cnt);
	}
	public static void sum(int n) {
		int sum =0;
		while(n>0) {
			int ld = n%10;
			sum += ld;
			n=n/10;
		}
		System.out.println("Sum of digits is: "+sum);
	}
	public static void product(int n) {
		int pro = 1;
		while(n>0) {
			int ld = n%10;
			pro *= ld;
			n=n/10;
		}
		System.out.println("Product is: "+pro);
	}
	public static void spynumber(int n) {
		int sum=0;
		int pro=1;
		int temp = n;
		while(n>0) {
			int ld = n%10;
			pro *= ld;
			sum += ld;
			n=n/10;
		}
		if(sum == pro) System.out.println(temp+" is a Spy Number");
		else System.out.println("It is not a spy number");
	}
	public static boolean prime(int n) {
		boolean isprime = true;
		if(n<=2) isprime = false; 
		for(int i=2;i<=n/2;i++) {
			if(n%i==0) {
				isprime = false;
				break;
			}
		}
		return isprime;
	}
	public static void factors(int n) {
		int factor =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				factor = i;
				System.out.print(factor+" ");
			}
		}
	}
	public static void factorsofalldigits(int n) {
		while(n>0) {
			int ld = n%10;
			if(ld==0) {
				System.out.println("No factors");
			}else {
				System.out.println("Factors of "+ld+" is ");
				for(int i=1;i<=ld;i++) {
					if(ld%i==0) System.out.println(i+ " ");
				}
			}
			n = n/10;
		}
	}
	public static void armstrong(int n) {
		int cnt =0;
		int sum =0;
		int temp = n;
		while(n>0) {
			cnt++;
			n=n/10;
		}
		n = temp;
		while(n>0) {
			int ld = n%10;
			sum += Math.pow(ld,cnt);
			n=n/10;
		}
		if(temp == sum) {
			System.out.println("It is a Armstrong Number");
		}else {
			System.out.println("It is not a Armstrong Number");
		}
	}
	
	public static int factorialofnumber(int n) {
		int fact =1;
		for(int i=1;i<=n;i++) {
			fact *= i;
		}
		return fact;
	}
	public static void neonnumber(int n) {
		int square = n*n;
		int sum =0;
		while(square>0) {
			int ld = square%10;
			sum += ld;
			square /= 10;
		}
		if(sum==n) {
			System.out.println("It is a neon number");
		}else {
			System.out.println("It is not a neon number");
		}
	}
	public static void factorialofeachdigit(int n) {
		while(n>0) {
			int fact =1;
			int ld = n%10;
			if(ld>0) {
				for(int i=1;i<=ld;i++) {
					fact *= i;
				}
			}else {
				fact =0;
			}
			System.out.println("Factorial of "+ld+" is "+fact);
			n=n/10;
		}
	}
	public static void sunnynumber(int n) {
		int sum =0;
		while(n>0) {
			int fact =1;
			int ld = n%10;
			if(ld==0) {
				fact = 1;
				sum += fact;
			}else {
				for(int i=1;i<=ld;i++) {
					fact *= i;
				}
				sum += fact;
			}
			n=n/10;
		}
		System.out.println("Sum of factorial of each digit is: "+sum);
	}
	public static void main(String[] args) {
		count(176823);
		sum(12323);
		product(1232);
		spynumber(1234);
		if(prime(5)) {
			System.out.println("It is a prime Number");
		}else {
			System.out.println("It is not a prime number");
		}
		factors(12);
		System.out.println();
		factorsofalldigits(123);
		armstrong(1234);
		System.out.println("Factorial is: "+ factorialofnumber(5));
		neonnumber(9);
		factorialofeachdigit(123);
		sunnynumber(123);
	}

}
