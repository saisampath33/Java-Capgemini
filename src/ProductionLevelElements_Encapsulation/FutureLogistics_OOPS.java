package ProductionLevelElements_Encapsulation;
import java.util.*;
public class FutureLogistics_OOPS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		String inp = sc.nextLine();
		Utility u = new Utility();
		GoodsTransport gd = u.parseDetails("RTS113A:12/8/21:4:TimberTransport:13:4:NonPremium:200");
		if(u.validateTransportId(gd.transportId)) {
			gd.displayDetails();
		}else {
			System.out.println("Transport ID: "+gd.transportId+"is invalid");
		}
	}

}

abstract class GoodsTransport{
	protected String transportId;
	protected String transportDate;
	protected int transportRating;
	public GoodsTransport(String transportId,String transportDate,int transportRating){
		this.transportId = transportId;
		this.transportDate = transportDate;
		this.transportRating = transportRating;
	}
	abstract public String vehicleSelection();
	abstract public float calculateTotalCharge();
	abstract public void displayDetails();
	
	public String gettransportId() {
		return transportId;
	}
	public void setTransportId(String transportId) {
		this.transportId = transportId;
	}
	public String getTransportDate() {
		return transportDate;
	}
	public void setTransportDate(String transportDate) {
		this.transportDate = transportDate;
	}
	public int getTransportRating() {
		return transportRating;
	}
	public void setTransportRating(int transportRating) {
		this.transportRating = transportRating;
	}
}
class BrickTransport extends GoodsTransport{
	
	private float brickSize;
	private int brickQuantity;
	private float brickPrice;
	public BrickTransport(String transportId, String transportDate, int transportRating,float brickSize,int brickQuantity,float brickPrice) {
		super(transportId, transportDate, transportRating);
		this.brickSize = brickSize;
		this.brickQuantity = brickQuantity;
		this.brickPrice = brickPrice;
	}
	
	public float getBrickSize() {
		return brickSize;
	}

	public void setBrickSize(float brickSize) {
		this.brickSize = brickSize;
	}

	public int getBrickQuantity() {
		return brickQuantity;
	}

	public void setBrickQuantity(int brickQuantity) {
		this.brickQuantity = brickQuantity;
	}

	public float getBrickPrice() {
		return brickPrice;
	}

	public void setBrickPrice(float brickPrice) {
		this.brickPrice = brickPrice;
	}

	public String vehicleSelection() {
		if(brickQuantity<300) {
			return "Truck";
		}else if(brickQuantity >=300 && brickQuantity<=500) {
			return "Lorry";
		}
		return "MonsterLorry";
	}
	public float calculateTotalCharge(){
		float cost = 0;
		String vehicle = vehicleSelection();
		if(vehicle.equals("Truck")) {
			cost = 1000;
		}else if(vehicle.equals("Lorry")) {
			cost = 1700;
		}else {
			cost =3000;
		}
		float discount =0.0f;
		if(transportRating==5) {
			discount = 0.20f;
		}else if(transportRating>2 && transportRating<5) {
			discount = 0.10f;
		}
		float price = brickPrice * brickQuantity;
		float tax = price * 0.3f;
		float disc = price * discount;
		float total = (price+cost+tax)-disc;
		return total;
	}
	public void displayDetails() {
		System.out.println("Transporter id : " + transportId);
		System.out.println("Date of transport : " + transportDate);
		System.out.println("Rating of the transport : " + transportRating);
		System.out.println("Quantity of bricks : " + brickQuantity);
		System.out.println("Brick price : " + brickPrice);
		System.out.println("Vehicle for transport : " + vehicleSelection());
		System.out.println("Total charge : " + calculateTotalCharge());
	}
	
}
class TimberTransport extends GoodsTransport{
	private float timberLength;
	private float timberRadius;
	private String timberType;
	private float timberPrice;
	public float getTimberLength() {
		return timberLength;
	}
	public void setTimberLength(float timberLength) {
		this.timberLength = timberLength;
	}
	public float getTimberRadius() {
		return timberRadius;
	}
	public void setTimberRadius(float timberRadius) {
		this.timberRadius = timberRadius;
	}
	public String getTimberType() {
		return timberType;
	}
	public void setTimberType(String timberType) {
		this.timberType = timberType;
	}
	public float getTimberPrice() {
		return timberPrice;
	}
	public void setTimberPrice(float timberPrice) {
		this.timberPrice = timberPrice;
	}
	public TimberTransport(String transportId,String transportDate,int transportRating,float timberLength,float timberRadius,String timberType,float timberPrice){
		super(transportId,transportDate,transportRating);
		this.timberLength = timberLength;
		this.timberRadius = timberRadius;
		this.timberType = timberType;
		this.timberPrice = timberPrice;		
	}
	public String vehicleSelection() {
		float area = 2*3.147f*timberRadius*timberLength;
		if(area<250) {
			return "Truck";
		}else if(area>=250 && area<=400) {
			return "Lorry";
		}
		return "MonsterLorry";
	}
	public float calculateTotalCharge() {
		int cost =0;
		String vehicle = vehicleSelection();
		if(vehicle.equals("Truck")) {
			cost = 1000;
		}else if(vehicle.equals("Lorry")) {
			cost = 1700;
		}else {
			cost =3000;
		}
		float discount =0.0f;
		if(transportRating==5) {
			discount = 0.20f;
		}else if(transportRating>2 && transportRating<5) {
			discount = 0.10f;
		}
		float volume = 3.147f*timberRadius*timberRadius*timberLength;
		float timberRate = 0.0f;
		if(timberType.equalsIgnoreCase("Premium")) {
			timberRate = 0.25f;
		}else {
			timberRate = 0.15f;
		}
		float price = volume * timberPrice * timberRate;
		float tax = price*0.3f;
		float disc = price*discount;
		float total = (price+cost+tax)-disc;
		return total;
	}
	public void displayDetails() {
		System.out.println("Transporter id : " + transportId);
		System.out.println("Date of transport : " + transportDate);
		System.out.println("Rating of the transport : " + transportRating);
		System.out.println("Type of the timber : " + timberType);
		System.out.println("Timber price per kilo : " + timberPrice);
		System.out.println("Vehicle for transport : " + vehicleSelection());
		System.out.println("Total charge : " + calculateTotalCharge());
	}
}
class Utility{
	
	public GoodsTransport parseDetails(String input) {
		String[] details = input.split(":");
		String transportId = details[0];
		String transportDate = details[1];
		int transportRating = Integer.parseInt(details[2]);
		String transportType = details[3];
		if(transportType.equalsIgnoreCase("BrickTransport")) {
			float brickSize = Float.parseFloat(details[4]);
			int brickQuantity = Integer.parseInt(details[5]);
			float brickPrice = Float.parseFloat(details[6]);
			return new BrickTransport(transportId,transportDate,transportRating,brickSize,brickQuantity,brickPrice);
		}
		float timberLength =Float.parseFloat(details[4]);
		float timberRadius = Float.parseFloat(details[5]);
		String timberType = details[6];
		float timberPrice = Float.parseFloat(details[7]);
		return new TimberTransport(transportId,transportDate,transportRating,timberLength,timberRadius,timberType,timberPrice);
	}
	public String findObjectType(GoodsTransport goodsTransport) {
		String objtype="";
		if(goodsTransport instanceof BrickTransport) {
			objtype = "BrickTransport";
		}
		objtype = "TimberTransport";
		return objtype;
	}
 	public boolean validateTransportId (String transportId) {
 		return transportId.matches("RTS\\d{3}[A-Z]");
 	}
}

