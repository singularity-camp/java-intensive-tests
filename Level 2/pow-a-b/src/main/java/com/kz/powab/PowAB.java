package com.kz.powab;

public class PowAB {
    public static int pow(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; ++i) res *= a;
        return res;
    }
}
