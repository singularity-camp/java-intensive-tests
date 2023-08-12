package com.kz.intcmp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IntCmpApplicationTests {
	@Test
	void test() {
		assertEquals(1, IntCmp.cmp(1, 0));
		assertEquals(0, IntCmp.cmp(100, 100));
		assertEquals(-1, IntCmp.cmp(0, 1));
		assertEquals(1, IntCmp.cmp(1, 0));
		assertEquals(-1, IntCmp.cmp(-5, 0));
		assertEquals(1, IntCmp.cmp(-2, -10));
		assertEquals(0, IntCmp.cmp(-3, -3));
	}
}
