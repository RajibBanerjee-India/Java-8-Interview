package com.rajib.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

/**
 * Find second-largest number in an integer array?
 */

public class Practice14 {

    public static void main(String[] args) {

        List<Integer> listOfIntegers = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        // Stream.skip(n) - Returns a stream consisting of the remaining elements of this stream
        // after discarding the first n elements of the stream
        Optional<Integer> result = listOfIntegers.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();

        // Print
        result.ifPresent(System.out::println);
    }
}
