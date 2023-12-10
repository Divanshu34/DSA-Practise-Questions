package com.netspi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class code {
    public static void main(String[] args) {
        int [] arr = new int[] {1,4,5,6,3,3};
        
        System.out.println(Arrays.toString(method(arr)));
    }

    private static int[] method(int[] arr) {
        int [] a = new int[2];
        int n = arr.length;
        int sum = (n*(n+1))/2;
        int sumOfKeys = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            sumOfKeys += entry.getKey();
            if(entry.getValue() > 1){
                a[1] = entry.getKey();
            }
        }
        a[0] = sum - sumOfKeys;
        return a;

    }
}
