package com.rajib.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * How do you remove duplicate elements from a list using Java 8 streams?
 */

public class Practice2 {

    public static void main(String[] args) {

        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        // Stream.distinct() - Returns a stream consisting of the distinct elements (according to Object.equals(Object)) of this stream
        List<String> uniqueValueList = listOfStrings.stream().distinct().collect(Collectors.toList());

        // Print
        System.out.println(uniqueValueList);
    }
}
