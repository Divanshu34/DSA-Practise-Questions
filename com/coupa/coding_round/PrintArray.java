package com.coupa.coding_round;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class PrintArray {
    public static int[] arrayC(int m, int[] a, int[] b) {
        int n = a.length;
        int[] c = new int[m];

        TreeSet<Integer> set = new TreeSet<>();

        List<Integer> aEven = new ArrayList<>();
        List<Integer> bOdd = new ArrayList<>();

        List<Integer> bEven = new ArrayList<>();
        List<Integer> aOdd = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] % 2 == 0) {
                aEven.add(a[i]);
            } else {
                aOdd.add(a[i]);
            }

            if (b[i] % 2 == 0) {
                bEven.add(b[i]);
            } else {
                bOdd.add(b[i]);
            }
        }

        int aEvenN = aEven.size();
        int bOddN = bOdd.size();

        int aOddN = aOdd.size();
        int bEvenN = bEven.size();

        for (int i = 0; i < Math.min(aOddN, bEvenN); i++) {
            for (int j = 0; j < Math.max(aOddN, bEvenN); j++) {
                set.add(aOdd.get(j) + bEven.get(i));
            }
        }

        for (int i = 0; i < Math.min(bOddN, aEvenN); i++) {
            for (int j = 0; j < Math.max(bOddN, aEvenN); j++) {
                set.add(aEven.get(i) + bOdd.get(j));
            }
        }
        c = set.stream().limit(m).mapToInt(Integer::intValue).toArray();
        return c;
    }

    public static void main(String[] args) {
        int m = 3;
        int[] a = new int[] { 1, 2, 3, 4, 5, 6 };
        int[] b = new int[] { 5, 6, 7, 8, 9, 10 };
        int[] c = arrayC(m, a, b);
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
