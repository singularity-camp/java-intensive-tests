package com.kz.doubleprecision;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DoublePrecisionApplicationTests {

	@Test
	void test() {
		assertTrue(DoublePrecision.doublePrecision(1.0, 2.0, 3.0));
		assertTrue(DoublePrecision.doublePrecision(0.1, 0.2, 0.3));
		assertTrue(DoublePrecision.doublePrecision(10.5, 20.1, 30.6));
		assertTrue(DoublePrecision.doublePrecision(0.00001, 0.00002, 0.00003));
		assertFalse(DoublePrecision.doublePrecision(1.0, 2.0, 3.1));
		assertFalse(DoublePrecision.doublePrecision(0.1, 0.2, 0.32));
		assertFalse(DoublePrecision.doublePrecision(10.5, 20.0, 30.7));
		assertFalse(DoublePrecision.doublePrecision(0.00001, 0.00002, 0.00004));
	}
}
