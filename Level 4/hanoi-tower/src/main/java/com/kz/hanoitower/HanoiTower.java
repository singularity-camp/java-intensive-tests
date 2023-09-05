package com.kz.hanoitower;

public class HanoiTower {

    public static void hanoiTower(int n) {
        // Написать решение сюда ↓
        rec(n, 1, 3);
    }


    public static void rec(int n, int a, int b) {
        if (n == 1) System.out.println("Диск 1 с башни " + a + " переложить в башню " + b);
        else {
            int c = 6 - a - b;
            rec(n - 1, a, c);
            System.out.println("Диск " + n + " с башни " + a + " переложить в башню " + b);
            rec(n - 1, c, b);
        }
    }

}
