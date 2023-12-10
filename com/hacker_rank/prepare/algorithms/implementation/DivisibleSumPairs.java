package com.hacker_rank.prepare.algorithms.implementation;

import java.util.List;

public class DivisibleSumPairs {
    public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
        // int n = ar.size();
        int count = 0;
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < j; i++) {
                if ((ar.get(j) + ar.get(i)) % k == 0) {
                    count++;
                }
            }
        }
        return count;

    }   
}
