package com.rajib.practice;

import java.util.List;

/**
 * Count how many strings start with "A".
 */
public class StreamPractice9 {

    public static void main(String[] args) {

        List<String> names = List.of("Alice", "Arnold", "Bob", "Charlie", "Andrew");

        long count = names.stream()
                .filter(name -> name.startsWith("A"))
                .count();

        System.out.println("Count strings starts with 'A' --> " + count);
    }
}
