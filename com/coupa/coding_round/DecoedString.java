package com.coupa.coding_round;

import java.util.HashMap;
import java.util.Map;

public class DecoedString {
    // abbcdeaa
    public static String countMax(String s1){
        String str = "";
        Map<Character, Integer> map = new HashMap<>();
        int count = 0;
        for(int i = 0; i < s1.length(); i++){
            map.put(s1.charAt(i), map.getOrDefault(s1.charAt(i), 0) + 1);
        }
        for(Map.Entry<Character, Integer> entry : map.entrySet()){
            if(entry.getValue() > count){
                count = entry.getValue();
                str = entry.getKey().toString();
            }
        }
        String ans = str + count;
        return ans;
    }

    public static String decodeString(String s1){
        String n = countMax(s1);
        StringBuilder str = new StringBuilder(s1);
        str.reverse();
        s1 = str.toString();
        return s1+" "+n;
    }

    public static void main(String ...args){
        String s1 = "abbcdeaa";
        System.out.println(s1);
        // System.out.println(countMax(s1));
        System.out.println(decodeString(s1));
    }
}
