package com.rajib.practice;

import java.util.Arrays;
import java.util.OptionalDouble;

/**
 * Given an integer array, find sum and average of all elements?
 */

public class Practice16 {

    public static void main(String[] args) {

        int[] a = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        // Print
        System.out.println("Sum - " + Arrays.stream(a).sum());

        OptionalDouble average = Arrays.stream(a).average();
        // Print
        average.ifPresent(d -> System.out.println("Average - " + d));
    }
}
