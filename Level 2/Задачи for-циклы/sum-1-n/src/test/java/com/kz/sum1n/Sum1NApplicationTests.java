package com.kz.sum1n;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class Sum1NApplicationTests {

	@Test
	void test() {
		assertEquals(15, Sum1ToN.sum1n(5));
		assertEquals(1, Sum1ToN.sum1n(1));
		assertEquals(3, Sum1ToN.sum1n(2));
		assertEquals(21, Sum1ToN.sum1n(6));
		assertEquals(55, Sum1ToN.sum1n(10));
		assertEquals(5356, Sum1ToN.sum1n(103));
		assertEquals(46665, Sum1ToN.sum1n(305));
		assertEquals(50055015, Sum1ToN.sum1n(10005));
		assertEquals(2147450880, Sum1ToN.sum1n(65535));
	}
}
