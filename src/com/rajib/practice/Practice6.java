package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
 */

public class Practice6 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");

        // Collectors.joining() - Returns a Collector that concatenates the input elements, separated by the specified
        // delimiter, with the specified prefix and suffix, in encounter order.
        String joinedString = listOfStrings.stream().collect(Collectors.joining(", ", "[", "]"));

        // Print
        System.out.println(joinedString);
    }
}
