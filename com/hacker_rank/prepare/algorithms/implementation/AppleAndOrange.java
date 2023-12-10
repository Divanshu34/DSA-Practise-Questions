package com.hacker_rank.prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {

        System.out.println(apples.stream()
                .map(appleDist -> appleDist = a + appleDist)
                .filter(appleDist -> appleDist >= s && appleDist <= t)
                .count() + "\n" +
                oranges.stream()
                        .map(orangeDist -> b + orangeDist)
                        .filter(orangeDist -> orangeDist >= s && orangeDist <= t)
                        .count());

    }

    public static void main(String[] args) {
        List<Integer> apples = new ArrayList<>();
        List<Integer> oranges = new ArrayList<>();
        Collections.addAll(apples, 2, 3, -4);
        Collections.addAll(oranges, 3, -2, -4);

        countApplesAndOranges(7, 10, 4, 12, apples, oranges);
    }
}
