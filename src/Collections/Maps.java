package Collections;

import java.util.HashMap;

public class Maps {

	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put(1, "Sampath");
		map.put(16, "Varun");
		map.put(34, "Manikanta");
		map.put(32, "Roa");
		map.put(18, "Vishnu");
		map.putIfAbsent(18, null);
		
		System.out.println(map);
		
		System.out.println(map.keySet()); //Gives only keys
		
		System.out.println(map.values()); //gives only values
		
		for(Object o : map.entrySet()) {
			System.out.println(o);
		}
		
		for(Object o : map.keySet()) {
			System.out.print(o+" ");
		}
	}

}
