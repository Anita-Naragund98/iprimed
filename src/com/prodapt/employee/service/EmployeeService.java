package com.prodapt.employee.service;

import java.sql.SQLException;

import com.prodapt.employee.entity.EmployeeEntity;

public interface EmployeeService {
	
	public void create(EmployeeEntity en) throws SQLException;
	
	void getAllEmpDetails() throws SQLException;

	EmployeeEntity getEmployeeById(int id) throws SQLException;

	void getEmployeeByEmail(String email) throws SQLException;

	int updateEmployeeDetails(EmployeeEntity emp) throws SQLException;

	int deleteEmployeeById(int id) throws SQLException;

	int deleteEmployeeByName(String name) throws SQLException;


}
