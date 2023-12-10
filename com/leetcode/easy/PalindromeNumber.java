package com.leetcode.easy;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        int n = s.length();
        int start = 0;
        int end = n-1;
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
    }

    public boolean isPalindromeEfficient(int x) {
        if (x < 0 || (x != 0 && x % 10 == 0)) {
            return false;
        }
        int reverse = 0;
        int newx = x;

        while (newx > reverse) {
            reverse = reverse * 10 + newx % 10;
            newx = newx / 10;
        }

        return ((newx == reverse) || (newx == reverse / 10));
    }
}
