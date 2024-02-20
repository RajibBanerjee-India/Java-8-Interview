package com.rajib.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * How do you get three maximum numbers and three minimum numbers from the given list of integers?
 */

public class Practice11 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // Print
        System.out.println("-------------");
        System.out.println("Minimum 3 numbers - ");
        listOfIntegers.stream().sorted().limit(3).forEach(System.out::println);

        System.out.println("-------------");
        System.out.println("Maximum 3 numbers - ");
        listOfIntegers.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
    }
}
