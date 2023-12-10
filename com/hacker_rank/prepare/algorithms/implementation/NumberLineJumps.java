package com.hacker_rank.prepare.algorithms.implementation;

public class NumberLineJumps {

    public static String isFactor(int n1, int n2) {
        int i = 1;
        int temp = n1;
        while (temp <= n2) {
            temp = n1 * i;
            if (temp == n2)
                return "YES";
            i++;
        }
        return "NO";
    }

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        return isFactor(x1 + v1, x2 + v2);
    }

    public static void main(String[] args) {
        // System.out.println(isFactor(1,4));
        System.out.println(kangaroo(0, 4, 4, 2));
    }
}
