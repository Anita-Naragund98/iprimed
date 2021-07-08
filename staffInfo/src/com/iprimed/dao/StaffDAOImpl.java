package com.iprimed.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;
import com.iprimed.dto.StaffInfoEntity;

public class StaffDAOImpl implements StaffDAO {
	private StaffInfoEntity entity;
	Connection con = null;
	Statement stmt = null;
	PreparedStatement pstmt = null;
	ResultSet set = null;

	public StaffDAOImpl() {
	}

	@Override
	public void createConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mysql driver is loaded!!");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed", "root", "root");
			System.out.println("Got the database connection");
			stmt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeConnection() throws SQLException {
		con.close();
	}

	@Override
	public int insertDetails(StaffInfoEntity staff) throws SQLException {
		pstmt = con.prepareStatement(
				"insert into staff(sid,name,email,salary,age,gender,address,department,subject_taken) values(?,?,?,?,?,?,?,?,?);");
		pstmt.setInt(1, staff.getSid());
		pstmt.setString(2, staff.getName());
		pstmt.setString(3, staff.getEmail());
		pstmt.setDouble(4, staff.getSalary());
		pstmt.setInt(5, staff.getAge());
		pstmt.setString(6, staff.getGender());
		pstmt.setString(7, staff.getAddress());
		pstmt.setString(8, staff.getDepartment());// Here Department is Enum Type
		pstmt.setString(9, staff.getSubjectTaken());
		return pstmt.executeUpdate();
	}

	@Override
	public List<StaffInfoEntity> displayAllDetails() throws SQLException {
		pstmt = con.prepareStatement("select * from staff");
		int i = 0;
		set = pstmt.executeQuery();
		List<StaffInfoEntity> list = new LinkedList<StaffInfoEntity>();
		while (set.next()) {
			StaffInfoEntity staff = new StaffInfoEntity();
			staff.setSid(set.getInt("SID"));
			staff.setName(set.getString("NAME"));
			staff.setEmail(set.getString("EMAIL"));
			staff.setSalary(set.getInt("SALARY"));
			staff.setAge(set.getInt("AGE"));
			staff.setGender(set.getString("GENDER"));
			staff.setAddress(set.getString("ADDRESS"));
			staff.setDepartment(set.getString("DEPARTMENT").toString());
			staff.setSubjectTaken(set.getString("SUBJECT_TAKEN"));
			System.out.println();
			list.add(staff);
		}
		return list;
	}

	@Override
	public StaffInfoEntity getById(int sid) throws SQLException {
		pstmt = con.prepareStatement("select * from staff where sid=?");
		pstmt.setInt(1, sid);
		set = pstmt.executeQuery();
		set.next();

		StaffInfoEntity entity = new StaffInfoEntity();
		entity.setSid(set.getInt("SID"));
		entity.setName(set.getString("NAME"));
		entity.setEmail(set.getString("EMAIL"));
		entity.setSalary(set.getInt("SALARY"));
		entity.setAge(set.getInt("AGE"));
		entity.setGender(set.getString("GENDER"));
		entity.setAddress(set.getString("ADDRESS"));
		entity.setDepartment(set.getString("DEPARTMENT").toString());
		entity.setSubjectTaken(set.getString("SUBJECT_TAKEN"));
		return entity;
	}

	@Override
	public StaffInfoEntity getByName(String name) throws SQLException {
		pstmt = con.prepareStatement("select * from staff where name=?");
		pstmt.setString(1, name);
		set = pstmt.executeQuery();
		set.next();

		StaffInfoEntity staffInfo = new StaffInfoEntity();
		staffInfo.setSid(set.getInt("SID"));
		staffInfo.setName(set.getString("NAME"));
		staffInfo.setEmail(set.getString("EMAIL"));
		staffInfo.setSalary(set.getInt("SALARY"));
		staffInfo.setAge(set.getInt("AGE"));
		staffInfo.setGender(set.getString("GENDER"));
		staffInfo.setAddress(set.getString("ADDRESS"));
		staffInfo.setDepartment(set.getString("DEPARTMENT").toString());
		staffInfo.setSubjectTaken(set.getString("SUBJECT_TAKEN"));
		return staffInfo;

	}

	@Override
	public StaffInfoEntity getByEmail(String email) throws SQLException {
		pstmt = con.prepareStatement("select * from staff where email=?");
		pstmt.setString(1, email);
		set = pstmt.executeQuery();
		set.next();

		StaffInfoEntity stf = new StaffInfoEntity();
		stf.setSid(set.getInt("SID"));
		stf.setName(set.getString("NAME"));
		stf.setEmail(set.getString("EMAIL"));
		stf.setSalary(set.getInt("SALARY"));
		stf.setAge(set.getInt("AGE"));
		stf.setGender(set.getString("GENDER"));
		stf.setAddress(set.getString("ADDRESS"));
		stf.setDepartment(set.getString("DEPARTMENT").toString());
		stf.setSubjectTaken(set.getString("SUBJECT_TAKEN"));
		return stf;
	}

	@Override
	public int updateDetails(StaffInfoEntity staff) throws SQLException {
		pstmt = con.prepareStatement("update staff set salary=? and subject_taken=? where sid=?");
		pstmt.setDouble(1, entity.getSalary());
		pstmt.setString(2, entity.getSubjectTaken());
		pstmt.setInt(3, entity.getSid());
		int count = pstmt.executeUpdate();
		return count;
	}

	@Override
	public int updateAddressAndDept(StaffInfoEntity staff) throws SQLException {
		pstmt = con.prepareStatement("update staff set address=? and age=? where sid=?");
		pstmt.setString(1, entity.getAddress());
		pstmt.setInt(2, entity.getAge());
		pstmt.setInt(3, entity.getSid());
		int count = pstmt.executeUpdate();
		return count;
	}

	@Override
	public int deleteStaffById(int id) throws SQLException {
		pstmt = con.prepareStatement("delete from staff where sid=?");
		pstmt.setInt(1, id);
		int count = pstmt.executeUpdate();
		return count;
	}

	@Override
	public int deleteStaffByName(String name) throws SQLException {
		pstmt = con.prepareStatement("delete from staff where name=?");
		pstmt.setString(1, name);
		int count = pstmt.executeUpdate();
		return count;
	}

}
