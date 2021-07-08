package com.prodapt.service;

import javax.annotation.PreDestroy;

import com.prodapt.dao.EmployeeDAO;

public class EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public EmployeeDAO getEmployeeDAO() {
		return employeeDAO;
	}

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}
	
	@PreDestroy
	public void destroyMethod() {
		System.out.println("Employee destroyMethod()");
	}

}
