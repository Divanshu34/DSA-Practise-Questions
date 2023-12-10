package com.hacker_rank.prepare.interveiw_preparation_kit.one_week_prep_kit.day_1;

import java.util.List;

public class MinMaxSum {
    public static long maxEle(List<Integer> arr, int n) {
        long max = arr.get(0);
        for (int i = 1; i < n; i++) {
            if (arr.get(i) > max) {
                max = arr.get(i);
            }
        }
        return max;
    }

    public static long minEle(List<Integer> arr, int n) {
        long min = arr.get(0);
        for (int i = 1; i < n; i++) {
            if (arr.get(i) < min) {
                min = arr.get(i);
            }
        }
        return min;
    }

    public static void miniMaxSum(List<Integer> arr) {
        int n = arr.size();
        long min = minEle(arr, n);
        long max = maxEle(arr, n);
        long maxSum = 0;
        long minSum = 0;
        int count = 0;
        for (int j = 0; j < n; j++) {
            long i = arr.get(j);
            if (i != max) {
                minSum += i;
            }
            if (i != min) {
                maxSum += i;
            }
            if (j + 1 < n && arr.get(j) == arr.get(j + 1)) {
                count++;
            }
        }
        if (count == n - 1) {
            minSum = arr.get(0) * (n - 1);
            maxSum = minSum;
        }
        // System.out.println(count);
        System.out.println(minSum + " " + maxSum);
    }

    public static void miniMaxSum1(List<Integer> arr) {
        int n = arr.size();
        long min = Integer.MAX_VALUE;
        long max = Integer.MIN_VALUE;
        long sum = 0;
        for(int i : arr){
            sum += i;
            max = Math.max(max, i);
            min = Math.min(min, i);
        }
        long sumMax = sum - min;
        long sumMin = sum - max;
        System.out.println(sumMin+" "+sumMax);
    }
}
