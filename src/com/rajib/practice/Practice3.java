package com.rajib.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * How do you find frequency of each character in a string using Java 8 streams?
 */

public class Practice3 {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";

        // String.chars() - Returns a stream of int zero-extending the char values from this sequence.
        // Collectors.groupingBy() - Returns a Collector implementing the cascaded group-by operation
        // Collectors.counting() - Returns a Collector accepting elements of type T that counts the number of input elements
        // Function.identity() - Returns a function that always returns its input argument.
        Map<Character, Long> frequencyMap = inputString.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        // Print
        System.out.println(frequencyMap);
    }
}
