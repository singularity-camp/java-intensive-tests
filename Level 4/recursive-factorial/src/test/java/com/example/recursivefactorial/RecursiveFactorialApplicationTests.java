package com.example.recursivefactorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursiveFactorialApplicationTests {

    @Test
    @DisplayName("n = 3")
    void test1() {
        assertEquals(6, RecursiveFactorial.recursiveFactorial(3));
    }

    @Test
    @DisplayName("n = 4")
    void test2() {
        assertEquals(24, RecursiveFactorial.recursiveFactorial(4));
    }

    @Test
    @DisplayName("n = 5")
    void test3() {
        assertEquals(120, RecursiveFactorial.recursiveFactorial(5));
    }

    @Test
    @DisplayName("n = 8")
    void test4() {
        assertEquals(40320, RecursiveFactorial.recursiveFactorial(8));
    }

    @Test
    @DisplayName("n = 10")
    void test5() {
        assertEquals(3628800, RecursiveFactorial.recursiveFactorial(10));
    }

    @Test
    @DisplayName("n = 12")
    void test6() {
        assertEquals(479001600, RecursiveFactorial.recursiveFactorial(12));
    }

    @Test
    @DisplayName("n = 1")
    void test7() {
        assertEquals(1, RecursiveFactorial.recursiveFactorial(1));
    }

    @Test
    @DisplayName("n = 2")
    void test9() {
        assertEquals(2, RecursiveFactorial.recursiveFactorial(2));
    }

    @Test
    @DisplayName("n = 11")
    void test10() {
        assertEquals(39916800, RecursiveFactorial.recursiveFactorial(11));
    }
}
