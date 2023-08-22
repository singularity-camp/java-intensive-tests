package com.kz.swap;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SwapApplicationTests {

    @Test
    @DisplayName("array: 1, 2; i = 0, j = 1")
    void test1() {
        int[] array = {1, 2};
        int[] expectedResult = {2, 1};
        ArraySwap.swap(array, 0, 1);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 52, 74, 22, 72, 40; i = 2, j = 2")
    void test2() {
        int[] array = {52, 74, 22, 72, 40};
        int[] expectedResult = {52, 74, 22, 72, 40};
        ArraySwap.swap(array, 2, 2);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 64, 5; i = 0, j = 1")
    void test3() {
        int[] array = {64, 5};
        int[] expectedResult = {5, 64};
        ArraySwap.swap(array, 0, 1);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 82, 19, 30, 83, 42; i = 3, j = 2")
    void test4() {
        int[] array = {82, 19, 30, 83, 42};
        int[] expectedResult = {82, 19, 83, 30, 42};
        ArraySwap.swap(array, 3, 2);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 4, 38, 96, 60, 82, 7, 42; i = 3, j = 0")
    void test5() {
        int[] array = {4, 38, 96, 60, 82, 7};
        int[] expectedResult = {60, 38, 96, 4, 82, 7};
        ArraySwap.swap(array, 3, 0);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 14, 13, 50, 82, 20, 71, 92, 99; i = 2, j = 4")
    void test6() {
        int[] array = {14, 13, 50, 82, 20, 71, 92, 99};
        int[] expectedResult = {14, 13, 20, 82, 50, 71, 92, 99};
        ArraySwap.swap(array, 2, 4);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 63, 21, 46, 31, 85, 55, 74; i = 2, j = 2")
    void test7() {
        int[] array = {63, 21, 46, 31, 85, 55, 74};
        int[] expectedResult = {63, 21, 46, 31, 85, 55, 74};
        ArraySwap.swap(array, 2, 2);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 38, 29, 36, 74, 79, 99; i = 3, j = 3")
    void test8() {
        int[] array = {38, 29, 36, 74, 79, 99};
        int[] expectedResult = {38, 29, 36, 74, 79, 99};
        ArraySwap.swap(array, 3, 3);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array: 53, 51, 21, 99, 94; i = 2, j = -1")
    void test9() {
        int[] array = {53, 51, 21, 99, 94};
        int[] expectedResult = {53, 51, 21, 99, 94};
        ArraySwap.swap(array, 2, -1);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("array:37, 22, 7; i = 0, j = 2")
    void test10() {
        int[] array = {37, 22, 7};
        int[] expectedResult = {7, 22, 37};
        ArraySwap.swap(array, 0, 2);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }
}
