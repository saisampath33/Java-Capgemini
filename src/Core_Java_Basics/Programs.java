package Core_Java_Basics;

public class Programs {
	
	public static void large(int a,int b) {
		System.out.println((a>b)?a:b);
	}
	public static void agecheck(int a) {
		System.out.println((a>=18)?"Eligible for vote":"Not Eligible");
	}
	public static void passorfail(int a) {
		System.out.println((a>40)?"Pass":"Fail");
	}
	public static void divisibleby5(int a) {
		System.out.println((a%5==0)?"Divisible by 5":"Not Divisible by 5");
	}
	public static void multipleof10(int a) {
		System.out.println((a%10==0)?"Multiple by 10":"Not Multiple by 10");
	}
	public static void divisibleby3and5(int a) {
		System.out.println((a%5==0 && a%3==0)?"Divisible by 3 and 5":"Not Divisible by 3 and 5");
	}
	public static void divisiblecheck(int a) {
		if(a%5==0 && a%3==0) {
			System.out.println("Divisible by both");
		}else if(a%5!=0 && a%3==0) {
			System.out.println("Divisible by 3");
		}else if(a%5==0 && a%3!=0) {
			System.out.println("Divisible by 5");
		}else {
			System.out.println("Not Divisible");
		}
	}
	public static void twodigitpositive(int a) {
		System.out.println((a>9 && a>0)?"2 digit positive":"2 digit negative");
	}
	public static void exameligibility(int marks,int attendance) {
		System.out.println((attendance>75 && marks>40)?"Eligible":"Not Eligible");
	}
	public static void preandpostincrement(int a) {
		int b = a++ + ++a + a;
		int c = --a + ++b + b--;
		int d = a + b + c + a--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int res1 = (a>b)?a:b;
		String res2 = (a>0)?"Positive":"Negative";
		String res3 = (a%2==0)?"Even" :"Odd";
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		b += 10;
		System.out.println("Updated b value: "+b);
		large(10,50);
		agecheck(18);
		passorfail(50);
		divisibleby5(27);
		multipleof10(20);
		divisibleby3and5(15);
		divisiblecheck(60);
		twodigitpositive(33);
		exameligibility(45,85);
		preandpostincrement(5);
	}
}
