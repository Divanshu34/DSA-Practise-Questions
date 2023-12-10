package com.leetcode.easy;

public class LongestCommonPrefix {
    // String [] strs = new String[]{"dog","racecar","car"};
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String ans = "";
        if (n > 0) {
            ans = strs[0];
        } else {
            return ans;
        }
        int m = 0;
        for (int i = 1; i < n; i++) {
            m = Math.min(ans.length(), strs[i].length());
            String temp = "";
            for (int j = 0; j < m; j++) {
                System.out.println("j = " + j);
                if (ans.isEmpty()) {
                    return ans;
                }
                if (ans.charAt(j) == strs[i].charAt(j)) {
                    temp = temp + ans.charAt(j);
                } else
                    break;
            }
            ans = temp;
        }
        return ans;
    }

    public static void main(String... args) {
        String[] strs = new String[] { "dog", "racecar", "car" };
        System.out.println(longestCommonPrefix(strs));
    }
}
