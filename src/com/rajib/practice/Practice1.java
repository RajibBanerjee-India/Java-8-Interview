package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of integers, separate odd and even numbers?
 */

public class Practice1 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        // Collectors.partitioningBy() - Returns a Collector which partitions the input elements according to a Predicate,
        // and organizes them into a Map<Boolean, List<T>>.
        Map<Boolean, List<Integer>> oddEvenMap = listOfIntegers
                .stream()
                .collect(Collectors.partitioningBy(i -> i % 2 == 0));

        // Print
        oddEvenMap.forEach((key, value) -> {
            System.out.println("-----------");
            if (key) {
                System.out.println("Even Numbers");
            } else {
                System.out.println("Odd Numbers");
            }

            System.out.println("-----------");
            value.forEach(System.out::println);
        });
    }
}
