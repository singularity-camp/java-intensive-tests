package com.kz.checkoverflow;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CheckOverflowApplicationTests {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("2147483647 + 1")
    void test1() {
        CheckOverflow.check(2147483647, 1);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2147483646 + 2")
    void test2() {
        CheckOverflow.check(2147483646, 2);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2147482647 + 1001")
    void test3() {
        CheckOverflow.check(2147482647, 1001);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2147482647 + 1001")
    void test4() {
        CheckOverflow.check(2147482647, 1001);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("-2147483648 + -1")
    void test5() {
        CheckOverflow.check(-2147483648, -1);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("-2147483648 + -2147483648")
    void test6() {
        CheckOverflow.check(-2147483648, -2147483648);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("-2147482648 + -1001")
    void test7() {
        CheckOverflow.check(-2147482648, -1001);
        assertEquals("1", outputStreamCaptor.toString().trim());
    }


    @Test
    @DisplayName("-2 + -1")
    void test8() {
        CheckOverflow.check(-2147482648, -1000);
        assertEquals("0", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2 + 5")
    void test9() {
        CheckOverflow.check(2, 5);
        assertEquals("0", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2147483647 + 0")
    void test10() {
        CheckOverflow.check(2147483647, 0);
        assertEquals("0", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("-2147483648 + 0")
    void test11() {
        CheckOverflow.check(-2147483648, 0);
        assertEquals("0", outputStreamCaptor.toString().trim());
    }
}
