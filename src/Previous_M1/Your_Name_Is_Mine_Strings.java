package Previous_M1;
import java.util.*;
public class Your_Name_Is_Mine_Strings {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the man name: ");
		String man = sc.nextLine();
		System.out.println("Enter the woman name: ");
		String woman = sc.nextLine();
		
		boolean isman = false;
		boolean iswoman = false;
		for(char c:man.toCharArray()) {
			if(!(Character.isLetter(c) || c==' ')) {
				isman = true;
				break;
			}
		}
		for(char c:woman.toCharArray()) {
			if(!(Character.isLetter(c) || c==' ')) {
				iswoman = true;
				break;
			}
		}
		if(isman && iswoman) {
			System.out.println("Both "+man+" and "+woman+" are invalid");
			return;
		}
		if(isman) {
			System.out.println(man+" is invalid name");
			return;
		}
		if(iswoman) {
			System.out.println(woman+" is invalid name");
			return;
		}
		
		int i=0,j=0;
		while(i<man.length() && j<woman.length()) {
			if(man.charAt(i) == woman.charAt(j)) {
				i++;
			}
			j++;
		}
		if(i==man.length()) {
		System.out.println("Made for each other");
		}
	}

}
