package com.kz.iterfactorial;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IterFactorialApplicationTests {

    @Test
    @DisplayName("n = 3")
    void test1() {
        assertEquals(6, IterFactorial.iterFactorial(3));
    }

    @Test
    @DisplayName("n = 4")
    void test2() {
        assertEquals(24, IterFactorial.iterFactorial(4));
    }

    @Test
    @DisplayName("n = 5")
    void test3() {
        assertEquals(120, IterFactorial.iterFactorial(5));
    }

    @Test
    @DisplayName("n = 8")
    void test4() {
        assertEquals(40320, IterFactorial.iterFactorial(8));
    }

    @Test
    @DisplayName("n = 10")
    void test5() {
        assertEquals(3628800, IterFactorial.iterFactorial(10));
    }

    @Test
    @DisplayName("n = 12")
    void test6() {
        assertEquals(479001600, IterFactorial.iterFactorial(12));
    }

    @Test
    @DisplayName("n = 1")
    void test7() {
        assertEquals(1, IterFactorial.iterFactorial(1));
    }

    @Test
    @DisplayName("n = 2")
    void test9() {
        assertEquals(2, IterFactorial.iterFactorial(2));
    }

    @Test
    @DisplayName("n = 11")
    void test10() {
        assertEquals(39916800, IterFactorial.iterFactorial(11));
    }


}
