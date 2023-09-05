package com.kz.iterisprime;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class IterIsPrimeApplicationTests {

	@Test
	@DisplayName("n = 2")
	void test1() {
		assertTrue(IterIsPrime.iterIsPrime(2));
	}

	@Test
	@DisplayName("n = 961")
	void test2() {
		assertFalse(IterIsPrime.iterIsPrime(961));
	}

	@Test
	@DisplayName("n = 723")
	void test3() {
		assertFalse(IterIsPrime.iterIsPrime(723));
	}

	@Test
	@DisplayName("n = 280")
	void test4() {
		assertFalse(IterIsPrime.iterIsPrime(280));
	}

	@Test
	@DisplayName("n = 516")
	void test5() {
		assertFalse(IterIsPrime.iterIsPrime(516));
	}

	@Test
	@DisplayName("n = 488")
	void test6() {
		assertFalse(IterIsPrime.iterIsPrime(488));
	}

	@Test
	@DisplayName("n = 293")
	void test7() {
		assertTrue(IterIsPrime.iterIsPrime(293));
	}

	@Test
	@DisplayName("n = 829")
	void test8() {
		assertTrue(IterIsPrime.iterIsPrime(829));
	}

	@Test
	@DisplayName("n = 397")
	void test9() {
		assertTrue(IterIsPrime.iterIsPrime(397));
	}

	@Test
	@DisplayName("n = 641")
	void test10() {
		assertTrue(IterIsPrime.iterIsPrime(641));
	}

	@Test
	@DisplayName("n = 127")
	void test11() {
		assertTrue(IterIsPrime.iterIsPrime(127));
	}
}
