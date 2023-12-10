package com.self_practise;

import java.util.ArrayList;
import java.util.List;

public class PeekElementArray {

    public static int peekElementsInArray(int[] arr) {
        int count = 0;
        int n = arr.length;
        List<Integer> peekElements = new ArrayList<>();
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i + 1] && arr[i] > arr[i - 1]) {
                peekElements.add(arr[i]);
                count++;
                i++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int[] arr = new int[] { 10, 20, 15, 30, 45, 40, 50, 60, 70, 65, 55, 45, 65, 60 };
        System.out.println(peekElementsInArray(arr));
    }
}
