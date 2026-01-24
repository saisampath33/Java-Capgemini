package Stream_API;

import java.util.*;
import java.util.stream.Collectors;

public class stream {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		System.out.println(al);
		
		//stream()
		al.stream().forEach(System.out::println);
		
		List<String> names = Arrays.asList("Sampath","Vishnu","Varun"); //size is fixed we cannot add more elements in it 
		names.stream()
			.forEach(System.out::println);
		
		//count()
		long count = names.stream()
				.count();
		System.out.println(count);
		
		//filter()
		names.stream()
			.filter(s -> s.length()>5)
			.forEach(System.out::println);
		
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		numbers.stream()
			.filter(i -> i%2==0)
			.forEach(n->System.out.println(n));
		
		int[] arr = {1,2,3,4};
		Arrays.stream(arr)
			.forEach(System.out::println);
		
		//map()
		List<Integer> doubled = numbers.stream()
			.map(n -> n*2)
			.collect(Collectors.toList());
		System.out.println(doubled);
		
		List<String> uppercase = names.stream()
				.map(n->n.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(uppercase);
		
	}

}
