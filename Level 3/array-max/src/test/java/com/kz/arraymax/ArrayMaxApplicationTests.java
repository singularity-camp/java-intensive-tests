package com.kz.arraymax;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ArrayMaxApplicationTests {

	@Test
	@DisplayName("7, 5, 9, 1, 4")
	void test1() {
		int[] array = {7, 5, 9, 1, 4};
		assertEquals(9, Max.getMaximum(array));
	}

	@Test
	@DisplayName("2, 64, 98, 59, 22, 63, 99, 96, 91, 68, 32")
	void test2() {
		int[] array = {2, 64, 98, 59, 22, 63, 99, 96, 91, 68, 32};
		assertEquals(99, Max.getMaximum(array));
	}

	@Test
	@DisplayName("39, 56, 98, 50, 33, 45, 8, 46, 57, 66, 46")
	void test3() {
		int[] array = {39, 56, 98, 50, 33, 45, 8, 46, 57, 66, 46};
		assertEquals(98, Max.getMaximum(array));
	}

	@Test
	@DisplayName("7, 40, 7, 70, 4, 54")
	void test4() {
		int[] array = {26, 74, 100, 97, 66, 64, 35, 44, 40, 48};
		assertEquals(100, Max.getMaximum(array));
	}

	@Test
	@DisplayName("48, 72, 16, 68, 62, 79, 10, 46, 33, 34, 87, 91, 97, 11, 27, 84, 97, 39, 61, 76, 20, 96, 62, 37")
	void test5() {
		int[] array = {48, 72, 16, 68, 62, 79, 10, 46, 33, 34, 87, 91, 97, 11, 27, 84, 97, 39, 61, 76, 20, 96, 62, 37};
		assertEquals(97, Max.getMaximum(array));
	}

	@Test
	@DisplayName("634, 191, 718, 247, 527, 498, 169, 343, 416, 315, 548, 926, 48, 614, 554, 270, 464, 32, 683, 68, 58, 110, 977")
	void test6() {
		int[] array = {634, 191, 718, 247, 527, 498, 169, 343, 416, 315, 548, 926, 48, 614, 554, 270, 464, 32, 683, 68, 58, 110, 977};
		assertEquals(977, Max.getMaximum(array));
	}

	@Test
	@DisplayName("315, 322, 69, 475, 109, 149, 296, 434, 341, 103")
	void test7() {
		int[] array = {315, 322, 69, 475, 109, 149, 296, 434, 341, 103};
		assertEquals(475, Max.getMaximum(array));
	}

	@Test
	@DisplayName("170, 250, 394, 220, 132, 328, 469, 244, 184, 451, 66, 21, 257, 125, 105")
	void test8() {
		int[] array = {170, 250, 394, 220, 132, 328, 469, 244, 184, 451, 66, 21, 257, 125, 105};
		assertEquals(469, Max.getMaximum(array));
	}

	@Test
	@DisplayName("262, 86, 140, 135, 130")
	void test9() {
		int[] array = {262, 86, 140, 135, 130};
		assertEquals(262, Max.getMaximum(array));
	}

	@Test
	@DisplayName("191, 484, 193, 291, 57, 10, 28, 84, 202, 366, 432, 199, 173, 454, 298, 369")
	void test10() {
		int[] array = {191, 484, 193, 291, 57, 10, 28, 84, 202, 366, 432, 199, 173, 454, 298, 369};
		assertEquals(484, Max.getMaximum(array));
	}
}