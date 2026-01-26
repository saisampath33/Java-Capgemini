package Previous_M1;

import java.util.*;

public class Apartment_Collections_Maps {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of details to be added");
		int n = sc.nextInt();
		sc.nextLine(); //consumes new line
		Apartment apt = new Apartment();
		System.out.println("Enter the details (aptnumber:rent)");
		for(int i=0;i<n;i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");
			String aptnumber = parts[0];
			double rent = Double.parseDouble(parts[1]);
			apt.addApartmentDetails(aptnumber, rent);
		}
		System.out.println("Enter the range to filter the details");
		double min = sc.nextDouble();
		double max = sc.nextDouble();
		double result = apt.findTotalRentOfApartmentsInGivenRange(min,max);
		if(result!=0) {
			System.out.println("Total Rent in the range "+min+" and "+max+" is "+result);
		}else {
			System.out.println("No apartments found in this range");
		}
		
	}
}
class Apartment{
	private Map<String,Double> apartmentDetailsMap;
	Apartment(){
		apartmentDetailsMap = new HashMap<>();
	}
	void addApartmentDetails(String apartmentNumber,double rent) {
		apartmentDetailsMap.put(apartmentNumber, rent);
	}
	public double findTotalRentOfApartmentsInGivenRange(double minrent,double maxrent) {
		double res =0;
		for(Map.Entry<String,Double> entry : apartmentDetailsMap.entrySet()) {
			if(entry.getValue()>=minrent && entry.getValue()<=maxrent) {
				res+=entry.getValue();
			}
		}
		
		return res;
	}
}
