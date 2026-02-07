package Stream_API;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream_Practice {

	public static void main(String[] args) {
		List<Integer> al = List.of(1,12,2,3,4,5,0,6);
//		al.stream()
////			.forEach(n->System.out.print(n+" "))
//			.forEach(System.out::println);
		System.out.println("Operations on ArrayList");
		al.stream()
			.filter(n->n%2==0)  //filter even numbers
			.map(n->n*2)			//multply 2 for that filter memebres
			.sorted()
			.forEach(System.out::println);//display
		
		System.out.println("Operations on normal array");
		
		int[] arr = {1,3,11,12,5,6,9,8,3,9,11,11,11,11};
		
		Arrays.stream(arr) //This is for arrays
			.distinct() //only gives distinct
			.sorted() //distinct values are now sorted its like a chain
			.skip(4)  //skips these many members from top
			.limit(1) //only limit of members will print after skip
			.forEach(System.out::println);
		
		List<List<Integer>> nestedarr = List.of(
				List.of(1,6,2,3),List.of(4,5,6)
				);
		System.out.println("Nested arr: "+nestedarr);
		System.out.println("Operations on nested arr ");
		nestedarr.stream()
			.flatMap(n->n.stream()) // Convert multiple streams into one stream
			//.sorted((a,b)->b-a)		//Custom sorting which is descending order
			.sorted(Comparator.reverseOrder())
			.limit(4)                //Only this much limit prints
			.forEach(System.out::println);
		
		System.out.println("Using Streams ");
		Stream.iterate(1, n -> n + 1)
	      .limit(5)
	      .forEach(System.out::println);
		
		List<Integer> list = List.of(10,1,12,2,3,4,5,6);
		List<Integer> result = list.stream().filter(n->n%2!=0).collect(Collectors.toList()); //storing in a list for further use using collectors
		System.out.println("Odd elements: "+result);
		
		
		int sum = result.stream().reduce(0,(a,b)->a+b); //Combine all elements into single value
		int sum1 = result.stream()
	              .collect(Collectors.summingInt(Integer::intValue));
		double avg = result.stream().mapToInt(Integer::intValue).average().orElse(0);
		double avg1 =
			    result.stream().collect(Collectors.averagingInt(Integer::intValue));

		long count = result.stream().count();
		System.out.println("Count: "+count);
		System.out.println("Sum: "+sum1);
		System.out.println("Average: "+avg1);
		
		Optional<Integer> min = result.stream().min(Integer::compare);
		System.out.println("Min: "+min);
		Optional<Integer> max = result.stream().max(Integer::compare);
		System.out.println("Max: "+max);
		
		boolean isanymatch = result.stream().anyMatch(n -> n > 10);
		boolean isallmatch = list.stream().allMatch(n -> n > 0);
		boolean isnonematch = list.stream().noneMatch(n -> n < 0);
		System.out.println("Any Match: "+isanymatch);
		System.out.println("All Match: "+isallmatch);
		System.out.println("None Match: "+isnonematch);
		
		int a = list.stream().findFirst().orElse(0);
		int b = list.stream().findAny().orElse(0);
		System.out.println("Find First: "+a);
		System.out.println("Find Any: "+b);

		
		Optional<Integer> opt = list.stream().findFirst();

		opt.ifPresent(System.out::println);
		opt.orElse(0);
		opt.orElseThrow(); //Throws error if no elements present in list

		
	}

}
//diff between streams vs Streams peek and maptoInt and maptodouble and Collectors and toarray() and Optional and findany
