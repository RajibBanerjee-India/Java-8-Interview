package com.rajib.practice;

import java.util.List;

/**
 * Given a list of integers, return a list of strings "even" or "odd" depending on whether the number is even or odd.
 */
public class StreamPractice12 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<String> evenOdd = numbers.stream()
                .map(i -> i % 2 == 0 ? "even" : "odd")
                .toList();

        System.out.println("Even Odd List -> " + evenOdd);
    }
}
