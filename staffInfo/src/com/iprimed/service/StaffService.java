package com.iprimed.service;

import java.sql.SQLException;
import java.util.List;

import com.iprimed.dto.StaffInfoEntity;

public interface StaffService {

	void insertDetails(StaffInfoEntity staff) throws SQLException;

	void displayAllDetails() throws SQLException;

	StaffInfoEntity getById(int sid) throws SQLException;

	StaffInfoEntity getByName(String name) throws SQLException;

	StaffInfoEntity getByEmail(String email) throws SQLException;

	int updateDetails(StaffInfoEntity staff) throws SQLException;

	int updateAddressAndDept(StaffInfoEntity staff) throws SQLException;

	int deleteStaffById(int id) throws SQLException;

	int deleteStaffByName(String name) throws SQLException;

}
