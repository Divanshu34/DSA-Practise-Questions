package com.hacker_rank.prepare.algorithms.implementation;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MigratoryBirds {
    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.size();
        for (int i = 0; i < n; i++) {
            map.put(arr.get(i), map.getOrDefault(arr.get(i), 0) + 1);
        }

        int max = Collections.max(map.values());
        int key = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) {
                if (entry.getKey() < key)
                    key = entry.getKey();
            }
        }
        return key;
    }
}
