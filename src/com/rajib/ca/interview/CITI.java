package com.rajib.ca.interview;

import java.util.*;
import java.util.stream.Collectors;

/**
 * List of Integer, write a code to return the duplicates from the list.
 * Example, List → [2, 3, 9, 2, 5, 3], returns → [2, 3]
 */
public class CITI {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 3, 9, 2, 5, 3, 2, 10, 23, 3);

        Set<Integer> duplicates = numbers.stream()
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                .entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("Duplicates - " + duplicates);
    }
}
