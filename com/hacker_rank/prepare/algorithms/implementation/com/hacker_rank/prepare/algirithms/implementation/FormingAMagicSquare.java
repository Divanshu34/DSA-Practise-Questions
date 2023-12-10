package com.hacker_rank.prepare.algorithms.implementation.com.hacker_rank.prepare.algirithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FormingAMagicSquare {

    public static void main(String[] args) {
        List<List<Integer>> s = new ArrayList<>();
        List<Integer> s1 = new ArrayList<>();
        List<Integer> s2 = new ArrayList<>();
        List<Integer> s3 = new ArrayList<>();
        Collections.addAll(s1, 8, 3, 4);
        Collections.addAll(s2, 1, 5, 9);
        Collections.addAll(s3, 6, 7, 2);
        Collections.addAll(s, s1, s2, s3);
        System.out.println(formingMagicSquare(s));
    }

    public static int formingMagicSquare(List<List<Integer>> s) {

        if (s.size() != s.get(0).size()) {
            return 0;
        }

        int[] sumOfRows = new int[s.size()];
        int[] sumOfCols = new int[s.size()];
        int[] sumOfDiags = new int[2];
        int flag = 1;
        // int sum = 0;
        for (int i = 0; i < s.size(); i++) {
            sumOfDiags[0] += s.get(i).get(i);
            sumOfDiags[1] += s.get(s.size() - i - 1).get(i);
            // sum = sumOfDiags[0];
            for (int j = 0; j < s.size(); j++) {
                sumOfRows[i] += s.get(i).get(j);
                sumOfCols[i] += s.get(j).get(i);
            }
            if (i > 0 && i < s.size() && sumOfRows[i] != sumOfRows[i - 1]) {
                flag = 0;
                break;
            }
            if (i > 0 && i < s.size() && sumOfCols[i] != sumOfCols[i - 1]) {
                flag = 0;
                break;
            }
        }
        if (sumOfCols[0] == sumOfRows[0] && sumOfCols[0] == sumOfDiags[0] && sumOfDiags[0] == sumOfDiags[1]
                && flag == 1) {
            return flag;
        }
        return flag;
    }
}
