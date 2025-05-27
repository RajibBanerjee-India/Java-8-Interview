package com.rajib.ca.interview.cibc;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public static int solution(int U, int[] weight) {
        // Implement your solution here
        if (weight.length == 0) {
            return 0;
        }

        List<Integer> valid = new ArrayList<>();

        valid.add(weight[0]);

        for (int i = 1; i < weight.length; i++) {
            if (valid.size() == 1) {
                if ((valid.get(0) + weight[i]) <= U) {
                    valid.add(weight[i]);
                }
            }
            else if (valid.get(valid.size() - 1) + weight[i] <= U) {
                valid.add(weight[i]);
            }
        }

        return weight.length - valid.size();
    }

    public static void main(String[] args) {
        int[] numb = {7, 6, 5, 2, 7, 4, 5, 4};
        int res = solution(7, numb);
        System.out.println(res);
    }
}

