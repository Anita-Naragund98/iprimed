package com.prodapt;

public class Employee {

	int id;
	String name;
	int age;
	String job;
	int sal;

	Employee() {

	}

	Employee(int id, String name, int age, String job, int salary) {
		id = id;
		name = name;
		age = age;
		job = job;
		sal = salary;
	}

	public String create() {
		new EmployeeJdbcConnection(id, name, age, job, sal);
		return name;
	}

	public int raiseSalary() {
		new EmployeeJdbcConnection(sal);
		return sal;
	}

}
