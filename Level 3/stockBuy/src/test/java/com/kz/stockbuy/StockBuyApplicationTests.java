package com.kz.stockbuy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.annotation.Documented;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class StockBuyApplicationTests {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("m = 3, array = [1, 2, 3]")
    void test1() {
        int m = 3;
        int[] array = {1, 2, 3};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("0 1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 4, array = [1, 4, 5, 3, 2]")
    void test2() {
        int m = 4;
        int[] array = {1, 4, 5, 3, 2};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("0 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 4, array = [2, 2, 4, 3]")
    void test3() {
        int m = 4;
        int[] array = {2, 2, 4, 3};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("0 1", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 100, array = [5, 75, 25]")
    void test4() {
        int m = 100;
        int[] array = {5, 75, 25};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("1 2", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 200, array = [150, 24, 79, 50, 88, 345, 3]")
    void test5() {
        int m = 200;
        int[] array = {150, 24, 79, 50, 88, 345, 3};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("0 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 8, array = [2, 1, 9, 4, 4, 56, 90, 3]")
    void test6() {
        int m = 8;
        int[] array = {2, 1, 9, 4, 4, 56, 90, 3};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("3 4", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 542, array = [230, 863, 916, 585, 981, 404, 316, 785, 88, 12, 70, 435, 384, 778, 887, 755, 740, 337, 86, 92, 325, 422, 815, 650, 920, 125, 277, 336, 221, 847, 168, 23, 677, 61, 400, 136, 874, 363, 394, 199, 863, 997, 794, 587, 124, 321, 212, 957, 764, 173, 314, 422, 927, 783, 930, 282, 306, 506, 44, 926, 691, 568, 68, 730, 933, 737, 531, 180, 414, 751, 28, 546, 60, 371, 493, 370, 527, 387, 43, 541, 13, 457, 328, 227, 652, 365, 430, 803, 59, 858, 538, 427, 583, 368, 375, 173, 809, 896, 370, 789]")
    void test7() {
        int m = 542;
        int[] array = {230, 863, 916, 585, 981, 404, 316, 785, 88, 12, 70, 435, 384, 778, 887, 755, 740, 337, 86, 92, 325, 422, 815, 650, 920, 125, 277, 336, 221, 847, 168, 23, 677, 61, 400, 136, 874, 363, 394, 199, 863, 997, 794, 587, 124, 321, 212, 957, 764, 173, 314, 422, 927, 783, 930, 282, 306, 506, 44, 926, 691, 568, 68, 730, 933, 737, 531, 180, 414, 751, 28, 546, 60, 371, 493, 370, 527, 387, 43, 541, 13, 457, 328, 227, 652, 365, 430, 803, 59, 858, 538, 427, 583, 368, 375, 173, 809, 896, 370, 789};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("28 45", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 789, array = [591, 955, 829, 805, 312, 83, 764, 841, 12, 744, 104, 773, 627, 306, 731, 539, 349, 811, 662, 341, 465, 300, 491, 423, 569, 405, 508, 802, 500, 747, 689, 506, 129, 325, 918, 606, 918, 370, 623, 905, 321, 670, 879, 607, 140, 543, 997, 530, 356, 446, 444, 184, 787, 199, 614, 685, 778, 929, 819, 612, 737, 344, 471, 645, 726]")
    void test8() {
        int m = 789;
        int[] array = {591, 955, 829, 805, 312, 83, 764, 841, 12, 744, 104, 773, 627, 306, 731, 539, 349, 811, 662, 341, 465, 300, 491, 423, 569, 405, 508, 802, 500, 747, 689, 506, 129, 325, 918, 606, 918, 370, 623, 905, 321, 670, 879, 607, 140, 543, 997, 530, 356, 446, 444, 184, 787, 199, 614, 685, 778, 929, 819, 612, 737, 344, 471, 645, 726};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("10 55", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 9, array = [1, 3, 4, 6, 7, 9]")
    void test9() {
        int m = 9;
        int[] array = {1, 3, 4, 6, 7, 9};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("1 3", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("m = 8, array = [1, 3, 4, 4, 6, 8]")
    void test10() {
        int m = 8;
        int[] array = {1, 3, 4, 4, 6, 8};
        ArrayStockBuy.stockBuy(m, array);
        assertEquals("2 3", outputStreamCaptor.toString().trim());
    }
}
