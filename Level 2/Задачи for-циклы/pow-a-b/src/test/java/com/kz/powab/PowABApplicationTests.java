package com.kz.powab;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PowABApplicationTests {

	@Test
	void test() {
		assertEquals(64, PowAB.pow(2, 6));
		assertEquals(531441, PowAB.pow(3, 12));
		assertEquals(441, PowAB.pow(21, 2));
		assertEquals(65536, PowAB.pow(2, 16));
		assertEquals(1048576, PowAB.pow(4, 10));
		assertEquals(59049, PowAB.pow(9, 5));
		assertEquals(7298373, PowAB.pow(45, 7));
		assertEquals(965185256, PowAB.pow(2122, 3));
		assertEquals(1728, PowAB.pow(12, 3));
		assertEquals(1, PowAB.pow(1, 1000000));
	}
}
