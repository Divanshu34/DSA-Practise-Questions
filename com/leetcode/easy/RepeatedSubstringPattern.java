package com.leetcode.easy;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        String doubleString = s + s;
        int len = doubleString.length() - 1;
        String check =  doubleString.substring(1, len);
        return check.contains(s);
    }

    public static void main(String ...args){
        String s = "babbabbabbabbab";
         System.out.println(repeatedSubstringPattern(s));
    }
}
