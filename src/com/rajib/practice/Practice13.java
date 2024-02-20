package com.rajib.practice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Find sum of all digits of a number in Java 8
 */

public class Practice13 {

    public static void main(String[] args) {

        int i = 15623;

        // Collectors.summingInt() - Returns a Collector that produces the sum of an integer-valued function applied
        // to the input elements. If no elements are present, the result is 0.
        Integer result = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

        // Print
        System.out.println(result);
    }
}
