package com.rajib.practice;

import java.util.List;

/**
 * Find the sum of squares of numbers in a list.
 */
public class StreamPractice5 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(8, 3, 5, 9);

        int result = numbers.stream()
                .map(i -> i * i)
                .reduce(0, Integer::sum);

        System.out.println("Sum of squares of numbers -> " + result);
    }
}
