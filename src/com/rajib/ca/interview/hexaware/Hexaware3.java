package com.rajib.ca.interview.hexaware;

/**
 * Given a string representation of frogs and stones, count the number of frogs between specified stone indices.
 *
 * Sample Input for Custom Testing
 * Sample Case 0
 * *|*|  → s = ” *|*| ”
 * 1 → startindex[] size=1
 * 1 → startindex= 1
 * 1 → endindex[] size=1
 * 3 → endindex=3
 * Sample output: 0
 * Explanation: The substring from index =1 to index=3 is “*|*”. there is no consecutive pair of bars in this string.
 */
public class Hexaware3 {

    public static void main(String[] args) {

        String pond = "SFSFSFFSSFFS";
        int start = 2;
        int end = 7;

        long frogCount = countFrogsBetweenStones(pond, start, end);
        System.out.println("Frogs between stones: " + frogCount);  // Output: 4
    }

    private static long countFrogsBetweenStones(String pond,
                                                int start,
                                                int end) {

        if (pond == null || start < 0 || end >= pond.length() || start > end)
            return 0;

        return pond.substring(start, end + 1)
                .chars()
                .filter(c -> c == 'F')
                .count();
    }
}
