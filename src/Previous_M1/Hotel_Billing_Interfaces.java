package Previous_M1;

import java.time.LocalDate;

import java.util.Scanner;

public class Hotel_Billing_Interfaces {

	public static void main(String[] args) {
		 // Deluxe Room
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter Deluxe Room Details:");
        System.out.println("Guest Name:");
        String dName = sc.nextLine();
        System.out.println("Rate per Night:");
        double dRate = sc.nextDouble();
        System.out.println("Nights Stayed:");
        int dNights = sc.nextInt();
        System.out.println("Joining Year:");
        int dYear = sc.nextInt();
        sc.nextLine(); // buffer clear

        HotelRoom deluxe = new HotelRoom("Deluxe", dRate, dName);

        int dMembership = deluxe.calculateMembershipYears(dYear);
        double dBill = deluxe.calculateTotalBill(dNights, dYear);

        // Suite Room
        System.out.println("\nEnter Suite Room Details:");
        System.out.println("Guest Name:");
        String sName = sc.nextLine();
        System.out.println("Rate per Night:");
        double sRate = sc.nextDouble();
        System.out.println("Nights Stayed:");
        int sNights = sc.nextInt();
        System.out.println("Joining Year:");
        int sYear = sc.nextInt();

        HotelRoom suite = new HotelRoom("Suite", sRate, sName);

        int sMembership = suite.calculateMembershipYears(sYear);
        double sBill = suite.calculateTotalBill(sNights, sYear);

        // Output
        System.out.println("\nRoom Summary:");
        System.out.println("Deluxe Room: " + dName + ", " + dRate +
                " per night, Membership: " + dMembership + " years");
        System.out.println("Suite Room: " + sName + ", " + sRate +
                " per night, Membership: " + sMembership + " years");

        System.out.println("\nTotal Bill:");
        System.out.println("For " + dName + " (Deluxe): " + dBill);
        System.out.println("For " + sName + " (Suite): " + sBill);
	}

}
interface Room {
	
	public double calculateTotalBill(int nightsStayed, int joiningYear);
	public default int calculateMembershipYears(int joiningYear) {
		
		int currentYear = LocalDate.now().getYear();
		return (currentYear-joiningYear)-1;
	}
}

class HotelRoom implements Room{
    private String roomType;
    private double ratePerNight;
    private String guestName;

    public HotelRoom(String roomType, double ratePerNight, String guestName) {
        this.roomType = roomType;
        this.ratePerNight = ratePerNight;
        this.guestName = guestName;
    }

    public String getRoomType() {
        return roomType;
    }

    public double getRatePerNight() {
        return ratePerNight;
    }

    public String getGuestName() {
        return guestName;
    }

    public void setRoomType(String roomType) {
		this.roomType = roomType;
	}

	public void setRatePerNight(double ratePerNight) {
		this.ratePerNight = ratePerNight;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}
	
	public double calculateTotalBill(int nightsStayed, int joiningYear) {
		
		double total =  nightsStayed*ratePerNight;
		int years = calculateMembershipYears(joiningYear);
		if(years>3) {
			total = total*0.9;
		}
		return Math.round(total);
	}

}

