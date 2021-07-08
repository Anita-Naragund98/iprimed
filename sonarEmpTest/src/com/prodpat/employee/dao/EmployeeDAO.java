package com.prodpat.employee.dao;

import java.sql.SQLException;
import java.util.List;
import com.prodpat.employee.entity.EmployeeEntity;

public interface EmployeeDAO {

	void createConncetion();

	void closeConnection() throws SQLException;

	int insertDetails(EmployeeEntity emp) throws SQLException;

	List<EmployeeEntity> displayAllDetails() throws SQLException;

	EmployeeEntity getById(int id) throws SQLException;

	EmployeeEntity getByName(String email) throws SQLException;

	int updateDetails(EmployeeEntity emp) throws SQLException;

	int deleteEmployeeById(int id) throws SQLException;

	int deleteEmployeeByName(String name) throws SQLException;

}
