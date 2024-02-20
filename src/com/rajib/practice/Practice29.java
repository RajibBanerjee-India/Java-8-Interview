package com.rajib.practice;

import java.util.stream.Stream;

/**
 * Fibonacci series
 */

public class Practice29 {

    public static void main(String[] args) {

        Stream.iterate(new int[]{0, 1}, n -> new int[]{n[1], n[1] + n[0]})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);
    }
}
