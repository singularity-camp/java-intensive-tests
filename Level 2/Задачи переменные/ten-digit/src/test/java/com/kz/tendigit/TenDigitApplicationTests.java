package com.kz.tendigit;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TenDigitApplicationTests {

	@Test
	void test() {
		assertEquals(7, TenDigit.ten(678));
		assertEquals(2, TenDigit.ten(123));
		assertEquals(2, TenDigit.ten(1232123));
		assertEquals(6, TenDigit.ten(32168));
		assertEquals(1, TenDigit.ten(2213));
		assertEquals(0, TenDigit.ten(97305));
		assertEquals(3, TenDigit.ten(67832));
		assertEquals(4, TenDigit.ten(32145));
		assertEquals(5, TenDigit.ten(122356));
		assertEquals(8, TenDigit.ten(687));
		assertEquals(9, TenDigit.ten(111198));
	}
}
