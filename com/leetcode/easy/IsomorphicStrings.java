package com.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public Map<Character, Integer> getFrequencyMap(String str) {
        char[] arr = str.toCharArray();
        int n = arr.length;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }

    //Failed for few cases -> s = "bbbaaaba" & t = "aaabbbba"
    public boolean isIsomorphic1(String s, String t) {
        Map<Character, Integer> s1 = getFrequencyMap(s);
        Map<Character, Integer> t1 = getFrequencyMap(t);
        Integer[] valS1 = s1.values().toArray(new Integer[0]);
        Integer[] valT1 = t1.values().toArray(new Integer[0]);
        return Arrays.equals(valS1, valT1);
    }

    public boolean isIsomorphic(String s, String t) {
        int n = s.length();
        int[] a = new int[127];
        int[] b = new int[127];
        for (int i = 0; i < n; i++) {
            char si = s.charAt(i);
            char ti = t.charAt(i);
            if (a[si] != b[ti]) {
                return false;
            }
            a[si] = i + 1;
            b[ti] = i + 1;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = new int[500];
        // a["ab"] = 24;
    }
}
