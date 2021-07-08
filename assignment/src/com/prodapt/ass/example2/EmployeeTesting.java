package com.prodapt.ass.example2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeTesting {

	public static void main(String[] args) {

		Employee firstEmployee = new Employee("1PR", "Anita", 29999, "IT");
		Employee secondEmployee = new Employee("20QR", "Sunita", 12000, "Account");
		Employee thirdEmployee = new Employee("92RG", "Trupti", 25000, "Designer");
		List<Employee> employees = Arrays.asList(firstEmployee, secondEmployee, thirdEmployee);

		int total = employees.stream().collect(Collectors.summingInt(Employee::getEmp_salary));
		System.out.println("Total salary of all the employees are : " + total);
	}

}
