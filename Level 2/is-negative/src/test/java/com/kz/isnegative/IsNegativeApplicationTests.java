package com.kz.isnegative;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IsNegativeApplicationTests {

    @Test
    @DisplayName("20")
    void test1() {
        assertEquals(false, Negative.isNegative(20));
    }

    @Test
    @DisplayName("10")
    void test2() {
        assertEquals(false, Negative.isNegative(10));
    }

    @Test
    @DisplayName("-2")
    void test3() {
        assertEquals(true, Negative.isNegative(-2));
    }

    @Test
    @DisplayName("0")
    void test4() {
        assertEquals(false, Negative.isNegative(0));
    }

    @Test
    @DisplayName("-123")
    void test5() {
        assertEquals(true, Negative.isNegative(-123));
    }

    @Test
    @DisplayName("-25")
    void test6() {
        assertEquals(true, Negative.isNegative(-25));
    }





}
