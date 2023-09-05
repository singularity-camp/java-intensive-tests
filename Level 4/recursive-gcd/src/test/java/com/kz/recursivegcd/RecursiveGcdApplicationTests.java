package com.kz.recursivegcd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursiveGcdApplicationTests {

	@Test
	@DisplayName("a = 60 b = 48")
	void test1() {
		assertEquals(12, RecursiveGcd.recursiveGCD(60, 48));
	}

	@Test
	@DisplayName("a = 12 b = 6")
	void test2() {
		assertEquals(6, RecursiveGcd.recursiveGCD(12, 6));
	}

	@Test
	@DisplayName("a = 5325  b = 7200")
	void test3() {
		assertEquals(75, RecursiveGcd.recursiveGCD(5325, 7200));
	}

	@Test
	@DisplayName("a = 252 b = 2604")
	void test4() {
		assertEquals(84, RecursiveGcd.recursiveGCD(252, 2604));
	}

	@Test
	@DisplayName("a = 1457 b = 1833")
	void test5() {
		assertEquals(47, RecursiveGcd.recursiveGCD(1457, 1833));
	}

	@Test
	@DisplayName("a = 3075 b = 1517")
	void test6() {
		assertEquals(41, RecursiveGcd.recursiveGCD(3075, 1517));
	}

	@Test
	@DisplayName("a = 1505 b = 1995")
	void test7() {
		assertEquals(35, RecursiveGcd.recursiveGCD(1505, 1995));
	}

	@Test
	@DisplayName("a = 2280 b = 1848")
	void test8() {
		assertEquals(24, RecursiveGcd.recursiveGCD(2280, 1848));
	}

	@Test
	@DisplayName("a = 616 b = 1408")
	void test9() {
		assertEquals(88, RecursiveGcd.recursiveGCD(616, 1408));
	}

	@Test
	@DisplayName("a = 1900 b = 3800")
	void test10() {
		assertEquals(1900, RecursiveGcd.recursiveGCD(1900, 3800));
	}
}
