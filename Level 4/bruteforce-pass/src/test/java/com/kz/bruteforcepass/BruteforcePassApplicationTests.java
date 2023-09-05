package com.kz.bruteforcepass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class BruteforcePassApplicationTests {

	@Test
	@DisplayName("52663")
	void test1() {
		assertEquals("568", BruteForcePass.bruteforcePass("52663"));
	}

	@Test
	@DisplayName("1661254")
	void test2() {
		assertEquals("6529", BruteForcePass.bruteforcePass("1661254"));
	}
	@Test
	@DisplayName("46941588")
	void test3() {
		assertEquals("17307", BruteForcePass.bruteforcePass("46941588"));
	}

	@Test
	@DisplayName("1691")
	void test4() {
		assertEquals("50", BruteForcePass.bruteforcePass("1691"));
	}

	@Test
	@DisplayName("53439")
	void test5() {
		assertEquals("609", BruteForcePass.bruteforcePass("53439"));
	}

	@Test
	@DisplayName("1599743")
	void test6() {
		assertEquals("4322", BruteForcePass.bruteforcePass("1599743"));
	}

	@Test
	@DisplayName("56")
	void test7() {
		assertEquals("8", BruteForcePass.bruteforcePass("56"));
	}

	@Test
	@DisplayName("1717952")
	void test8() {
		assertEquals("8228", BruteForcePass.bruteforcePass("1717952"));
	}

}
