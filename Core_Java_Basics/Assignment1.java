package Core_Java_Basics;

public class Assignment1 {
	public static void answer1(int marks,int attendance) {
		boolean isPass = marks>=40 && attendance>75;
		System.out.println(isPass?marks+=5:"Fail"); //if pass then add 5
		
	}
	
	public static void answer2(int bal,boolean isactive,int amount) {
		boolean status = (bal>0 && isactive==true);
		if(status) {
			if(bal>amount){
				bal -= amount;
				System.out.println("Status: Active "+bal);
			}else {
				System.out.println("Status: Active -> Low balance to withdraw");
			}
		}else {
			System.out.println("Status: Deactive ");
		}
	}
	public static void answer3(int rating,int exp,boolean action) {
		boolean isok = (rating>4 || exp>5) && action==false;
		if(isok) {
			System.out.println("Eligible");
		}else {
			System.out.println("Not Eligible");
		}
	}
	public static void answer4(int total,boolean premium,boolean firstcustomer ) {
		boolean discount = (total>2000 && (premium == true || firstcustomer == false));
		if(discount) {
			double dis = total * 10 / 100.0;
			total -= dis;
			System.out.println("Final price: "+total);
		}else {
			System.out.println("No Discount");
		}
	}
	public static void answer5(boolean psc,int attendance) {
		boolean time = (psc==true || attendance<60);
		if(time) {
			System.out.println("Extra 30min time granted ");
		}else {
			System.out.println("No Extra time");
		}
	}
	public static void answer6(int speed,boolean emergency,int penalty) {
		int speedlimit = 50;
		boolean fine = speed>speedlimit && emergency == false;
		if(fine) {
			penalty += 1000;
			System.out.println("Fine Imposed "+penalty);
		}else {
			System.out.println("No Fine");
		}
	}
	public static void answer7(int quan,boolean fast,boolean discontinued) {
		boolean check = (quan<10 || fast==true) && discontinued == false;
		if(check) {
			System.out.println("Reorder");
		}
	}
	
	public static void answer8(String username,String password) {
		String username1 = "Sampath";
		String password1 = "Sai";
		int attempts =0;
		int maxattempts = 3;
		boolean islocked = false;
		boolean islogin = username.equals(username1) && password.equals(password1) && !islocked;
		
		attempts += islogin?0:1;
		islocked = (attempts>=maxattempts)?true:false;
		String res = islogin?"Login Successfull":(islocked?"Account Locked":"Login Failed");
		System.out.println(res);
		System.out.println("Attempts Remaining: "+attempts);
	}
	
	public static void answer9(int units,boolean comm) {
		boolean isok = units>300 || comm==true;
		if(isok) {
			int bill = 1000;
			bill += 100;
			System.out.println("Bill with tax "+bill);
		}
	}
	public static void answer10(int score,boolean level,boolean cheats) {
		int bonus = 20;
		boolean iseligible = score >100 && level == true && cheats==false;
		if(iseligible) {
			System.out.println("Bonus granted "+(score+bonus));
		}else {
			System.out.println("Not Eligible");
		}
	}
	public static void main(String[] sai) {
		answer1(50,76);
		answer2(0,true,44000);
		answer3(5,6,true);
		answer4(2500,true,false);
		answer5(true,89);
		answer6(60,false,1000);
		answer7(10,true,false);
		answer8("Sampath","ai");
		answer9(400,false);
		answer10(150,true,true);
	}
}
