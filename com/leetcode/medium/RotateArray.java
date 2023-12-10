package com.leetcode.medium;

import java.util.Arrays;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        if (k == n) {
            return;
        }

        k = (k > n) ? k % n : k;
        int[] numsCopy = Arrays.copyOfRange(nums, 0, n);
        if (k <= n / 2) {
            for (int i = 0; i < k; i++) {
                nums[k - i - 1] = nums[n - i - 1];
            }
            for (int i = k; i < n; i++) {
                nums[i] = numsCopy[i - k];
            }
            return;
        }
        int k1 = k;
        for (int i = 0; i < n - k; i++, k1++) {
            nums[k1] = nums[i];
        }
        for (int i = n - k; i < n; i++) {
            nums[i - n + k] = numsCopy[i];
        }

    }
}
