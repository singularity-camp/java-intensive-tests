package com.kz.reverse;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ReverseApplicationTests {

    @Test
    @DisplayName("3, 2, 1")
    void test1() {
        int[] array = {3, 2, 1};
        int[] expectedResult = {1, 2, 3};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("41, 70, 34, -59, 84, -41, 18, 40, -82")
    void test2() {
        int[] array = {41, 70, 34, -59, 84, -41, 18, 40, -82};
        int[] expectedResult = {-82, 40, 18, -41, 84, -59, 34, 70, 41};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-63, -79, 4, -26, 10, 58")
    void test3() {
        int[] array = {-63, -79, 4, -26, 10, 58};
        int[] expectedResult = {58, 10, -26, 4, -79, -63};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-15, -20, 98, 33, -29")
    void test4() {
        int[] array = {-15, -20, 98, 33, -29};
        int[] expectedResult = {-29, 33, 98, -20, -15};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-15, -20, 98, 33, -29")
    void test5() {
        int[] array = {-15, -20, 98, 33, -29};
        int[] expectedResult = {-29, 33, 98, -20, -15};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-62, -94, -50")
    void test6() {
        int[] array = {-62, -94, -50};
        int[] expectedResult = {-50, -94, -62};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-35, -99, 14, 70, 3, 42, -97, -60, -9")
    void test7() {
        int[] array = {-35, -99, 14, 70, 3, 42, -97, -60, -9};
        int[] expectedResult = {-9, -60, -97, 42, 3, 70, 14, -99, -35};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("-76, -31, 43, 60, -41")
    void test8() {
        int[] array = {-76, -31, 43, 60, -41};
        int[] expectedResult = {-41, 60, 43, -31, -76};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("72, 14, -30, 42, -18, -99, 83")
    void test9() {
        int[] array = {72, 14, -30, 42, -18, -99, 83};
        int[] expectedResult = {83, -99, -18, 42, -30, 14, 72};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }

    @Test
    @DisplayName("empty array")
    void test10() {
        int[] array = {};
        int[] expectedResult = {};
        ArrayReverse.reverse(array);
        assertEquals(Arrays.toString(expectedResult), Arrays.toString(array));
    }
}
