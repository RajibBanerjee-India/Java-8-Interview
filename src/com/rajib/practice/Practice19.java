package com.rajib.practice;

import java.util.stream.IntStream;

/**
 * How do you find sum of first 10 natural numbers?
 */

public class Practice19 {

    public static void main(String[] args) {

        // IntStream.range() - Returns a sequential ordered IntStream from startInclusive (inclusive) to
        // endExclusive (exclusive) by an incremental step of 1
        // Print
        System.out.println(IntStream.range(1, 11).sum());
    }
}
