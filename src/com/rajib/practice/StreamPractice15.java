package com.rajib.practice;

import java.util.List;
import java.util.Map;

/**
 * Flatten a Map<String, List<List<Integer>>> into a List<Integer>.
 */
public class StreamPractice15 {

    public static void main(String[] args) {

        Map<String, List<List<Integer>>> map = Map.of( "a", List.of(List.of(1, 2), List.of(3)),
                "b", List.of(List.of(4), List.of(5, 6))
        );

        List<Integer> numbers = map.values().stream()
                .flatMap(List::stream)
                .flatMap(List::stream)
                .toList();

        System.out.println("List of Integer --> " + numbers);
    }
}
