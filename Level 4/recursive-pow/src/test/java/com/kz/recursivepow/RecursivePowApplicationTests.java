package com.kz.recursivepow;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursivePowApplicationTests {

    @Test
    @DisplayName("a = 2, b = 6")
    void test1() {
        assertEquals(64, RecursivePow.recursivePow(2, 6));
    }

    @Test
    @DisplayName("a = 7, b = 7")
    void test2() {
        assertEquals(823543, RecursivePow.recursivePow(7, 7));
    }

    @Test
    @DisplayName("a = 1, b = 1")
    void test3() {
        assertEquals(1, RecursivePow.recursivePow(1, 1));
    }

    @Test
    @DisplayName("a = 4, b = 3")
    void test4() {
        assertEquals(64, RecursivePow.recursivePow(4, 3));
    }

    @Test
    @DisplayName("a = 8, b = 2")
    void test5() {
        assertEquals(64, RecursivePow.recursivePow(8, 2));
    }

    @Test
    @DisplayName("a = 8, b = 1")
    void test6() {
        assertEquals(8, RecursivePow.recursivePow(8, 1));
    }

    @Test
    @DisplayName("a = 7, b = 9")
    void test7() {
        assertEquals(40353607, RecursivePow.recursivePow(7, 9));
    }

}
