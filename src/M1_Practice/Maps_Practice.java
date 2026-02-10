package M1_Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maps_Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
		Country cn = new Country();
		do {
			System.out.println("1.Add\n2.Search\n3.Exit");
			System.out.println("Enter your choice");
			n = sc.nextInt();
			sc.nextLine();
			switch(n) {
				case 1:
					System.out.println("Enter the country name");
					String cname = sc.nextLine();
					System.out.println("Enter the capital name");
					String capname = sc.nextLine();
					cn.add(cname, capname);
					break;
				case 2:
					
					if(cn.getMap().isEmpty()) {
						System.out.println("The map is empty");
					}else {
						System.out.println("Enter the country name to search: ");
						String conname = sc.nextLine();
						 System.out.println(cn.search(conname));
					}
					break;
				case 3:
					System.out.println("Thank you for using the application.");
					break;
			}
			
		}while(n!=3);
	}

}
class Country{
	private Map<String,String> countryMap = new HashMap<>();
	public Map<String,String> getMap(){
		return countryMap;
	}
	public void setMap(Map<String,String> countryMap) {
		this.countryMap = countryMap;
	}
	public void add(String cname, String capname) {
		countryMap.put(cname, capname);
	}
	public String search(String cname) {
//		String res="";
		for(Map.Entry<String,String> entry : countryMap.entrySet()) {
			if(entry.getKey().equals(cname)) {
				return entry.getValue();
			}
		}
		return "Data not found";
	}
}