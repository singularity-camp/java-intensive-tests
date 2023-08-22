package com.kz.mean;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MeanApplicationTests {
    @Test
    @DisplayName("7, 5, 9, 1, 4")
    void test1() {
        int[] array = {7, 5, 9, 1, 4};
        assertEquals(5, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("93, 67, 89, 98")
    void test2() {
        int[] array = {93, 67, 89, 98};
        assertEquals(86, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("40, 40, 89, 68, 33, 27")
    void test3() {
        int[] array = {40, 40, 89, 68, 33, 27};
        assertEquals(49, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("63, 1, 11, 22, 91, 9, 74, 15, 59")
    void test4() {
        int[] array = {63, 1, 11, 22, 91, 9, 74, 15, 59};
        assertEquals(38, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("9, 15, 78, 13")
    void test5() {
        int[] array = {9, 15, 78, 13};
        assertEquals(28, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("77, 92")
    void test6() {
        int[] array = {77, 92};
        assertEquals(84, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("55, 63, 0, 35, 97, 32, 39, 41, 97")
    void test7() {
        int[] array = {55, 63, 0, 35, 97, 32, 39, 41, 97};
        assertEquals(51, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("85, 3, 59, 0, 95, 6, 87")
    void test8() {
        int[] array = {85, 3, 59, 0, 95, 6, 87};
        assertEquals(47, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("64, 44, 97, 0, 4, 97, 92, 7, 44")
    void test9() {
        int[] array = {64, 44, 97, 0, 4, 97, 92, 7, 44};
        assertEquals(49, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("50, 71, 70, 17, 38, 40, 49, 66, 64, 29, 81, 90, 98, 28, 61, 20, 65, 93, 50, 95, 40, 29, 88, 19, 24, 99, 77, 77, 33, 19, 93, 46, 95, 88, 94, 68, 48, 20, 70, 9, 30, 84, 10, 58, 71, 87, 55, 44, 22")
    void test10() {
        int[] array = {50, 71, 70, 17, 38, 40, 49, 66, 64, 29, 81, 90, 98, 28, 61, 20, 65, 93, 50, 95, 40, 29, 88, 19, 24, 99, 77, 77, 33, 19, 93, 46, 95, 88, 94, 68, 48, 20, 70, 9, 30, 84, 10, 58, 71, 87, 55, 44, 22};
        assertEquals(56, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("83, 20, 36, 95, 60, 51, 47, 11, 92, 33, 33, 71, 61, 21, 68, 23, 44, 40, 28, 17, 21, 78, 87, 79, 64, 20, 34, 14, 7, 73, 40, 17, 60, 43, 67, 85, 86, 81, 15")
    void test11() {
        int[] array = {83, 20, 36, 95, 60, 51, 47, 11, 92, 33, 33, 71, 61, 21, 68, 23, 44, 40, 28, 17, 21, 78, 87, 79, 64, 20, 34, 14, 7, 73, 40, 17, 60, 43, 67, 85, 86, 81, 15};
        assertEquals(48, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("6, 0, 3, 55, 53, 22, 41, 33, 71, 40, 28, 9, 88, 29, 63, 82, 0, 71, 75, 25, 19, 19, 48, 36, 92, 54, 58, 91, 49, 26, 66, 43, 89, 56, 28, 86, 16, 30, 93, 5, 14, 27, 40, 97")
    void test12() {
        int[] array = {6, 0, 3, 55, 53, 22, 41, 33, 71, 40, 28, 9, 88, 29, 63, 82, 0, 71, 75, 25, 19, 19, 48, 36, 92, 54, 58, 91, 49, 26, 66, 43, 89, 56, 28, 86, 16, 30, 93, 5, 14, 27, 40, 97};
        assertEquals(44, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("0, 25, 6, 99, 47, 24, 71, 5, 17, 43, 2, 59, 8, 59, 13, 5, 88, 61, 88, 94, 58, 80, 49, 67, 20, 98, 63, 54, 36, 49, 38, 39, 18, 95, 14, 51, 79, 50, 51, 80, 29, 91, 65, 9, 48, 67, 15")
    void test13() {
        int[] array = {0, 25, 6, 99, 47, 24, 71, 5, 17, 43, 2, 59, 8, 59, 13, 5, 88, 61, 88, 94, 58, 80, 49, 67, 20, 98, 63, 54, 36, 49, 38, 39, 18, 95, 14, 51, 79, 50, 51, 80, 29, 91, 65, 9, 48, 67, 15};
        assertEquals(47, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("40, 2, 2, 78, 19, 50, 19, 81, 5, 78, 87, 15, 55, 97, 51, 91, 24, 4, 29, 91, 47, 32, 2, 84, 22, 3, 93, 43, 58, 16, 31, 92, 0, 49, 70, 8")
    void test14() {
        int[] array = {40, 2, 2, 78, 19, 50, 19, 81, 5, 78, 87, 15, 55, 97, 51, 91, 24, 4, 29, 91, 47, 32, 2, 84, 22, 3, 93, 43, 58, 16, 31, 92, 0, 49, 70, 84};
        assertEquals(45, ArrayMean.mean(array));
    }

    @Test
    @DisplayName("empty array")
    void test15() {
        int[] array = {};
        assertEquals(0, ArrayMean.mean(array));
    }
}
