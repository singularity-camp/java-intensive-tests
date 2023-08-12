package com.kz.sortnumsthree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SortNumsThreeApplicationTests {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("3 2 1")
    void test1() {
        SortNumsThree.sort(3, 2, 1);
        assertEquals("1 2 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2 3 1")
    void test2() {
        SortNumsThree.sort(2, 3, 1);
        assertEquals("1 2 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("2 1 3")
    void test3() {
        SortNumsThree.sort(2, 1, 3);
        assertEquals("1 2 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("1 1 3")
    void test4() {
        SortNumsThree.sort(1, 1, 3);
        assertEquals("1 1 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("3 1 1")
    void test5() {
        SortNumsThree.sort(3, 1, 1);
        assertEquals("1 1 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("1 3 1")
    void test6() {
        SortNumsThree.sort(1, 3, 1);
        assertEquals("1 1 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("1 3 1")
    void test7() {
        SortNumsThree.sort(1, 3, 1);
        assertEquals("1 1 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("3 3 2")
    void test8() {
        SortNumsThree.sort(3, 3, 2);
        assertEquals("2 3 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("3 2 3")
    void test9() {
        SortNumsThree.sort(3, 2, 3);
        assertEquals("2 3 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("1 1 1")
    void test10() {
        SortNumsThree.sort(1, 1, 1);
        assertEquals("1 1 1", outputStreamCaptor.toString().trim());
    }
}
