package Stream_API;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamIntermediateOperationsExample {
    public static void main(String[] args) {
        // List of lists of names
        List<List<String>> listOfLists = Arrays.asList(
            Arrays.asList("Reflection", "Collection", "Stream"),
            Arrays.asList("Structure", "State", "Flow"),
            Arrays.asList("Sorting", "Mapping", "Reduction", "Stream")
        );

        // Create a set to hold intermediate results
        Set<String> intermediateResults = new HashSet<>();

        // Stream pipeline demonstrating various intermediate operations
        List<String> result = listOfLists.stream()
            .flatMap(List::stream)  //Flattens multiple lists into one stream      
            .filter(s -> s.startsWith("S"))  //Keeps only strings that start with "S"     
            .map(String::toUpperCase)     //Transforms each string to uppercase     
            .distinct()                          
            .sorted()                            
            .peek(s -> intermediateResults.add(s))
            .collect(Collectors.toList());      

        // Print the intermediate results
        System.out.println("Intermediate Results:");
        intermediateResults.forEach(System.out::println);

        // Print the final result
        System.out.println();
        System.out.println("Final Result:");
        result.forEach(System.out::println);
    }
}