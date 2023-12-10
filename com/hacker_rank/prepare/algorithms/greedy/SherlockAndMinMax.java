package com.hacker_rank.prepare.algorithms.greedy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SherlockAndMinMax {
    public static int sherlockAndMinimax(List<Integer> arr, int p, int q) {
        Collections.sort(arr); // nlogn
        // int[] list = new int[2];
        // int minForP = Integer.MAX_VALUE;
        // int minForQ = Integer.MAX_VALUE;
        int lastEle = arr.get(arr.size() - 1);
        int firstEle = arr.get(0);
        int ans1 = 0;
        int prevMinVal = Integer.MIN_VALUE;     
        int ans = 0;
        // UpperBound
        for (int i = p; i <= q; i++) {
            int left = 0;
            int right = arr.size(); // Note: The right boundary is one past the last element
            int target = i;
            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr.get(mid) <= target) {
                    left = mid + 1; // Target is in the right half
                    ans1 = arr.get(mid);
                } else {
                    right = mid; // Target is in the left half
                }

            }
            int upperBoundValue = arr.get(left);
            int ans2 = 0;
            left = 0;
            right = arr.size();
            while (left < right) {
                int mid = left + (right - left) / 2;

                if (arr.get(mid) < target) {
                    left = mid + 1;
                    ans2 = arr.get(mid);
                } else {
                    right = mid; // Target is in the left half
                }
            }
            int lowerBoundValue = arr.get(left);
            int minVal = Math.min(ans1, Math.min(ans2, Math.min(lowerBoundValue, upperBoundValue)));

            if(minVal > prevMinVal) {
                ans = i;
            }
        }

        return ans;
    }

    public static int sherlockAndMinimax2(List<Integer> arr, int p, int q) {
        int[] array = new int[2];
        int[] bigArr = { 0, Integer.MIN_VALUE };
        for (int j = p; j <= q; j++) {
            for (int i = 0; i < arr.size(); i++) {
                array[1] = Integer.MAX_VALUE;
                if (Math.abs(arr.get(i) - j) < array[1]) {
                    array[1] = Math.abs(arr.get(i) - j);
                    array[0] = j;
                }
            }
            if (bigArr[1] < array[1]) {
                bigArr[0] = array[0];
                bigArr[1] = array[1];
            }

        }
        return bigArr[0];

    }

    public static int sherlockAndMinimax1(List<Integer> arr, int p, int q) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j = p; j <= q; j++) {
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < arr.size(); i++) {
                list.add(arr.get(i));
            }
            map.put(j, Collections.min(list));

        }
        return map.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue))
                .entrySet().stream()
                .max(Map.Entry.comparingByKey())
                .map(Map.Entry::getValue)
                .orElse(null)
                .stream()
                .min(Map.Entry.comparingByKey())
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        Collections.addAll(arr, 8, 5, 14);
        int p = 4;
        int q = 9;
        System.out.println(sherlockAndMinimax(arr, p, q));
    }
}
