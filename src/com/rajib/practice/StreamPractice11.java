package com.rajib.practice;

import java.util.Collection;
import java.util.List;

/**
 * Convert a list of lists into a single list.
 */
public class StreamPractice11 {

    public static void main(String[] args) {

        List<List<String>> nestedList = List.of( List.of("a", "b"),
                List.of("c", "d"),
                List.of("e", "f")
        );

        List<String> flatList = nestedList.stream()
                .flatMap(Collection::stream).toList();

        System.out.println("Single list --> " + flatList);
    }
}
