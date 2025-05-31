package com.rajib.practice;

import java.util.List;

/**
 * Find the first string that starts with letter "C".
 */
public class StreamPractice4 {

    public static void main(String[] args) {
        List<String> names = List.of("Raj", "Raja", "Charlie", "Rajib");

        names.stream()
                .filter(n -> n.startsWith("C"))
                .findFirst()
                .ifPresent(System.out::println);
    }
}
