package com.kz.equal;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class EqualApplicationTests {

	@Test
	@DisplayName("array1 = [7, 5, 9, 1, 4]\narray2 = [7, 5, 9, 1, 4]")
	void test1() {
		int[] array1 = {7, 5, 9, 1, 4};
		int[] array2 = {7, 5, 9, 1, 4};
		assertEquals(true, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [1, 2, 3]\narray2 = [1, 2, 3]")
	void test2() {
		int[] array1 = {1, 2, 3};
		int[] array2 = {1, 2, 3};
		assertEquals(true, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [7, 7, 7, 7, 7, 7]\narray2 = [7, 7, 7, 7, 7]")
	void test3() {
		int[] array1 = {7, 7, 7, 7, 7, 7};
		int[] array2 = {7, 7, 7, 7, 7};
		assertEquals(false, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [7, 5, 9, 1]\narray2 = [7, 5, 9, 1, 4]")
	void test4() {
		int[] array1 = {7, 5, 9, 1};
		int[] array2 = {7, 5, 9, 1, 4};
		assertEquals(false, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]\narray2 = [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]")
	void test5() {
		int[] array1 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
		int[] array2 = {2, 2, 2, 2, 2, 2, 2, 2, 2, 2};
		assertEquals(true, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [7, 2, 1, 2, 3, 5, 2]\narray2 = [7, 2, 3, 1, 2, 5, 2]")
	void test6() {
		int[] array1 = {7, 2, 1, 2, 3, 5, 2};
		int[] array2 = {7, 2, 3, 1, 2, 5, 2};
		assertEquals(false, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [1, 2, 3, 4, 5, 6, 7]\narray2 = [1, 2, 3, 4, 5, 6, 7]")
	void test7() {
		int[] array1 = {1, 2, 3, 4, 5, 6, 7};
		int[] array2 = {1, 2, 3, 4, 5, 6, 7};
		assertEquals(true, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [12, 3000, -1000, -1000]\narray2 = [12, 3000, -1000, -1000]")
	void test8() {
		int[] array1 = {12, 3000, -1000, -1000};
		int[] array2 = {12, 3000, -1000, -1000};
		assertEquals(true, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [3, 2, 1, 0]\narray2 = [1, 2, 3, 0]")
	void test9() {
		int[] array1 = {3, 2, 1, 0};
		int[] array2 = {1, 2, 3, 0};
		assertEquals(false, Equal.equal(array1, array2));
	}

	@Test
	@DisplayName("array1 = [1]\narray2 = [1]")
	void test10() {
		int[] array1 = {1};
		int[] array2 = {1};
		assertEquals(true, Equal.equal(array1, array2));
	}
}
