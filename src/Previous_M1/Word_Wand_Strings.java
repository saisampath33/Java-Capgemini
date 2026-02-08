package Previous_M1;
import java.util.*;

public class Word_Wand_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Senetence: ");
		String a = sc.nextLine();
		String[] parts = a.split(" ");
		int len = parts.length;
		StringBuilder ans1 = new StringBuilder();
		StringBuilder ans2 = new StringBuilder();
		for(char c:a.toCharArray()) {
			if(!(Character.isLetter(c) || c==' ')) {
				System.out.println("Invalid Sentence");
				return;
			}
		}
		System.out.println("Wod Count: "+len);
		if(len%2==0) {
			for(int i=len-1;i>=0;i--) {
				ans1.append(parts[i]+" ");
			}
			System.out.println(ans1.toString());
		}else {
			for(String part:parts) {
				StringBuilder s = new StringBuilder(part).reverse();
				ans2.append(s+" ");
			}
			System.out.println(ans2);
		}
	}

}
