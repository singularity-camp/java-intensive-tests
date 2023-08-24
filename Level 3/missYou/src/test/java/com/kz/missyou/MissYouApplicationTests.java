package com.kz.missyou;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MissYouApplicationTests {

    @Test
    @DisplayName("array1: [1, 1, 3, 2, 5] array2: [1, 3, 9, 1, 5, 7]")
    void test1() {
        int[] array1 = {1, 1, 3, 2, 5};
        int[] array2 = {1, 3, 9, 1, 5, 7};
        int[] expectedResult = {7, 9};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [48, 81, 18, 75, 26, 59, 52, 24] array2: [75, 62, 49, 50, 5, 53, 70]")
    void test2() {
        int[] array1 = {48, 81, 18, 75, 26, 59, 52, 24};
        int[] array2 = {75, 62, 49, 50, 5, 53, 70};
        int[] expectedResult = {5, 49, 50, 53, 62, 70};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [70, 3, 57, 69, 59, 61, 20, 73, 45] array2: [70, 3, 57, 69, 59, 61, 20, 73, 45]")
    void test3() {
        int[] array1 = {70, 3, 57, 69, 59, 61, 20, 73, 45};
        int[] array2 = {70, 3, 57, 69, 59, 61, 20, 73, 45};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [89, 68, 42, 83, 38, 61, 47, 52] array2: [88, 42, 97, 18, 19, 57, 74, 22, 99]")
    void test4() {
        int[] array1 = {89, 68, 42, 83, 38, 61, 47, 52};
        int[] array2 = {88, 42, 97, 18, 19, 57, 74, 22, 99};
        int[] expectedResult = {18, 19, 22, 57, 74, 88, 97, 99};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [] array2: [75]")
    void test5() {
        int[] array1 = {};
        int[] array2 = {75};
        int[] expectedResult = {75};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [64, 12, 16, 0, 48, 82, 25, 34, 56, 67, 44, 0, 10, 62, 99, 94, 28, 25, 11, 24, 87, 17, 93, 98, 4] array2: [89, 46, 34, 30, 43, 17, 36, 65, 82, 25, 20, 50, 21, 53, 80, 50, 6, 63, 96, 40, 23, 96, 82, 59, 0, 13, 18, 99, 46, 4, 19, 69, 76, 95, 9, 4, 49]")
    void test6() {
        int[] array1 = {64, 12, 16, 0, 48, 82, 25, 34, 56, 67, 44, 0, 10, 62, 99, 94, 28, 25, 11, 24, 87, 17, 93, 98, 4};
        int[] array2 = {89, 46, 34, 30, 43, 17, 36, 65, 82, 25, 20, 50, 21, 53, 80, 50, 6, 63, 96, 40, 23, 96, 82, 59, 0, 13, 18, 99, 46, 4, 19, 69, 76, 95, 9, 4, 49};
        int[] expectedResult = {6, 9, 13, 18, 19, 20, 21, 23, 30, 36, 40, 43, 46, 46, 49, 50, 50, 53, 59, 63, 65, 69, 76, 80, 89, 95, 96, 96};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [84, 87] array2: [50, -15]")
    void test7() {
        int[] array1 = {84, 87};
        int[] array2 = {50, -15};
        int[] expectedResult = {-15, 50};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [53, 94, 84, 40, 85, 12, 99, 43, 15, 1, 89, 66] array2: [4, -43, -96, 30, 57, -20, -44, 1, 44, 56, -67, 27]")
    void test8() {
        int[] array1 = {53, 94, 84, 40, 85, 12, 99, 43, 15, 1, 89, 66};
        int[] array2 = {4, -43, -96, 30, 57, -20, -44, 1, 44, 56, -67, 27};
        int[] expectedResult = {-96, -67, -44, -43, -20, 4, 27, 30, 44, 56, 57};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [58, 70, 98, 83, 28, 81, 23, 31, 14, 54, 21, 45, 67, 66, 82, 22, 88, 93, 78, 71, 20, 3, 75, 84, 79, 22, 76, 45, 11, 10, 11, 55, 13, 80, 11, 44, 44, 97, 46, 93, 41, 18, 9, 40, 28, 53, 32, 82, 99, 56, 83, 80, 79, 37, 50, 43, 96, 69, 60, 68, 78, 0, 81, 93, 20, 53, 13, 38, 47, 65, 98, 35, 40, 46, 80, 15, 48, 40, 74, 97, 94, 50, 59, 31, 64, 36, 94, 70, 75, 29, 86, 9, 65, 81, 76, 86, 64, 92, 22] array2: [-67, -33, 71, 40, -5, 41, -1, 64, 19, -39, 24, -96, -53, 2, 53, -95, -20, 65, -63, -34, -43, -41, 19, 83, -7, -92, -13, 22, 71, -65, -62, -16, 4, -79, 48, 68, -91, 25, 50, 0, -64, 53, -89, 11, 61, -69, 72, -17, 74, 44, -83, 45, 18, 32, -17, -49, 42, 7, -44, 63, -17, -52, 39, 9, 19, -90, -97, 22, -18, 47, -70, 27, -67, -50, 7, -59, -56, -14, -90, -31, 17, -52, 88, 11, -47, 27, -12, -11, 6, 21, -38, 76, 35, 29, -99, 51, -99, 5, -22]")
    void test9() {
        int[] array1 = {58, 70, 98, 83, 28, 81, 23, 31, 14, 54, 21, 45, 67, 66, 82, 22, 88, 93, 78, 71, 20, 3, 75, 84, 79, 22, 76, 45, 11, 10, 11, 55, 13, 80, 11, 44, 44, 97, 46, 93, 41, 18, 9, 40, 28, 53, 32, 82, 99, 56, 83, 80, 79, 37, 50, 43, 96, 69, 60, 68, 78, 0, 81, 93, 20, 53, 13, 38, 47, 65, 98, 35, 40, 46, 80, 15, 48, 40, 74, 97, 94, 50, 59, 31, 64, 36, 94, 70, 75, 29, 86, 9, 65, 81, 76, 86, 64, 92, 22};
        int[] array2 = {-67, -33, 71, 40, -5, 41, -1, 64, 19, -39, 24, -96, -53, 2, 53, -95, -20, 65, -63, -34, -43, -41, 19, 83, -7, -92, -13, 22, 71, -65, -62, -16, 4, -79, 48, 68, -91, 25, 50, 0, -64, 53, -89, 11, 61, -69, 72, -17, 74, 44, -83, 45, 18, 32, -17, -49, 42, 7, -44, 63, -17, -52, 39, 9, 19, -90, -97, 22, -18, 47, -70, 27, -67, -50, 7, -59, -56, -14, -90, -31, 17, -52, 88, 11, -47, 27, -12, -11, 6, 21, -38, 76, 35, 29, -99, 51, -99, 5, -22};
        int[] expectedResult = {-99, -99, -97, -96, -95, -92, -91, -90, -90, -89, -83, -79, -70, -69, -67, -67, -65, -64, -63, -62, -59, -56, -53, -52, -52, -50, -49, -47, -44, -43, -41, -39, -38, -34, -33, -31, -22, -20, -18, -17, -17, -17, -16, -14, -13, -12, -11, -7, -5, -1, 2, 4, 5, 6, 7, 7, 17, 19, 19, 19, 24, 25, 27, 27, 39, 42, 51, 61, 63, 72};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }

    @Test
    @DisplayName("array1: [] array2: []")
    void test10() {
        int[] array1 = {};
        int[] array2 = {};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(ArrayMissYou.missYou(array1, array2)));
    }
}
