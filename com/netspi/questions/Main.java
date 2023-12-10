package com.netspi.questions;
import java.util.*;

public class Main {

    public static boolean isTwoDigit(int a) {
        if (a > 9 && a < 100) {
            return true;
        }
        return false;
    }

    public static int processArray(ArrayList<Integer> array) {
        int n = array.size();
        int seq = 0;
        // int sum = 75;
        int s = 0;
        for (int i = 0; i < n; i++) {
            if (isTwoDigit(array.get(i))) {
                s = s + array.get(i);
                if (s >= 75) {
                    seq++;
                    s = 0;
                } else if (i + 1 < n && !isTwoDigit(array.get(i + 1)) && s < 75) {
                    s = 0;
                }
            }
        }

        return seq;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int num = in.nextInt();
            if (num < 0)
                break;
            arrayList.add(new Integer(num));
        }
        int result = processArray(arrayList);
        System.out.println(result);
    }
}