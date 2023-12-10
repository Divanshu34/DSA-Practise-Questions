package com.self_practise;

public class HCF {
    // public static int hcfWithRec(int a, int b) {
    //     if (b == 0) {
    //         return a;
    //     }
    //     return hcfWithRec(b, a % b);
    // }

    public static int hcf(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int hcf(int[] arr) {
        int hcf = arr[0];
        for (int i = 1; i < arr.length; i++) {
            hcf = hcf(hcf, arr[i]);
            if(hcf == 1){
                return 1;
            }
        }
        return hcf;
    }

    public static void main(String[] args) {
        // System.out.println(hcfWithRec(10, 4));
        System.out.println(hcf(10, 4));

        int [] arr = new int[]{10, 5, 20, 25};
        System.out.println(hcf(arr));
    }
}
