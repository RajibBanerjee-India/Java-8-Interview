package com.rajib.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find first non-repeated character in a string
 */
public class Practice28 {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        Map<String, Long> countMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        countMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
