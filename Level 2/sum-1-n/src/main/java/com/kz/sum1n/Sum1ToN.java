package com.kz.sum1n;

public class Sum1ToN {
    public static int sum1n(int n) {
        // Write your code here
        if (n % 2 == 0) return (n / 2) * (n + 1);
        return n * ((n + 1) / 2);
    }
}
