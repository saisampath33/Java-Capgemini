package Previous_M1;

import java.util.*;

public class CakeOrder_Collection_Maps {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CakeOrder co = new CakeOrder();
		System.out.println("Enter the number of cakes to be added: ");
		int n = sc.nextInt();
		sc.nextLine();//consume new line
		System.out.println("Enter the cake order details  (Order Id:CakeCost)");
		for(int i=0;i<n;i++) {
			String inp = sc.nextLine();
			String[] parts = inp.split(":");
			String orderId = parts[0];
			double cost  = Double.parseDouble(parts[1]);
			co.addOrderDetails(orderId, cost);
		}
		System.out.println("Enter the cost to search the cake orders");
		double searchcost = sc.nextDouble();
		Map<String,Double> filtered = co.findOrdersAboveSpecifiedCost(searchcost);
		if(filtered.isEmpty()) {
			System.out.println("No cake Orders found");
		}else {
			for(Map.Entry<String,Double> entry: filtered.entrySet()) {
				System.out.println("Order ID: "+entry.getKey()+", Cake Cost: "+entry.getValue());
			}
		}
		sc.close();
	}
}

class CakeOrder{
	private Map<String,Double> orderMap;
	public CakeOrder() {
        orderMap = new HashMap<>();
    }
	
	public void addOrderDetails(String orderId,double cakeCost) {
		orderMap.put(orderId, cakeCost);
	}
	public Map<String,Double> findOrdersAboveSpecifiedCost(double cakeCost){
		Map<String,Double> result = new HashMap<>();
		for(Map.Entry<String,Double> entry:orderMap.entrySet()) {
			if(entry.getValue()>cakeCost) {
				result.put(entry.getKey(),entry.getValue());
			}
		}
		return result;
	}
}
