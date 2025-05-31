package com.rajib.practice;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given a list of strings, find the element that occurs most frequently.
 */
public class StreamPractice19 {

    public static void main(String[] args) {

        List<String> input = List.of("apple", "banana", "apple", "orange", "banana", "apple");

        String mostOccurred = input.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey).orElse(null);

        System.out.println("Most Occurred Word -> " + mostOccurred);
    }
}
