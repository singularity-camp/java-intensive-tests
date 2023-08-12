package com.kz.divmod;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DivModApplicationTests {

	@Test
	void test() {
		assertEquals("2 1", DivMod.divAndMod(5, 2));
		assertEquals("1 3", DivMod.divAndMod(8, 5));
		assertEquals("5 18", DivMod.divAndMod(123, 21));
		assertEquals("1666 2", DivMod.divAndMod(5000, 3));
		assertEquals("5 171", DivMod.divAndMod(1231, 212));
		assertEquals("3 1", DivMod.divAndMod(10000, 3333));
		assertEquals("1 0", DivMod.divAndMod(55, 55));
	}
}
