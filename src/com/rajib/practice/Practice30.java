package com.rajib.practice;

import java.util.stream.Stream;

/**
 * First 10 odd numbers
 */

public class Practice30 {

    public static void main(String[] args) {

        Stream.iterate(new int[]{1, 3}, n -> new int[]{n[1], n[1] + 2})
                .limit(10)
                .map(n -> n[0])
                .forEach(System.out::println);
    }
}
