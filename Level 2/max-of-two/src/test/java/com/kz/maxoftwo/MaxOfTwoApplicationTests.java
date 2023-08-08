package com.kz.maxoftwo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaxOfTwoApplicationTests {

	@Test
	void test() {
		assertEquals(42, MaxOfTwo.max(42, 1));
		assertEquals(43, MaxOfTwo.max(42, 43));
		assertEquals(7, MaxOfTwo.max(2, 7));
		assertEquals(100000, MaxOfTwo.max(42, 100000));
		assertEquals(21, MaxOfTwo.max(21, 20));
		assertEquals(21, MaxOfTwo.max(21, 21));
		assertEquals(139, MaxOfTwo.max(139, 130));
		assertEquals(4729271, MaxOfTwo.max(4729271, 36271));
		assertEquals(21257, MaxOfTwo.max(500, 21257));
	}
}
