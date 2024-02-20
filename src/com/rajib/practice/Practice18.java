package com.rajib.practice;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Reverse each word of a string using Java 8 streams?
 */

public class Practice18 {

    public static void main(String[] args) {

        String str = "Java Concept Of The Day";

        String reverseStr = Arrays.stream(str.split(" "))
                .map(word -> new StringBuffer(word).reverse())
                .collect(Collectors.joining(" "));

        // Print
        System.out.println(reverseStr);
    }
}
