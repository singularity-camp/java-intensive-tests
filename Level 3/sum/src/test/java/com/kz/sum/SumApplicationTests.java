package com.kz.sum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SumApplicationTests {

    @Test
    @DisplayName("1, 2, 3")
    void test1() {
        int[] array = {1, 2, 3};
        assertEquals(6, SumArray.sum(array));
    }

    @Test
    @DisplayName("13, 89")
    void test2() {
        int[] array = {13, 89};
        assertEquals(102, SumArray.sum(array));
    }

    @Test
    @DisplayName("42, 14, 46, 41, 92, 62, 97")
    void test3() {
        int[] array = {42, 14, 46, 41, 92, 62, 97};
        assertEquals(394, SumArray.sum(array));
    }

    @Test
    @DisplayName("12, 12, 30, 33, 89, 32, 29, 4, 79")
    void test4() {
        int[] array = {12, 12, 30, 33, 89, 32, 29, 4, 79};
        assertEquals(320, SumArray.sum(array));
    }

    @Test
    @DisplayName("52, 72, 55, 59, 31, 85, 60, 21")
    void test5() {
        int[] array = {52, 72, 55, 59, 31, 85, 60, 21};
        assertEquals(435, SumArray.sum(array));
    }

    @Test
    @DisplayName("12, 56, 63, 49, 62, 78, 86, 95")
    void test6() {
        int[] array = {12, 56, 63, 49, 62, 78, 86, 95};
        assertEquals(501, SumArray.sum(array));
    }

    @Test
    @DisplayName("16, 71, 41, 65, 19, 20, 9, 98")
    void test7() {
        int[] array = {16, 71, 41, 65, 19, 20, 9, 98};
        assertEquals(339, SumArray.sum(array));
    }

    @Test
    @DisplayName("78, 41, 69, 99, 45, 46, 44, 7")
    void test8() {
        int[] array = {78, 41, 69, 99, 45, 46, 44, 7};
        assertEquals(429, SumArray.sum(array));
    }

    @Test
    @DisplayName("90, 15, 47, 19, 32, 19")
    void test9() {
        int[] array = {90, 15, 47, 19, 32, 19};
        assertEquals(222, SumArray.sum(array));
    }

    @Test
    @DisplayName("empty array")
    void test10() {
        int[] array = {};
        assertEquals(0, SumArray.sum(array));
    }
}
