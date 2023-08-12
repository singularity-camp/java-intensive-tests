package com.kz.printevenab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class PrintEvenABApplicationTests {

	private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

	@BeforeEach
	public void setUp() {
		System.setOut(new PrintStream(outputStreamCaptor));
	}

	@Test
	@DisplayName("from 0 to 4")
	void printEvenTest1() {
		PrintEven.print(0, 4);
		assertEquals("0 2 4", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 0 to 10")
	void printEvenTest2() {
		PrintEven.print(0, 10);
		assertEquals("0 2 4 6 8 10", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 41 to 63")
	void printEvenTest3() {
		PrintEven.print(41, 63);
		assertEquals("42 44 46 48 50 52 54 56 58 60 62", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 101 to 150")
	void printEvenTest4() {
		PrintEven.print(101, 150);
		assertEquals("102 104 106 108 110 112 114 116 118 120 122 124 126 128 130 132 134 136 138 140 142 144 146 148 150", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 200 to 223")
	void printEvenTest5() {
		PrintEven.print(200, 233);
		assertEquals("200 202 204 206 208 210 212 214 216 218 220 222 224 226 228 230 232", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 505 to 510")
	void printEvenTest6() {
		PrintEven.print(505, 510);
		assertEquals("506 508 510", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 1024 to 1124")
	void printEvenTest7() {
		PrintEven.print(1024, 1124);
		assertEquals("1024 1026 1028 1030 1032 1034 1036 1038 1040 1042 1044 1046 1048 1050 1052 1054 1056 1058 1060 1062 1064 1066 1068 1070 1072 1074 1076 1078 1080 1082 1084 1086 1088 1090 1092 1094 1096 1098 1100 1102 1104 1106 1108 1110 1112 1114 1116 1118 1120 1122 1124", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 2005 to 2020")
	void printEvenTest8() {
		PrintEven.print(2005, 2020);
		assertEquals("2006 2008 2010 2012 2014 2016 2018 2020", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 2345 to 2500")
	void printEvenTes9() {
		PrintEven.print(2345, 2500);
		assertEquals("2346 2348 2350 2352 2354 2356 2358 2360 2362 2364 2366 2368 2370 2372 2374 2376 2378 2380 2382 2384 2386 2388 2390 2392 2394 2396 2398 2400 2402 2404 2406 2408 2410 2412 2414 2416 2418 2420 2422 2424 2426 2428 2430 2432 2434 2436 2438 2440 2442 2444 2446 2448 2450 2452 2454 2456 2458 2460 2462 2464 2466 2468 2470 2472 2474 2476 2478 2480 2482 2484 2486 2488 2490 2492 2494 2496 2498 2500", outputStreamCaptor.toString().trim());
	}

	@Test
	@DisplayName("from 1 to 1")
	void printEvenTest10() {
		PrintEven.print(1, 1);
		assertEquals("", outputStreamCaptor.toString().trim());
	}
}
