package com.kz.slice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SliceApplicationTests {

    @Test
    @DisplayName("array = 3, 2, 1; from = 0, to = 1")
    void test1() {
        int[] array = {3, 2, 1};
        int[] expectedResult = {3};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 0, 1)));
    }

    @Test
    @DisplayName("array = 80, 33; from = 1, to = 1")
    void test2() {
        int[] array = {80, 33};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 1, 1)));
    }

    @Test
    @DisplayName("array = 14, 51, 63, 84, 56, 44; from = 5, to = 6")
    void test3() {
        int[] array = {14, 51, 63, 84, 56, 44};
        int[] expectedResult = {44};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 5, 6)));
    }

    @Test
    @DisplayName("array = 30, 99, 32, 46; from = 2, to = 4")
    void test4() {
        int[] array = {30, 99, 32, 46};
        int[] expectedResult = {32, 46};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 2, 4)));
    }

    @Test
    @DisplayName("array = 77, 71, 58, 42, 15, 82, 47, 24, 88; from = 4, to = 4")
    void test5() {
        int[] array = {77, 71, 58, 42, 15, 82, 47, 24, 88};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 4, 4)));
    }

    @Test
    @DisplayName("array = 21, 88, 7, 65, 58, 89, 13, 16, 41, 2, 46, 62, 56, 26, 10, 26, 15, 37, 20, 91, 94, 94, 35, 77, 84, 12, 47; from = 19, to = 26")
    void test6() {
        int[] array = {21, 88, 7, 65, 58, 89, 13, 16, 41, 2, 46, 62, 56, 26, 10, 26, 15, 37, 20, 91, 94, 94, 35, 77, 84, 12, 47};
        int[] expectedResult = {91, 94, 94, 35, 77, 84, 12};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 19, 26)));
    }

    @Test
    @DisplayName("array = 86, 70, 42, 12, 74, 40, 79, 77, 69, 45, 74, 1, 67, 9, 38, 45, 15, 70, 69, 34, 6, 5, 39, 44, 80, 61, 85, 46, 8, 43, 69, 66, 35, 49, 22, 74, 74, 43, 52, 86; from = 1, to = 11")
    void test7() {
        int[] array = {86, 70, 42, 12, 74, 40, 79, 77, 69, 45, 74, 1, 67, 9, 38, 45, 15, 70, 69, 34, 6, 5, 39, 44, 80, 61, 85, 46, 8, 43, 69, 66, 35, 49, 22, 74, 74, 43, 52, 86};
        int[] expectedResult = {70, 42, 12, 74, 40, 79, 77, 69, 45, 74};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 1, 11)));
    }

    @Test
    @DisplayName("array = 29, 58, 79, 57, 1, 89, 7, 44, 27, 66, 35, 68, 49, 9, 16, 74, 16, 36, 51, 40, 0, 55, 37, 41, 33, 31, 55, 11, 86, 35, 78, 59; from = 6, to = 13")
    void test8() {
        int[] array = {29, 58, 79, 57, 1, 89, 7, 44, 27, 66, 35, 68, 49, 9, 16, 74, 16, 36, 51, 40, 0, 55, 37, 41, 33, 31, 55, 11, 86, 35, 78, 59};
        int[] expectedResult = {7, 44, 27, 66, 35, 68, 49};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 6, 13)));
    }

    @Test
    @DisplayName("array = 70, 5, 94, 40, 67, 4, 20, 76, 1, 94, 81, 21, 19, 79, 46, 59, 26, 88, 79, 30, 97, 65, 49, 22; from = 22, to = 22")
    void test9() {
        int[] array = {70, 5, 94, 40, 67, 4, 20, 76, 1, 94, 81, 21, 19, 79, 46, 59, 26, 88, 79, 30, 97, 65, 49, 22};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 22, 22)));
    }

    @Test
    @DisplayName("array = 11, 91, 66, 55, 37, 55, 30, 33, 51, 13, 36, 48, 90, 94, 14, 32, 35, 69, 56, 19, 91, 51, 87, 99, 15, 40, 98, 75, 61, 71, 55, 61, 24, 15, 65, 73, 51, 67, 71, 81, 16, 2, 66, 44, 35, 47, 40, 72, 33, 79, 82, 98, 47, 39, 51, 53, 17, 82, 89, 14, 49, 38, 23, 59, 19, 19, 98, 5, 56, 80; from = 57, to = 65")
    void test10() {
        int[] array = {11, 91, 66, 55, 37, 55, 30, 33, 51, 13, 36, 48, 90, 94, 14, 32, 35, 69, 56, 19, 91, 51, 87, 99, 15, 40, 98, 75, 61, 71, 55, 61, 24, 15, 65, 73, 51, 67, 71, 81, 16, 2, 66, 44, 35, 47, 40, 72, 33, 79, 82, 98, 47, 39, 51, 53, 17, 82, 89, 14, 49, 38, 23, 59, 19, 19, 98, 5, 56, 80};
        int[] expectedResult = {82, 89, 14, 49, 38, 23, 59, 19};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArraySlice.slice(array, 57, 65)));
    }

}
