package com.iprimed.service;

import java.sql.SQLException;
import java.util.List;
import com.iprimed.dao.StaffDAO;
import com.iprimed.dao.StaffDAOImpl;
import com.iprimed.dto.StaffInfoEntity;

public class StaffServiceImpl implements StaffService {

	StaffDAO dao = new StaffDAOImpl();

	@Override
	public void insertDetails(StaffInfoEntity staff) throws SQLException {
		dao.createConnection();
		int a = dao.insertDetails(staff);
		if (a > 0) {
			System.out.println("Your value has been successfully inserted...");
		} else {
			System.out.println("Values have not been inserted");
		}
		dao.closeConnection();
	}

	@Override
	public void displayAllDetails() throws SQLException {
		dao.createConnection();
		List<StaffInfoEntity> displayAllDetails = dao.displayAllDetails();
		System.out.println(displayAllDetails);
		dao.closeConnection();
	}

	@Override
	public StaffInfoEntity getById(int sid) throws SQLException {
		dao.createConnection();
		StaffInfoEntity entity = dao.getById(sid);
		System.out.println(entity);
		dao.closeConnection();
		return entity;
	}

	@Override
	public StaffInfoEntity getByName(String name) throws SQLException {
		dao.createConnection();
		StaffInfoEntity staffInfo = dao.getByName(name);
		System.out.println(staffInfo);
		dao.closeConnection();
		return staffInfo;
	}

	@Override
	public StaffInfoEntity getByEmail(String email) throws SQLException {
		dao.createConnection();
		StaffInfoEntity staff = dao.getByEmail(email);
		System.out.println(staff);
		dao.closeConnection();
		return staff;
	}

	@Override
	public int updateDetails(StaffInfoEntity staff) throws SQLException {
		dao.createConnection();
		int updateDetails = dao.updateDetails(staff);
		dao.closeConnection();
		return updateDetails;
	}

	@Override
	public int updateAddressAndDept(StaffInfoEntity staff) throws SQLException {
		dao.createConnection();
		int count = dao.updateAddressAndDept(staff);
		return count;
	}

	@Override
	public int deleteStaffById(int id) throws SQLException {
		dao.createConnection();
		int count = dao.deleteStaffById(id);
		dao.closeConnection();
		return count;
	}

	@Override
	public int deleteStaffByName(String name) throws SQLException {
		dao.createConnection();
		int staff = dao.deleteStaffByName(name);
		dao.closeConnection();
		return staff;
	}

}
