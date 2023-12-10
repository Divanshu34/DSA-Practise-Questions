package com.leetcode.medium;

import java.util.TreeSet;

public class LongestConsecutiveSequence {
    public static int longestConsecutive(int[] nums) {
        TreeSet<Integer> tree = new TreeSet<>();
        for(int i : nums){
            tree.add(i);
        }
        nums = null;
        Integer[] arr = tree.toArray(new Integer[tree.size()]);
        tree = null;
        int n = arr.length;
        int count = 1;
        int count1 = 1;
        if(n == 0) return 0;
        for(int i = 1; i <= n-1; i++){
        
            if(arr[i-1]+1 == arr[i]){
                count++;
            } else if(count > count1){
                count1 = count;
                count = 1;
            } else {
                count = 1;
            }
        }
        if(count>count1)
        return count;
        return count1;
    }

    public static void main(String ...args){
        int [] nums = new int[]{100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }
}
