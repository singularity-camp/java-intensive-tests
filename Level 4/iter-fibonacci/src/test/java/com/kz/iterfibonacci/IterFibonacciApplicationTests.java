package com.kz.iterfibonacci;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IterFibonacciApplicationTests {

    @Test
    @DisplayName("n = 5")
    void test1() {
        assertEquals(3, IterFibonacci.iterFibonacci(5));
    }

    @Test
    @DisplayName("n = 1")
    void test2() {
        assertEquals(0, IterFibonacci.iterFibonacci(1));
    }

    @Test
    @DisplayName("n = 2")
    void test3() {
        assertEquals(1, IterFibonacci.iterFibonacci(2));
    }

    @Test
    @DisplayName("n = 12")
    void test4() {
        assertEquals(89, IterFibonacci.iterFibonacci(12));
    }

    @Test
    @DisplayName("n = 13")
    void test5() {
        assertEquals(144, IterFibonacci.iterFibonacci(13));
    }

    @Test
    @DisplayName("n = 30")
    void test6() {
        assertEquals(514229, IterFibonacci.iterFibonacci(30));
    }

    @Test
    @DisplayName("n = 35")
    void test7() {
        assertEquals(5702887, IterFibonacci.iterFibonacci(35));
    }

    @Test
    @DisplayName("n = 34")
    void test8() {
        assertEquals(3524578, IterFibonacci.iterFibonacci(34));
    }

    @Test
    @DisplayName("n = 25")
    void test9() {
        assertEquals(46368, IterFibonacci.iterFibonacci(25));
    }

    @Test
    @DisplayName("n = 33")
    void test10() {
        assertEquals(2178309, IterFibonacci.iterFibonacci(33));
    }
}
