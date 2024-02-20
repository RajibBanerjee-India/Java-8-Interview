package com.rajib.practice;

import java.util.stream.IntStream;

/**
 * Print first 10 even numbers
 */
public class Practice21 {

    public static void main(String[] args) {

        // Print
        IntStream.rangeClosed(1, 10).map(i -> i * 2).forEach(System.out::println);
    }
}
