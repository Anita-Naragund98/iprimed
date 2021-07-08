package com.iprimed.dao;

import java.sql.SQLException;
import java.util.List;
import com.iprimed.dto.StaffInfoEntity;

public interface StaffDAO {
	
	void createConnection();
	
	void closeConnection() throws SQLException;

	int insertDetails(StaffInfoEntity staff) throws SQLException;

	List<StaffInfoEntity> displayAllDetails() throws SQLException;

	StaffInfoEntity getById(int sid) throws SQLException;

	StaffInfoEntity getByName(String name) throws SQLException;

	StaffInfoEntity getByEmail(String email) throws SQLException;

	int updateDetails(StaffInfoEntity staff) throws SQLException;
	
	int updateAddressAndDept(StaffInfoEntity staff) throws SQLException;

	int deleteStaffById(int id) throws SQLException;

	int deleteStaffByName(String name) throws SQLException;
	

}
