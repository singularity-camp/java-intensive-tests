package com.kz.recursivefibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursiveFibonacciApplicationTests {


    @Test
    @DisplayName("n = 5")
    void test1() {
        assertEquals(3, RecursiveFibonacci.recursiveFibonacci(5));
    }

    @Test
    @DisplayName("n = 1")
    void test2() {
        assertEquals(0, RecursiveFibonacci.recursiveFibonacci(1));
    }

    @Test
    @DisplayName("n = 2")
    void test3() {
        assertEquals(1, RecursiveFibonacci.recursiveFibonacci(2));
    }

    @Test
    @DisplayName("n = 12")
    void test4() {
        assertEquals(89, RecursiveFibonacci.recursiveFibonacci(12));
    }

    @Test
    @DisplayName("n = 13")
    void test5() {
        assertEquals(144, RecursiveFibonacci.recursiveFibonacci(13));
    }

    @Test
    @DisplayName("n = 30")
    void test6() {
        assertEquals(514229, RecursiveFibonacci.recursiveFibonacci(30));
    }

    @Test
    @DisplayName("n = 35")
    void test7() {
        assertEquals(5702887, RecursiveFibonacci.recursiveFibonacci(35));
    }

    @Test
    @DisplayName("n = 34")
    void test8() {
        assertEquals(3524578, RecursiveFibonacci.recursiveFibonacci(34));
    }

    @Test
    @DisplayName("n = 25")
    void test9() {
        assertEquals(46368, RecursiveFibonacci.recursiveFibonacci(25));
    }

    @Test
    @DisplayName("n = 33")
    void test10() {
        assertEquals(2178309, RecursiveFibonacci.recursiveFibonacci(33));
    }
}
