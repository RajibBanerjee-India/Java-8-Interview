package com.rajib.practice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of strings, group them by anagram sets.
 */
public class StreamPractice10 {

    public static void main(String[] args) {

        List<String> words = List.of("listen", "silent", "enlist", "rat", "tar", "art");

        Map<String, List<String>> anagrams = words.stream()
                .collect(Collectors.groupingBy(
                        word -> word.chars()
                                .sorted()
                                .mapToObj(i -> String.valueOf((char) i))
                                .collect(Collectors.joining())
                    ));

        System.out.println("Anagrams --> " + anagrams);
    }
}
