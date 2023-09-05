package com.kz.hanoitower;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class HanoiTowerApplicationTests {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	private boolean isNotLineBreak(char x) {
		return (int)(x) != 13 && (int)(x) != 10;
	}

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	@DisplayName("n = 1")
	void test1() {
		HanoiTower.hanoiTower(1);
		assertEquals("Диск 1 с башни 1 переложить в башню 3", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("n = 5")
	void test2() throws Exception {
		HanoiTower.hanoiTower(5);
		String expected = "Диск 1 с башни 1 переложить в башню 3\n" +
				"Диск 2 с башни 1 переложить в башню 2\n" +
				"Диск 1 с башни 3 переложить в башню 2\n" +
				"Диск 3 с башни 1 переложить в башню 3\n" +
				"Диск 1 с башни 2 переложить в башню 1\n" +
				"Диск 2 с башни 2 переложить в башню 3\n" +
				"Диск 1 с башни 1 переложить в башню 3\n" +
				"Диск 4 с башни 1 переложить в башню 2\n" +
				"Диск 1 с башни 3 переложить в башню 2\n" +
				"Диск 2 с башни 3 переложить в башню 1\n" +
				"Диск 1 с башни 2 переложить в башню 1\n" +
				"Диск 3 с башни 3 переложить в башню 2\n" +
				"Диск 1 с башни 1 переложить в башню 3\n" +
				"Диск 2 с башни 1 переложить в башню 2\n" +
				"Диск 1 с башни 3 переложить в башню 2\n" +
				"Диск 5 с башни 1 переложить в башню 3\n" +
				"Диск 1 с башни 2 переложить в башню 1\n" +
				"Диск 2 с башни 2 переложить в башню 3\n" +
				"Диск 1 с башни 1 переложить в башню 3\n" +
				"Диск 3 с башни 2 переложить в башню 1\n" +
				"Диск 1 с башни 3 переложить в башню 2\n" +
				"Диск 2 с башни 3 переложить в башню 1\n" +
				"Диск 1 с башни 2 переложить в башню 1\n" +
				"Диск 4 с башни 2 переложить в башню 3\n" +
				"Диск 1 с башни 1 переложить в башню 3\n" +
				"Диск 2 с башни 1 переложить в башню 2\n" +
				"Диск 1 с башни 3 переложить в башню 2\n" +
				"Диск 3 с башни 1 переложить в башню 3\n" +
				"Диск 1 с башни 2 переложить в башню 1\n" +
				"Диск 2 с башни 2 переложить в башню 3\n" +
				"Диск 1 с башни 1 переложить в башню 3";
		String result =  outputStreamCaptor.toString().trim();
		if (expected.length() != result.length()) {
			throw new Exception("Their length are not the same! " + expected.length() + " " + result.length() + "\n" + result);
		}
		for (int i = 0; i < result.length(); ++i) {
			if (isNotLineBreak(expected.charAt(i)) && isNotLineBreak(result.charAt(i)) && expected.charAt(i) != result.charAt(i)) {
				throw new Exception("expected: " + expected.charAt(i) + " but got result: " + result.charAt(i) + " at position: " + i);
			}
		}
	}
}
