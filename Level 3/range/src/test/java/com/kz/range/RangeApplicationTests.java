package com.kz.range;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RangeApplicationTests {

	@Test
	@DisplayName("n = 5")
	void test1() {
		int[] target = {1, 2, 3, 4, 5};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(5)));
	}

	@Test
	@DisplayName("n = 8")
	void test2() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(8)));
	}

	@Test
	@DisplayName("n = 20")
	void test3() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(20)));
	}

	@Test
	@DisplayName("n = 16")
	void test4() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(16)));
	}

	@Test
	@DisplayName("n = 14")
	void test5() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(14)));
	}

	@Test
	@DisplayName("n = 7")
	void test6() {
		int[] target = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(7)));
	}

	@Test
	@DisplayName("n = 24")
	void test7() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(24)));
	}

	@Test
	@DisplayName("n = 17")
	void test8() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(17)));
	}

	@Test
	@DisplayName("n = 19")
	void test9() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(19)));
	}

	@Test
	@DisplayName("n = 23")
	void test10() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(23)));
	}

	@Test
	@DisplayName("n = 22")
	void test11() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(22)));
	}

	@Test
	@DisplayName("n = 1")
	void test12() {
		int[] target = {1};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(1)));
	}

	@Test
	@DisplayName("n = 4")
	void test13() {
		int[] target = {1, 2, 3, 4};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(4)));
	}

	@Test
	@DisplayName("n = 13")
	void test14() {
		int[] target = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
		assertEquals(Arrays.toString(target), Arrays.toString(Range.range(13)));
	}

}
