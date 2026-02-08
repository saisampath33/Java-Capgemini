package Previous_M1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Sound_Sphere_Streams {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Earphone> arr = new ArrayList<>();
		System.out.println("Enter the number of earphones");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter the earphone details: ");
	
		for(int i=0;i<number;i++) {
			String input = sc.nextLine();
			String[] parts = input.split(":");
			String brandname = parts[0];
			String date = parts[1];
			double price = Double.parseDouble(parts[2]);
			double rating = Double.parseDouble(parts[3]);
			
			DateTimeFormatter fr = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate parsed = LocalDate.parse(date,fr);
			
			arr.add(new Earphone(brandname,parsed,price,rating));
		}
		System.out.println("Enter the Brand Name");
		String brand = sc.nextLine();
		EarphoneUtil util = new EarphoneUtil();
		Stream<Earphone> search = util.getEarphonesByBrandName(arr.stream(), brand);
		List<Earphone> res1 = search.collect(Collectors.toList());
		if(res1.isEmpty()) {
			System.out.println("No earphones found for the brand "+brand);
		}else {
			System.out.println("Earphones by Brand "+brand+" are");
			for(Earphone er:res1) {
				System.out.println(er);
			}
		}
		System.out.println("Enter the min and max price range");
		double min = sc.nextDouble();
		double max = sc.nextDouble();
		List<Earphone> res2 = util.getEarphonesWithinPriceRange(arr.stream(), min, max);
		if(res2.isEmpty()) {
			System.out.println("No earphones found in this range");
		}else {
			System.out.println("Earphones within range");
			for(Earphone er:res2) {
				System.out.println(er);
			}
		}
		 
		sc.close();
	}

}

class Earphone{

	private String brandName;
	private LocalDate releaseDate;
	private double price;
	private double rating;
	Earphone(){
		
	}
	Earphone(String brandName,LocalDate releaseDate,double price,double rating){
		this.brandName = brandName;
		this.releaseDate = releaseDate;
		this.price = price;
		this.rating = rating;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	public LocalDate getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	@Override
	public String toString() {
		return "brandName=" + brandName + ", releaseDate=" + releaseDate + ", price=" + price;
	}	
}
class EarphoneUtil{
	public Stream<Earphone> getEarphonesByBrandName(Stream<Earphone> earphoneStream, String brandName){
		
		return earphoneStream
				.filter(e->e.getBrandName().equals(brandName));
		
	}
	
	public List<Earphone> getEarphonesWithinPriceRange(Stream<Earphone> earphoneStream, double minimumPrice, double maximumPrice){
		return earphoneStream
				.filter(e->e.getPrice()>=minimumPrice && e.getPrice()<=maximumPrice)
				.collect(Collectors.toList());
	}
}