package Collections;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		HashSet<Integer> hs = new HashSet<>();
		hs.add(12);
		hs.add(16);
		hs.add(18);
		hs.add(32);
		hs.add(null);
		System.out.println(hs);
		System.out.println(hs.contains(16));
		for(Object o:hs) {
			System.out.println(o);
		}
		
	}

}
