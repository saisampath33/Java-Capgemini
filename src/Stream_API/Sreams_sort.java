package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class Sreams_sort {
	public static void main(String[] args) {
		List<Integer> al = List.of(56,1,5,2,3,8,2,1,67);
		al.stream()
			.map(n->n*2)
			
			.forEach(n->System.out.print(n+" "));
		
		System.out.println();
		Set<Integer> st = al.stream().distinct().sorted((a,b)->b-a).collect(Collectors.toCollection(LinkedHashSet::new));
		System.out.println(st);
		
		Map<String,List<Integer>> map = 
				al.stream().collect(Collectors.groupingBy(
							n->n%2==0?"Even":"Odd"
						));
		
		System.out.println(map);
		System.out.println(map.get("Even"));
		
		Map<Boolean,List<Integer>> partition = 
				al.stream().collect(Collectors.partitioningBy(
							n->n>25
						));
		
		System.out.println(partition.get(true));
	}
}
