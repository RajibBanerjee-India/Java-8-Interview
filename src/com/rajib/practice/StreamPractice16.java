package com.rajib.practice;

import java.util.List;

/**
 * Return the common elements between two lists using streams.
 */
public class StreamPractice16 {

    public static void main(String[] args) {

        List<Integer> numberSet1 = List.of(5, 8, 10, 3, 9, 12, 78);
        List<Integer> numberSet2 = List.of(67, 78, 10, 2, 4, 8, 13);

        List<Integer> commonElements = numberSet1.stream()
                .filter(numberSet2::contains)
                .toList();

        System.out.println("Common Elements --> " + commonElements);
    }
}
