package com.kz.recursivereverseprint;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class RecursiveReversePrintApplicationTests {

	private final PrintStream standardOut = System.out;
	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@AfterEach
	public void tearDown() {
		System.setOut(standardOut);
	}

	@Test
	@DisplayName("hello")
	void test1() {
		char[] str = "hello".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("olleh", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("string")
	void test2() {
		char[] str = "string".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("gnirts", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("stepik")
	void test3() {
		char[] str = "stepik".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("kipets", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("class")
	void test4() {
		char[] str = "class".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("ssalc", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("java")
	void test5() {
		char[] str = "java".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("avaj", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("object")
	void test6() {
		char[] str = "object".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("tcejbo", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("byte")
	void test7() {
		char[] str = "byte".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("etyb", outputStreamCaptor.toString()
				.trim());
	}
	@Test
	@DisplayName("network")
	void test8() {
		char[] str = "network".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("krowten", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("linux")
	void test9() {
		char[] str = "linux".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("xunil", outputStreamCaptor.toString()
				.trim());
	}

	@Test
	@DisplayName("http")
	void test10() {
		char[] str = "http".toCharArray();
		RecursiveReversePrint.recursiveReversePrint(str, str.length);
		assertEquals("ptth", outputStreamCaptor.toString()
				.trim());
	}
}
