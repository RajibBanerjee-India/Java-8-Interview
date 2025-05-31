package com.rajib.practice;

import java.util.List;

/**
 * From a list, find all pairs that sum to a given number (e.g., 10).
 */
public class StreamPractice2 {

    public static void main(String[] args) {
        int target = 10;
        List<Integer> numbers = List.of(8, 3, 6, 5, 4, 2);

        List<List<Integer>> pairs = numbers.stream()
                .flatMap(i -> numbers.stream()
                        .filter(j -> i < j && i + j == target)
                        .map(j -> List.of(i, j)))
                .toList();

        System.out.println("Pairs those makes 10 --> " + pairs);
    }
}
