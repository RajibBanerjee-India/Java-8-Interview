package com.rajib.ca.interview.hexaware;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Frogs are sitting on the x-axis of the plane. The x-axis is represented by a given string. * represents a frog and | represents a stone.
 * The string consists of only the above-mentioned characters. You are given a start index array and end index array, and calculate the number of frogs between the two stones including the endpoint.
 * Note – Array is 1 indexed
 *
 * Example:
 *  s = ” |**|*| ”
 * start Index = [ 1, 1 ]
 * end Index = [ 5, 6 ]
 * For the first pair of indices (1,5), the substrings are “|**|*”. There are 2 stars between a pair of bars. For the second pair of indices (1,6), the substring is  “|**|*|” and there are 2+1=3 stars in between the bars. Both of the answers are returned to the array [2,3].
 *
 * Constraints
 *
 * 1 <= n <= 105
 * 1 <= Start Index[i] <= end Index[i]
 * Each Character of s is either  ” * ”  or  ” | “
 */
public class Hexaware4 {

    public static void main(String[] args) {

        String axis = "|**|*|*||**|";
        int[] starts = {1, 3, 5};
        int[] ends = {6, 8, 10};

        int results = countFrogsBetweenStones(axis, starts, ends);
        System.out.println(results);
    }

    public static int countFrogsBetweenStones(String axis, int[] starts, int[] ends) {
        // Pre-process the axis to create prefix sum array of frogs
        int[] prefixSum = new int[axis.length() + 1];
        for (int i = 0; i < axis.length(); i++) {
            prefixSum[i + 1] = prefixSum[i] + (axis.charAt(i) == '*' ? 1 : 0);
        }

        // Validate input arrays have same length
        if (starts.length != ends.length) {
            throw new IllegalArgumentException("Start and end arrays must have equal length");
        }

        return IntStream.range(0, starts.length)
                .map(i -> {
                    int start = starts[i];
                    int end = ends[i];
                    // Validate indices
                    if (start < 0 || end >= axis.length() || start > end) {
                        return 0;
                    }
                    return prefixSum[end + 1] - prefixSum[start];
                })
                .toArray().length;
    }
}
