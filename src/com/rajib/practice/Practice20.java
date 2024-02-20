package com.rajib.practice;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Reverse an integer array
 */
public class Practice20 {

    public static void main(String[] args) {

        int[] array = new int[]{5, 1, 7, 3, 9, 6};

        // IntStream.rangeClosed() - Returns a sequential ordered IntStream from startInclusive (inclusive) to
        // endInclusive (inclusive) by an incremental step of 1.
        int[] reverseArray = IntStream.rangeClosed(1, array.length).map(i -> array[array.length - i]).toArray();

        // Print
        System.out.println(Arrays.toString(reverseArray));
    }
}
