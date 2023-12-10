package com.hacker_rank.prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SubArrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        int n = s.size();
        int[] way = new int[m];
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n && j < i + m; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                count++;
                // break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> s = new ArrayList<>();
        Collections.addAll(s, 1, 2, 1, 3, 2);
        System.out.println(birthday(s, 3, 2));
    }
}
