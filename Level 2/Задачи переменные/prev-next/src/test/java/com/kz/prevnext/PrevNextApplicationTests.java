package com.kz.prevnext;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrevNextApplicationTests {

	@Test
	void test() {
		assertEquals("2021 -> 2022 -> 2023", PrevNext.prevNext(2022));
		assertEquals("99 -> 100 -> 101", PrevNext.prevNext(100));
		assertEquals("3213122 -> 3213123 -> 3213124", PrevNext.prevNext(3213123));
		assertEquals("1422122 -> 1422123 -> 1422124", PrevNext.prevNext(1422123));
		assertEquals("333332 -> 333333 -> 333334", PrevNext.prevNext(333333));
		assertEquals("2147483645 -> 2147483646 -> 2147483647", PrevNext.prevNext(2147483646));
		assertEquals("-2147483647 -> -2147483646 -> -2147483645", PrevNext.prevNext(-2147483646));
		assertEquals("-1 -> 0 -> 1", PrevNext.prevNext(0));
	}
}
