package com.kz.sumoftwo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SumOfTwoApplicationTests {

    @Test
    @DisplayName("2 + 2")
    public void test1() {
        assertEquals(4, SumOfTwo.sum(2, 2));
    }

    @Test
    @DisplayName("120 + 240")
    public void test2() {
        assertEquals(360, SumOfTwo.sum(120, 240));
    }

    @Test
    @DisplayName("95 + 36")
    public void test3() {
        assertEquals(131, SumOfTwo.sum(95, 36));
    }

    @Test
    @DisplayName("99 + 5")
    public void test4() {
        assertEquals(104, SumOfTwo.sum(99, 5));
    }
    @Test
    @DisplayName("268 + 146")
    public void test5() {
        assertEquals(414, SumOfTwo.sum(268, 146));
    }
    @Test
    @DisplayName("92 + 1")
    public void test6() {
        assertEquals(93, SumOfTwo.sum(92, 1));
    }
    @Test
    @DisplayName("131 + 10")
    public void test7() {
        assertEquals(141, SumOfTwo.sum(131, 10));
    }
    @Test
    @DisplayName("167 + 139")
    public void test8() {
        assertEquals(306, SumOfTwo.sum(167, 139));
    }
    @Test
    @DisplayName("219 + 173")
    public void test9() {
        assertEquals(392, SumOfTwo.sum(219, 173));
    }
    @Test
    @DisplayName("268 + 259")
    public void test10() {
        assertEquals(527, SumOfTwo.sum(268, 259));
    }


}
