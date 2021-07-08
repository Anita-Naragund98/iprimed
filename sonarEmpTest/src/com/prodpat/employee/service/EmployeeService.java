package com.prodpat.employee.service;

import java.sql.SQLException;
import com.prodpat.employee.entity.*;

public interface EmployeeService {
	
	public void create(EmployeeEntity en) throws SQLException;
	
	void getAllEmpDetails() throws SQLException;

	EmployeeEntity getEmployeeById(int id) throws SQLException;

	void getEmployeeByName(String email) throws SQLException;

	int updateEmployeeDetails(EmployeeEntity emp) throws SQLException;

	int deleteEmployeeById(int id) throws SQLException;

	int deleteEmployeeByName(String name) throws SQLException;


}
