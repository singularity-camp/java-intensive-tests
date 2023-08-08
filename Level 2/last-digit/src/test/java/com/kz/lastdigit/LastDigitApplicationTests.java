package com.kz.lastdigit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class LastDigitApplicationTests {

	@Test
	void test() {
		assertEquals(8, LastDigit.last(78));
		assertEquals(0, LastDigit.last(100));
		assertEquals(5, LastDigit.last(25));
		assertEquals(3, LastDigit.last(123));
		assertEquals(5, LastDigit.last(4555));
		assertEquals(7, LastDigit.last(127));
		assertEquals(6, LastDigit.last(1336));
		assertEquals(1, LastDigit.last(1321));
		assertEquals(2, LastDigit.last(1272));
	}
}
