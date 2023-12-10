package com.leetcode.easy;

public class NeedleInHaystack {
    public int strStr(String haystack, String needle) {
        StringBuilder str = new StringBuilder();
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i + j >= n)
                    return -1;
                str.append(haystack.charAt(i + j));
            }
            if (str.toString().equals(needle)) {
                return i;
            }
            str = new StringBuilder();
        }
        
        return -1;
    }
}
