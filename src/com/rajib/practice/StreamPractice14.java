package com.rajib.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * From a list of integers, find the duplicate numbers and how many times they occur
 */
public class StreamPractice14 {

    public static void main(String[] args) {

        List<Integer> nums = List.of(1, 4, 3, 2, 3, 4, 5, 4);

        Map<Integer, Long> duplicateNumbers = nums.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

        System.out.println("Duplicate Numbers --> " + duplicateNumbers);
    }
}
