package com.rajib.practice;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Given a list of lowercase strings, return the list of characters that appear in every string.
 */
public class StreamPractice20 {

    public static void main(String[] args) {

        List<String> words = List.of("bella", "label", "roller");

        List<Character> characters = words.stream()
                .map(word -> word.chars()
                        .mapToObj(c -> (char) c)
                        .collect(Collectors.groupingBy(c -> c, Collectors.counting())))
                .reduce((map1, map2) -> {
                    map1.keySet().retainAll(map2.keySet());
                    map1.replaceAll((k, v) -> Math.min(v, map2.get(k)));
                    return map1;
                })
                .orElse(Map.of()).entrySet().stream()
                .flatMap(entry -> Collections.nCopies(entry.getValue().intValue(), entry.getKey()).stream())
                .toList();

        System.out.println("Characters appeared in every string --> " + characters);
    }
}
