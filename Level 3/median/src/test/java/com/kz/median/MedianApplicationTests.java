package com.kz.median;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MedianApplicationTests {

    @Test
    @DisplayName("[1, 2, 3]")
    void test1() {
        int[] array = {1, 2, 3};
        assertEquals(2, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[9, 2, 40]")
    void test2() {
        int[] array = {9, 2, 40};
        assertEquals(9, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[15, 93, 65, 1, 28, 23]")
    void test3() {
        int[] array = {15, 93, 65, 1, 28, 23};
        assertEquals(23, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[52, 0, 83, 81, 18, 19]")
    void test4() {
        int[] array = {52, 0, 83, 81, 18, 19};
        assertEquals(19, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[95, 66, 21, 31, 55, 21, 83]")
    void test5() {
        int[] array = {95, 66, 21, 31, 55, 21, 83};
        assertEquals(55, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[51, 68, 94, 39, 45]")
    void test6() {
        int[] array = {51, 68, 94, 39, 45};
        assertEquals(51, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[67, 92, 96]")
    void test7() {
        int[] array = {67, 92, 96};
        assertEquals(92, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[25, 95, 71, 80, 40, 24, 42, 53, 36]")
    void test8() {
        int[] array = {25, 95, 71, 80, 40, 24, 42, 53, 36};
        assertEquals(42, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[11, 66, 27, 45, 33, 38, 27, 29, 7, 70, 82, 42, 21, 69, 84, 57, 2, 57, 40, 73, 72, 67, 77, 86, 32, 54, 77, 90, 91, 12, 15, 97, 56, 68, 81, 35, 31]")
    void test9() {
        int[] array = {11, 66, 27, 45, 33, 38, 27, 29, 7, 70, 82, 42, 21, 69, 84, 57, 2, 57, 40, 73, 72, 67, 77, 86, 32, 54, 77, 90, 91, 12, 15, 97, 56, 68, 81, 35, 31};
        assertEquals(56, ArrayMedian.median(array));
    }

    @Test
    @DisplayName("[67, 40, 98, 49, 81, 52, 45, 76, 40, 16, 28, 13, 97, 1, 47, 86, 14, 67, 49, 7, 57, 94, 67, 5, 76, 1, 25, 23, 72, 8, 37, 80, 80, 4, 96, 25, 5, 18, 87, 44, 14, 87, 98]")
    void test10() {
        int[] array = {67, 40, 98, 49, 81, 52, 45, 76, 40, 16, 28, 13, 97, 1, 47, 86, 14, 67, 49, 7, 57, 94, 67, 5, 76, 1, 25, 23, 72, 8, 37, 80, 80, 4, 96, 25, 5, 18, 87, 44, 14, 87, 98};
        assertEquals(47, ArrayMedian.median(array));
    }
}
