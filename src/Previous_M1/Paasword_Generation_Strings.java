package Previous_M1;
import java.util.*;
public class Paasword_Generation_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String user = sc.nextLine();
		if(user.length()>8){
			System.out.println(user+" is an invalid username");
			return;
		}
		if(!user.matches("[A-Z]{4}@1((0[1-9])|(1[0-5]))")) { //01 → 15  and | -> OR
			System.out.println(user+" is an invalid username");
			return;
		}
		String password = "TECH_";
		int sum = 0;
		String part = user.substring(0,4);
		part = part.toLowerCase();
		for(int i=0;i<part.length();i++) {
			sum += (int)part.charAt(i);
		}
		String part1 = user.substring(6,user.length());
		StringBuilder sb = new StringBuilder("TECH_");
		sb.append(sum).append(part1);
		System.out.println("Password:"+sb.toString());
		
	}
}
