package com.coupa.coding_round;

public class IntegerTransformation {
    public static int numMoves(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int y = arr[i];
            while (y != 1) {
                if (y % 2 == 0) {
                    y = y / 2;
                } else {
                    y = y - 2;
                }
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 16, 15, 12, 1 };
        System.out.println(numMoves(arr));
    }
}
