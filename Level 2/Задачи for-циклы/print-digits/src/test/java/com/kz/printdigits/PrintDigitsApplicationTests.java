package com.kz.printdigits;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrintDigitsApplicationTests {
	private final ByteArrayOutputStream output = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(output));
	}

	@Test
	void test() {
		PrintDigits.print();
		assertEquals("0123456789", output.toString().trim());
	}
}
