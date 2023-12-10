package com.leetcode.easy;

public class RemoveElement {
    public static int removeElement(int[] nums, int val) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            int value = Integer.MAX_VALUE;
            if(nums[i] != val) {
                value = nums[i];
            nums[c] = value;
                c++;
            }
        }
        return c;
    }

    public static void main(String[] args){
        int [] nums = new int[]{0,1,2,2,3,0,4,2};
        System.out.println(removeElement(nums, 2));
        for(int i : nums){

            System.out.println(i);
        }

    }
}
