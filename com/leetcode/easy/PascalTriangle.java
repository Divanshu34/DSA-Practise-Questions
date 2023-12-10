package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>(numRows);

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>(i + 1);
            row.add(1);
            for (int j = 1; j < i; j++) {
                int prevRowSize = list.get(i - 1).size();
                int sum = list.get(i - 1).get(j - 1) + (j < prevRowSize ? list.get(i - 1).get(j) : 0);
                row.add(sum);
            }

            if (i > 0) {
                row.add(1);
            }

            list.add(row);
        }

        return list;
    }
}
