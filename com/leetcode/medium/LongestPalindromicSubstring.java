package com.leetcode.medium;

public class LongestPalindromicSubstring {

    public static boolean isPalindrome(String s) {
        if (s.length() == 1)
            return true;
        boolean flag = false;
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                flag = true;
            } else
                return false;
        }
        return flag;
    }

    public static String longestPalindrome(String s) {
        // int i = 0;
        for (int diff = s.length(); diff > 0; diff--) {
            for (int i = 0; i < s.length(); i++) {
                int lastIndex = i + diff;
                if (lastIndex <= s.length() && lastIndex - i == diff) {
                    String str = s.substring(i, lastIndex);
                    if (isPalindrome(str))
                        return str;
                } else {
                    break;
                }
            }
        }
        return s.substring(0);
    }

    public String helper(String s, int start, int end) {
        int n = s.length();
       while(start >= 0 && end < n){
           if(s.charAt(start) == s.charAt(end)){
               start--;
               end++;
           } else {
               break;
           }
       }
       return s.substring(start+1, end);
   }

   public String longestPalindrome1(String s) {
       int length = 0;
       String ans = "";
       int n = s.length();
       for(int i = 0; i < n; i++){
           String current = helper(s, i, i);
           if(current.length() > length){
               ans = current;
               length = current.length();
           }

           current = helper(s, i, i+1);
           if(current.length() > length){
               ans = current;
               length = current.length();
           }
       }
       return ans;
   }

    public static void main(String... args) {
        String s = "bb";
        // System.out.println(s.charAt(4));
        // System.out.println(s.substring(0, s.length()));
        // System.out.println(isPalindrome(s));
        // System.out.println(longestPalindrome(s));
        System.out.println(s.substring(1, 1));
    }
}
