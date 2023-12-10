package com.hacker_rank.prepare.algorithms.greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ChiefHopper {

    public static int chiefHopper(List<Integer> arr) {
        double totalEnergy = 0;
        for(int i = 0; i < arr.size(); i++){
            totalEnergy = Math.ceil((totalEnergy + arr.get(arr.size() - i - 1))/2);
        }
        return (int) totalEnergy;
    }

    public static void main(String [] args){
        List<Integer> arr = new ArrayList<Integer>();
        Collections.addAll(arr, 3, 4, 3, 2, 4);
        System.out.println(chiefHopper(arr));
    }
}
