package com.prodapt.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		Calculator cal = new Calculator();
		int x = 1234;
		int y = 5678;
		int actual = cal.add(x, y);
		int expected = 6912;
		assertEquals(expected, actual);
	}

	@Test
	void testSubstract() {
		Calculator cal = new Calculator();
		int x = 1234;
		int y = 5678;
		int actual = cal.substract(y, x);
		int expected = 4444;
		assertEquals(expected, actual);
	}

}
