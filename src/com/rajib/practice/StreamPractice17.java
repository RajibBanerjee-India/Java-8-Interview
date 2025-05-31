package com.rajib.practice;

import java.util.List;

/**
 * Remove duplicate integers from a list.
 */
public class StreamPractice17 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 2, 3, 4, 4, 5);

        List<Integer> distinctNumbers = numbers.stream()
                .distinct().toList();

        System.out.println("Distinct List --> " + distinctNumbers);
    }
}
