package com.prodapt;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmployeeTesting {

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
	void test() {
		Employee emp = new Programmer(1, "Anita", 24);
		String actual = emp.create();
		String expected = "created";
		assertEquals(expected, actual);
	}

	@Test
	void raiseSal() throws Exception {
		Employee emp = new Programmer(1, "Anu", 25);
		emp.create();
		int actual = emp.raiseSalary();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void clerkTest() throws Exception {
		Employee emp = new Clerk(1, "Anu", 25);
		String actual = emp.create();
		String expected = "created";
		assertEquals(expected, actual);
	}

	@Test
	void raiseTestOfClerk() throws Exception {
		Employee emp = new Clerk(1, "Anu", 25);
		emp.create();
		int actual = emp.raiseSalary();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void raiseTestOfManager() throws Exception {
		Employee emp = new Manager(1, "Anu", 25);
		emp.create();
		int actual = emp.raiseSalary();
		int expected = 1;
		assertEquals(expected, actual);
	}

	@Test
	void managerTest() throws Exception {
		Employee emp = new Manager(1, "Anu", 25);
		String actual = emp.create();
		String expected = "created";
		assertEquals(expected, actual);
	}

}
