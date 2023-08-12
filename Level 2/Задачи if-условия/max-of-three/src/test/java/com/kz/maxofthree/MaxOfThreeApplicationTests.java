package com.kz.maxofthree;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MaxOfThreeApplicationTests {

	@Test
	void test() {
		assertEquals(42, MaxOfThree.max(42, 1, 0));
		assertEquals(10, MaxOfThree.max(5, 10, 3));
		assertEquals(0, MaxOfThree.max(-2, 0, -5));
		assertEquals(100, MaxOfThree.max(100, 100, 100));
		assertEquals(0, MaxOfThree.max(0, -10, -7));
		assertEquals(15, MaxOfThree.max(15, 10, 15));
		assertEquals(8, MaxOfThree.max(8, 8, 8));
		assertEquals(-30, MaxOfThree.max(-50, -30, -80));
		assertEquals(2, MaxOfThree.max(2, 2, 2));
		assertEquals(22, MaxOfThree.max(17, 22, 15));
		assertEquals(0, MaxOfThree.max(0, 0, 0));
	}
}
