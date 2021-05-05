package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Negative number!");
        }
        int fact = 1;
        for (int j = 1; j <= i; j ++) {
            fact *= j;
        }
        return fact;
    }
}
