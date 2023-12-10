package com.leetcode.easy;

public class CanPlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (int i = 0; i < flowerbed.length; i++) {
            if (n == 0)
                break;

            if (flowerbed.length == 1 && flowerbed[i] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if (i == 0 && flowerbed[i] == 0 && flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if (i == flowerbed.length - 1 && flowerbed[i] == 0 && flowerbed[i - 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if ((i >= 1 && i <= flowerbed.length - 1)
                    && (flowerbed[i] == 0 && flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0)) {
                flowerbed[i] = 1;
                n--;
            }
        }
        if (n == 0) {
            return true;
        } else
            return false;
    }

    public static void main(String [] args){
        
    }
}
