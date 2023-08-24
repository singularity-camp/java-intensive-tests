package com.kz.perfectlybalanced;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PerfectlyBalancedApplicationTests {

    @Test
    @DisplayName("[1, 2, 9, 8, 5, 7]")
    void test1() {
        int[] array = {1, 2, 9, 8, 5, 7};
        assertTrue(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[54, 41, 91, 88, 13, 30, 89, 2, 7]")
    void test2() {
        int[] array = {54, 41, 91, 88, 13, 30, 89, 2, 7};
        assertFalse(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[68, 44, 88, 56, 75, 50]")
    void test3() {
        int[] array = {68, 44, 88, 56, 75, 50};
        assertFalse(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[11, 64, 25]")
    void test4() {
        int[] array = {11, 64, 25};
        assertFalse(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[2, 1, 2, 0, 4, 0, 0, 1, 533, 1, 0, 2, 1, 3, 3, 0, 0]")
    void test5() {
        int[] array = {2, 1, 2, 0, 4, 0, 0, 1, 533, 1, 0, 2, 1, 3, 3, 0, 0};
        assertTrue(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[24, 83, 43, 21]")
    void test6() {
        int[] array = {24, 83, 43, 21};
        assertFalse(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[14, 12, 13, 13, 15, 13, 19, 17, 17, 10, 16, 10, 15, 18, 12, 17, 11, 21, 8, 15, 11, 15, 10, 21, 12, 12, 17, 7, 8, 15, 10, 15, 14, 12, 11, 11, 15, 18, 19, 16, 250, 11, 13, 13, 13, 11, 21, 13, 20, 19, 15, 11, 19, 19, 16, 13, 16, 9, 21, 9, 19, 13, 9, 17, 10, 8, 7, 14, 10, 14, 12, 17, 21, 14, 11, 16, 10, 10, 15, 15, 11]")
    void test7() {
        int[] array = {14, 12, 13, 13, 15, 13, 19, 17, 17, 10, 16, 10, 15, 18, 12, 17, 11, 21, 8, 15, 11, 15, 10, 21, 12, 12, 17, 7, 8, 15, 10, 15, 14, 12, 11, 11, 15, 18, 19, 16, 250, 11, 13, 13, 13, 11, 21, 13, 20, 19, 15, 11, 19, 19, 16, 13, 16, 9, 21, 9, 19, 13, 9, 17, 10, 8, 7, 14, 10, 14, 12, 17, 21, 14, 11, 16, 10, 10, 15, 15, 11};
        assertTrue(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[5, 6, 4, 5, 8, 3, 2, 10, 7, 5, 5, 6, 3, 7, 8, 4, 5, 2, 6, 9, 9, 1, 7, 8, 9, 7, 4, 5, 7, 3, 6, 2, 8, 8, 9, 8, 8, 5, 7, 8, 159, 5, 7, 3, 4, 6, 4, 6, 11, 7, 6, 6, 4, 4, 7, 5, 6, 4, 3, 2, 6, 9, 6, 4, 11, 9, 7, 9, 8, 3, 9, 3, 7, 4, 2, 8, 7, 5, 8, 7, 7]")
    void test8() {
        int[] array = {5, 6, 4, 5, 8, 3, 2, 10, 7, 5, 5, 6, 3, 7, 8, 4, 5, 2, 6, 9, 9, 1, 7, 8, 9, 7, 4, 5, 7, 3, 6, 2, 8, 8, 9, 8, 8, 5, 7, 8, 159, 5, 7, 3, 4, 6, 4, 6, 11, 7, 6, 6, 4, 4, 7, 5, 6, 4, 3, 2, 6, 9, 6, 4, 11, 9, 7, 9, 8, 3, 9, 3, 7, 4, 2, 8, 7, 5, 8, 7, 7};
        assertTrue(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[31, 65, 95, 80, 9, 47, 26, 64, 71, 99, 50, 66, 98, 96, 12, 22, 52, 37, 42, 77, 35, 40, 60, 68, 19, 4, 85, 17, 67, 32, 2, 91, 13, 74]")
    void test9() {
        int[] array = {31, 65, 95, 80, 9, 47, 26, 64, 71, 99, 50, 66, 98, 96, 12, 22, 52, 37, 42, 77, 35, 40, 60, 68, 19, 4, 85, 17, 67, 32, 2, 91, 13, 74};
        assertFalse(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

    @Test
    @DisplayName("[11, 4, 8, 7, 12, 4, 9, 11, 12, 2, 7, 10, 5, 7, 8, 15, 11, 7, 14, 5, 8, 12, 9, 5, 8, 8, 12, 9, 13, 8, 5, 8, 10, 2, 7, 11, 7, 12, 7, 13, 7, 8, 6, 6, 4, 12, 9, 6, 9, 10, 227, 6, 12, 12, 10, 9, 9, 8, 3, 3, 2, 7, 9, 12, 7, 15, 12, 9, 9, 9, 7, 11, 10, 4, 5, 6, 6, 10, 14, 6, 7, 5, 9, 8, 9, 8, 9, 9, 8, 11, 7, 11, 7, 9, 14, 7, 8, 10, 8, 8, 6]")
    void test10() {
        int[] array = {11, 4, 8, 7, 12, 4, 9, 11, 12, 2, 7, 10, 5, 7, 8, 15, 11, 7, 14, 5, 8, 12, 9, 5, 8, 8, 12, 9, 13, 8, 5, 8, 10, 2, 7, 11, 7, 12, 7, 13, 7, 8, 6, 6, 4, 12, 9, 6, 9, 10, 227, 6, 12, 12, 10, 9, 9, 8, 3, 3, 2, 7, 9, 12, 7, 15, 12, 9, 9, 9, 7, 11, 10, 4, 5, 6, 6, 10, 14, 6, 7, 5, 9, 8, 9, 8, 9, 9, 8, 11, 7, 11, 7, 9, 14, 7, 8, 10, 8, 8, 6};
        assertTrue(ArrayPerfectlyBalanced.perfectlyBalanced(array));
    }

}
