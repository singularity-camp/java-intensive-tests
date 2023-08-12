package com.kz.swapbits;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SwapBitsApplicationTests {

	@Test
	void test() {
		assertEquals(240, SwapBits.swap(15));
		assertEquals(65, SwapBits.swap(20));
		assertEquals(255, SwapBits.swap(255));
		assertEquals(15, SwapBits.swap(240));
		assertEquals(225, SwapBits.swap(30));
		assertEquals(19, SwapBits.swap(49));
		assertEquals(140, SwapBits.swap(200));
		assertEquals(0, SwapBits.swap(0));
		assertEquals(82, SwapBits.swap(37));
	}

}
