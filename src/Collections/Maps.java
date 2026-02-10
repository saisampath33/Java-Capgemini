package Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		HashMap<Integer,String> map = new HashMap<>();
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
		Map<String,Integer> mpp = new HashMap<>();
		ArrayList<String> arr = new ArrayList<>(Arrays.asList("sai","sai","sam","varun","vishnu"));
		for(String ar:arr) {
			mpp.put(ar,mpp.getOrDefault(ar, 0)+1);
		}
		for(Map.Entry<String,Integer> entry: mpp.entrySet()) {
			System.out.println("key-> "+entry.getKey()+" Value-> "+entry.getValue());
		}
	}

}
