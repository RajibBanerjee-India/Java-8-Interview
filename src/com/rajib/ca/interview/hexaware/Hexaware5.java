package com.rajib.ca.interview.hexaware;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Given a string representation of apples and baskets, count the number of apples between specified basket indices.
 * The string consists of 'A' (apple) and 'B' (basket).
 *
 *
 */
public class Hexaware5 {

    public static void main(String[] args) {
        String s = "ABABAABAB";
        int[] starts = {0, 2, 4};
        int[] ends = {4, 6, 8};

        int[] counts = countApplesBetweenBaskets(s, starts, ends);
        System.out.println(Arrays.toString(counts)); // Output: [2, 1, 1]
    }

    public static int[] countApplesBetweenBaskets(String s, int[] starts, int[] ends) {
        // Preprocess prefix sum
        int[] prefix = new int[s.length() + 1];
        for (int i = 0; i < s.length(); i++) {
            prefix[i + 1] = prefix[i] + (s.charAt(i) == 'A' ? 1 : 0);
        }

        return IntStream.range(0, starts.length)
                .map(i -> {
                    int start = starts[i];
                    int end = ends[i];
                    if (start < 0 || end >= s.length() || start > end ||
                            s.charAt(start) != 'B' || s.charAt(end) != 'B') {
                        return 0;
                    }
                    return prefix[end] - prefix[start + 1];
                })
                .toArray();
    }
}
