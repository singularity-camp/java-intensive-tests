package com.kz.sqrsum1n;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class SqrSum1NApplicationTests {

	@Test
	void test() {
		assertEquals(14, SqrSum1N.sqrSum(3));
		assertEquals(55, SqrSum1N.sqrSum(5));
		assertEquals(385, SqrSum1N.sqrSum(10));
		assertEquals(2870, SqrSum1N.sqrSum(20));
		assertEquals(338350, SqrSum1N.sqrSum(100));
		assertEquals(41791750, SqrSum1N.sqrSum(500));
		assertEquals(333833500, SqrSum1N.sqrSum(1000));
		assertEquals(1126125250, SqrSum1N.sqrSum(1500));
		assertEquals(2146682110, SqrSum1N.sqrSum(1860));
		assertEquals(1, SqrSum1N.sqrSum(1));
	}
}
