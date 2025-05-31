package com.rajib.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Given "hello world", count the frequency of each character.
 */
public class StreamPractice18 {

    public static void main(String[] args) {

        String str = "hello world";
        Map<Character, Long> counters = str.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c != ' ')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Counter of each characters --> " + counters);
    }
}
