package com.self_practise;
import static com.self_practise.HCF.hcf;
public class LCM {

    public static int lcm(int a, int b){
        return a*b/hcf(a,b);
    }

    public static int lcm(int [] arr){
        int lcm = arr[0];
        for(int i = 1; i < arr.length; i++){
            lcm = (lcm*arr[i])/hcf(lcm, arr[i]);
        }
        return lcm;
    }

    public static void main(String[] args) {
        int [] arr = new int[]{10, 20, 30, 35, 40};
        System.out.println(lcm(arr));
    }

}
