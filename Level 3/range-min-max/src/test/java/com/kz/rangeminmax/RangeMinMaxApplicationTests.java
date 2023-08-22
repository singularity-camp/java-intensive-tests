package com.kz.rangeminmax;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RangeMinMaxApplicationTests {

    @Test
    @DisplayName("array: 7, 5, 9, 1, 4; min = 3, max = 5")
    void test1() {
        int[] array = {7, 5, 9, 1, 4};
        int[] expectedResult = {5, 4};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 3, 5)));
    }

    @Test
    @DisplayName("array: 66, 66, 28, 31, 59, 6; min = 90, max = 91")
    void test2() {
        int[] array = {66, 66, 28, 31, 59, 6};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 90, 91)));
    }

    @Test
    @DisplayName("array: 44, 50, 62, 90, 40, 41; min = 3, max = 84")
    void test3() {
        int[] array = {44, 50, 62, 90, 40, 41};
        int[] expectedResult = {44, 50, 62, 40, 41};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 3, 84)));
    }

    @Test
    @DisplayName("array: 44, 98, 34, 8, 2, 20, 15, 18, 64, 41; min = 6, max = 51")
    void test4() {
        int[] array = {44, 98, 34, 8, 2, 20, 15, 18, 64, 41};
        int[] expectedResult = {44, 34, 8, 20, 15, 18, 41};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 6, 51)));
    }

    @Test
    @DisplayName("array: 92, 17, 60, 58, 74, 52, 70, 10, 81; min = 14, max = 14")
    void test5() {
        int[] array = {92, 17, 60, 58, 74, 52, 70, 10, 81};
        int[] expectedResult = {};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 14, 14)));
    }

    @Test
    @DisplayName("array: 97, 55, 46, 48, 1, 3, 17, 77, 1, 89, 63, 36, 72, 72, 57, 57, 36, 71, 65, 47, 98, 10, 85, 86, 73, 14, 91; min = 38, max = 90")
    void test6() {
        int[] array = {97, 55, 46, 48, 1, 3, 17, 77, 1, 89, 63, 36, 72, 72, 57, 57, 36, 71, 65, 47, 98, 10, 85, 86, 73, 14, 91};
        int[] expectedResult = {55, 46, 48, 77, 89, 63, 72, 72, 57, 57, 71, 65, 47, 85, 86, 73};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 38, 90)));
    }

    @Test
    @DisplayName("array: 67, 58, 1, 98, 11, 88, 78, 14, 34, 18, 60, 78, 83, 66, 2, 31, 95, 78, 53, 24, 14, 29, 74, 31, 90, 81, 85, 63, 68, 16; min = 95, max = 97")
    void test7() {
        int[] array = {67, 58, 1, 98, 11, 88, 78, 14, 34, 18, 60, 78, 83, 66, 2, 31, 95, 78, 53, 24, 14, 29, 74, 31, 90, 81, 85, 63, 68, 16};
        int[] expectedResult = {95};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 95, 97)));
    }

    @Test
    @DisplayName("array: 0, 33, 2, 43, 46, 33, 99, 46, 25, 35, 49, 56, 89, 60, 80, 54, 63, 17, 15, 90, 23, 65, 10, 44, 82, 2, 23, 97, 49, 44, 62, 68, 21, 25, 2, 34, 98, 34, 23, 56, 96, 83, 87, 85, 27, 27, 23, 12, 69, 24, 88, 67, 83, 1, 34, 42, 65, 18, 64, 60, 43, 59, 46, 64, 0, 39, 34, 93, 54, 47, 0, 26; min = 47, max = 90")
    void test8() {
        int[] array = {0, 33, 2, 43, 46, 33, 99, 46, 25, 35, 49, 56, 89, 60, 80, 54, 63, 17, 15, 90, 23, 65, 10, 44, 82, 2, 23, 97, 49, 44, 62, 68, 21, 25, 2, 34, 98, 34, 23, 56, 96, 83, 87, 85, 27, 27, 23, 12, 69, 24, 88, 67, 83, 1, 34, 42, 65, 18, 64, 60, 43, 59, 46, 64, 0, 39, 34, 93, 54, 47, 0, 26};
        int[] expectedResult = {49, 56, 89, 60, 80, 54, 63, 90, 65, 82, 49, 62, 68, 56, 83, 87, 85, 69, 88, 67, 83, 65, 64, 60, 59, 64, 54, 47};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 47, 90)));
    }

    @Test
    @DisplayName("array: 0, 47, 56, 40, 86, 86, 37, 22, 2, 3, 10, 1, 62, 68, 88, 0, 93, 5, 44, 62, 45, 4, 25, 36, 2, 96, 35, 2, 55, 91, 97, 61, 86, 17, 53, 83, 39, 72, 47, 99, 52, 78, 19, 41, 40, 19, 8, 76, 23, 9, 92, 50, 14, 61, 31, 77, 8, 49, 51, 83, 23, 81, 15, 4, 73, 44, 8, 97, 97, 71, 69, 34, 54, 46, 7, 87, 62, 7, 76, 66, 7, 54, 15, 35, 42, 43, 41; min = 11, max = 40")
    void test9() {
        int[] array = {0, 47, 56, 40, 86, 86, 37, 22, 2, 3, 10, 1, 62, 68, 88, 0, 93, 5, 44, 62, 45, 4, 25, 36, 2, 96, 35, 2, 55, 91, 97, 61, 86, 17, 53, 83, 39, 72, 47, 99, 52, 78, 19, 41, 40, 19, 8, 76, 23, 9, 92, 50, 14, 61, 31, 77, 8, 49, 51, 83, 23, 81, 15, 4, 73, 44, 8, 97, 97, 71, 69, 34, 54, 46, 7, 87, 62, 7, 76, 66, 7, 54, 15, 35, 42, 43, 41};
        int[] expectedResult = {40, 37, 22, 25, 36, 35, 17, 39, 19, 40, 19, 23, 14, 31, 23, 15, 34, 15, 35};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 11, 40)));
    }

    @Test
    @DisplayName("array: 21, 71, 4, 70, 59, 39, 99, 8, 39, 94, 24, 17, 8, 57, 18, 16, 37, 31, 57, 0, 88, 34, 36, 7, 47, 28, 2, 54, 52, 67, 86, 46, 32, 24, 78, 58, 34, 50, 65, 4, 34, 92, 23, 72, 19, 9, 50, 92, 81, 48, 55, 2, 39, 45, 47, 33, 73, 5, 85, 75, 97, 37, 95, 61, 18, 70, 35, 6, 2, 41, 36, 34, 8, 51, 94, 10, 14, 12, 31, 64, 56, 6, 19, 95, 80, 23, 62, 37, 38, 25, 61, 98, 7; min = 84, max = 92")
    void test10() {
        int[] array = {21, 71, 4, 70, 59, 39, 99, 8, 39, 94, 24, 17, 8, 57, 18, 16, 37, 31, 57, 0, 88, 34, 36, 7, 47, 28, 2, 54, 52, 67, 86, 46, 32, 24, 78, 58, 34, 50, 65, 4, 34, 92, 23, 72, 19, 9, 50, 92, 81, 48, 55, 2, 39, 45, 47, 33, 73, 5, 85, 75, 97, 37, 95, 61, 18, 70, 35, 6, 2, 41, 36, 34, 8, 51, 94, 10, 14, 12, 31, 64, 56, 6, 19, 95, 80, 23, 62, 37, 38, 25, 61, 98, 7};
        int[] expectedResult = {88, 86, 92, 92, 85};
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(MinMax.rangeMinMax(array, 84, 92)));
    }
}
