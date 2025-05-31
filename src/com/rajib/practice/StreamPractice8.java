package com.rajib.practice;

import java.util.List;

/**
 * Find the maximum number in a list.
 */
public class StreamPractice8 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(10, 20, 5, 80, 30);

        numbers.stream()
                .max(Integer::compare)
                .ifPresent(System.out::println);
    }
}
