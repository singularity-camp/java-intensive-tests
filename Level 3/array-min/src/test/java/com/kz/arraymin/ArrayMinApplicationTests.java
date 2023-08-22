package com.kz.arraymin;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ArrayMinApplicationTests {

    @Test
    @DisplayName("7, 5, 9, 1, 4")
    void test1() {
        int[] array = {7, 5, 9, 1, 4};
        assertEquals(1, ArrayMin.min(array));
    }

    @Test
    @DisplayName("1, 2, 3")
    void test2() {
        int[] array = {1, 2, 3};
        assertEquals(1, ArrayMin.min(array));
    }

    @Test
    @DisplayName("4, 90")
    void test3() {
        int[] array = {4, 90};
        assertEquals(4, ArrayMin.min(array));
    }

    @Test
    @DisplayName("99, 99, 59, 78")
    void test4() {
        int[] array = {99, 99, 59, 78};
        assertEquals(59, ArrayMin.min(array));
    }

    @Test
    @DisplayName("17, 64, 55, 9, 3, 0, 72, 25, 31")
    void test5() {
        int[] array = {17, 64, 55, 9, 3, 0, 72, 25, 31};
        assertEquals(0, ArrayMin.min(array));
    }

    @Test
    @DisplayName("57, 39, 7, 99, 1")
    void test6() {
        int[] array = {57, 39, 7, 99, 1};
        assertEquals(1, ArrayMin.min(array));
    }

    @Test
    @DisplayName("63, 73, 76, 98, 64, 50, 93, 35, 54")
    void test7() {
        int[] array = {63, 73, 76, 98, 64, 50, 93, 35, 54};
        assertEquals(35, ArrayMin.min(array));
    }

    @Test
    @DisplayName("55, 96, 18, 63")
    void test8() {
        int[] array = {55, 96, 18, 63};
        assertEquals(18, ArrayMin.min(array));
    }

    @Test
    @DisplayName("79, 19, 4, 69, 75")
    void test9() {
        int[] array = {79, 19, 4, 69, 75};
        assertEquals(4, ArrayMin.min(array));
    }

    @Test
    @DisplayName("62, 18, 38, 25, 76, 6, 17, 49, 47")
    void test10() {
        int[] array = {62, 18, 38, 25, 76, 6, 17, 49, 47};
        assertEquals(6, ArrayMin.min(array));
    }

    @Test
    @DisplayName("empty array")
    void test11() {
        int[] array = {};
        assertEquals(0, ArrayMin.min(array));
    }
}
