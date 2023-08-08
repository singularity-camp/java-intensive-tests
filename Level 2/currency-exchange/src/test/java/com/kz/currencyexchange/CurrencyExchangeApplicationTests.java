package com.kz.currencyexchange;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CurrencyExchangeApplicationTests {

	@Test
	void test() {
		assertEquals(430, CurrencyExchange.calculateExchange(1, 430));
		assertEquals(1560, CurrencyExchange.calculateExchange(12, 130));
		assertEquals(188500, CurrencyExchange.calculateExchange(130, 1450));
		assertEquals(2611290, CurrencyExchange.calculateExchange(1230, 2123));
		assertEquals(491400, CurrencyExchange.calculateExchange(210, 2340));
		assertEquals(2147000000, CurrencyExchange.calculateExchange(1000000, 2147));
		assertEquals(904656, CurrencyExchange.calculateExchange(752, 1203));
	}
}
