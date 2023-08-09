package com.kz.countleapyear;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CountLeapYearApplicationTests {

	@Test
	void test() {
		assertEquals(1, CountLeapYear.count(4));
		assertEquals(24, CountLeapYear.count(100));
		assertEquals(2987, CountLeapYear.count(12321));
		assertEquals(2425, CountLeapYear.count(10002));
		assertEquals(2993827, CountLeapYear.count(12345678));
		assertEquals(18166232, CountLeapYear.count(74912302));
		assertEquals(24250000, CountLeapYear.count(100000000));
		assertEquals(301772873, CountLeapYear.count(1244424222));
		assertEquals(0, CountLeapYear.count(1));
	}

}
