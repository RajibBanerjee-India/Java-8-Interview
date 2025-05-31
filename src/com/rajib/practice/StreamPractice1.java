package com.rajib.practice;

import java.util.List;

/**
 * Given a list of integers, return a list of only even numbers
 */
public class StreamPractice1 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(9, 4, 2, 8, 10, 5, 16, 46);

        List<Integer> evenNumbers = numbers.stream()
                .filter(i -> i % 2 == 0)
                .toList();

        System.out.println("Even Numbers --> " + evenNumbers);
    }
}
