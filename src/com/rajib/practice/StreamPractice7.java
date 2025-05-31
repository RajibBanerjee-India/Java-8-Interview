package com.rajib.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Group words by their length.
 */
public class StreamPractice7 {

    public static void main(String[] args) {

        List<String> words = List.of("one", "two", "three", "four", "five");

        Map<Integer, List<String>> groupedByLength = words.stream()
                .collect(Collectors.groupingBy(String::length));

        System.out.println("Grouped by length String --> " + groupedByLength);
    }
}
