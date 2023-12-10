package com.hacker_rank.prepare.interveiw_preparation_kit.one_week_prep_kit.day_1;

import java.util.List;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        int n = arr.size();
        double countPos = 0;
        double countNeg = 0;
        double countZero = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > 0) {
                countPos++;
            } else if (arr.get(i) < 0) {
                countNeg++;
            } else {
                countZero++;
            }
        }
        System.out.println(countPos / n + "\n" + countNeg / n + "\n" + countZero / n);

    }
}
