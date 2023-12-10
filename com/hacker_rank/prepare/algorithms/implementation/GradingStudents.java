package com.hacker_rank.prepare.algorithms.implementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = grades.stream()
                .map(grade -> {
                    for (int i = 40; i <= 100; i += 5) {
                        if (grade <= i && i - grade < 3) {
                            return i;
                        }
                    }
                    return grade;
                })
                .collect(Collectors.toList());
        return roundedGrades;
    }

    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>();
        Collections.addAll(grades, 73, 67, 38, 33);
        grades.forEach(System.out::println);
        gradingStudents(grades).forEach(System.out::println);

    }
}
