package com.rajib.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * How do you extract duplicate elements from an array?
 */

public class Practice25 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);

        Set<Integer> uniqueElement = new HashSet<>();

        Set<Integer> duplicateElement = listOfIntegers.stream()
                .filter(i -> !uniqueElement.add(i))
                .collect(Collectors.toSet());

        System.out.println(duplicateElement);
    }
}
