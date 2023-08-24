package com.kz.sort;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SortApplicationTests {

    @Test
    @DisplayName("[3, 2, 1]")
    void test1() {
        int[] array = {3, 2, 1};
        int[] expectedResult = {1, 2, 3};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[43, 58, 3, 69, 5, -8, -5, 83, -46]")
    void test2() {
        int[] array = {43, 58, 3, 69, 5, -8, -5, 83, -46};
        int[] expectedResult = {43, 58, 3, 69, 5, -8, -5, 83, -46};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[39, -86, 67, 54, 71, -12]")
    void test3() {
        int[] array = {39, -86, 67, 54, 71, -12};
        int[] expectedResult = {39, -86, 67, 54, 71, -12};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[-94, 12, -64, -61, -85]")
    void test4() {
        int[] array = {-94, 12, -64, -61, -85};
        int[] expectedResult = {-94, 12, -64, -61, -85};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[5, -76, -34, 9, 78, 22, 25, 95]")
    void test5() {
        int[] array = {5, -76, -34, 9, 78, 22, 25, 95};
        int[] expectedResult = {5, -76, -34, 9, 78, 22, 25, 95};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[11, 50, 72, 68, -68, 15, 19, 47]")
    void test6() {
        int[] array = {11, 50, 72, 68, -68, 15, 19, 47};
        int[] expectedResult = {11, 50, 72, 68, -68, 15, 19, 47};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[8, -83, 46, 47, 67, -22, -89]")
    void test7() {
        int[] array = {8, -83, 46, 47, 67, -22, -89};
        int[] expectedResult = {8, -83, 46, 47, 67, -22, -89};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[-32, -81, -85, 1, 33, -44, -74]")
    void test8() {
        int[] array = {-32, -81, -85, 1, 33, -44, -74};
        int[] expectedResult = {-32, -81, -85, 1, 33, -44, -74};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[-68, -87, -49, -99, -37]")
    void test9() {
        int[] array = {-68, -87, -49, -99, -37};
        int[] expectedResult = {-68, -87, -49, -99, -37};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("[]")
    void test10() {
        int[] array = {};
        int[] expectedResult = {};
        Arrays.sort(expectedResult);
        ArraySort.sort(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }
}
