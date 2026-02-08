package Previous_M1;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.stream.*;

public class MediTex_Streams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Tablet> arr = new ArrayList<>();
		System.out.println("Enter the number of tablets");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the tablet details");
		for(int i=0;i<n;i++) {
			String[] parts = sc.nextLine().split(":");
			String name = parts[0];
			String brand = parts[1];
			String expdate = parts[2];
			int mg = Integer.parseInt(parts[3]);
			double price = Double.parseDouble(parts[4]);
			
			DateTimeFormatter fr =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate parsed = LocalDate.parse(expdate,fr);
			
			arr.add(new Tablet(name,brand,parsed,mg,price));
		}
		System.out.println("Enter the brand Name: ");
		String brand = sc.nextLine();
		List<Tablet> res1 = new TabletUtil().retrieveTabletsByBrand(arr.stream(), brand);
		if(res1.isEmpty()) {
			System.out.println("No tablets found");
		}else {
			System.out.println("Tablets of this brand are");
			for(Tablet tb:res1) {
				System.out.println(tb);
			}
		}
		System.out.println("Enter the mg: ");
		int mg = sc.nextInt();
		List<String> res2 = new TabletUtil().getTabletsAboveMg(arr.stream(),mg);
		if(res2.isEmpty()) {
			System.out.println("No tablets found");
		}else {
			System.out.println("Tablets of mg are");
			for(String tb:res2) {
				System.out.println(tb);
			}
		}
	}

}
class Tablet{
	private String name;
	private String brand;
	private LocalDate expiryDate;
	private int mg;
	private double pricePerTablet;
	
	Tablet(String name,String brand,LocalDate expiryDate,int mg,double pricePerTablet){
		this.name = name;
		this.brand = brand;
		this.expiryDate =expiryDate;
		this.mg = mg;
		this.pricePerTablet = pricePerTablet;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public LocalDate getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}

	public int getMg() {
		return mg;
	}

	public void setMg(int mg) {
		this.mg = mg;
	}

	public double getPricePerTablet() {
		return pricePerTablet;
	}

	public void setPricePerTablet(double pricePerTablet) {
		this.pricePerTablet = pricePerTablet;
	}

	public String toString() {
		return name+"|"+brand+"|"+expiryDate+"|"+mg+"|"+pricePerTablet;
	}
}

class TabletUtil{
	public List<Tablet> retrieveTabletsByBrand(Stream<Tablet> tabletStream, String brand){
		return tabletStream
				.filter(e->e.getBrand().equals(brand))
				.collect(Collectors.toList());
	}
	public List<String> getTabletsAboveMg(Stream<Tablet> tabletStream, int mg){
		return tabletStream
				.filter(e->e.getMg()>=mg)
				.map(e->e.getName())
				.collect(Collectors.toList());
	}
}