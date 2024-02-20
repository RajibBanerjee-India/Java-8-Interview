package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Given a list of integers, find maximum and minimum of those numbers?
 */

public class Practice8 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        Optional<Integer> max = listOfIntegers.stream().reduce(Integer::max);
        Optional<Integer> min = listOfIntegers.stream().reduce(Integer::min);

        // Print
        max.ifPresent(integer -> System.out.println("Maximum Element : " + integer));
        min.ifPresent(integer -> System.out.println("Minimum Element : " + integer));
    }
}
