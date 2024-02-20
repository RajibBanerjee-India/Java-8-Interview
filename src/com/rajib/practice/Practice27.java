package com.rajib.practice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Find first repeated character in a string?
 */
public class Practice27 {

    public static void main(String[] args) {

        String inputString = "Java Concept Of The Day";
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        Map<String, Long> charCountMap = Arrays.stream(inputString.split(""))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

        charCountMap.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
