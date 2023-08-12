package com.kz.checkoverflow;

public class CheckOverflow {
    public static void check(int a, int b) {
        long sum = (long)a + (long)b;
        if ((sum > (1 << 31) - 1) || (sum < (1 << 31))) {
            System.out.println(1);
            return;
        }
        System.out.println(0);
    }

}
