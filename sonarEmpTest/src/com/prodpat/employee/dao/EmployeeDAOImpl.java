package com.prodpat.employee.dao;

import java.sql.Connection;
import com.prodpat.employee.entity.EmployeeEntity;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {

	Connection con=null;
	Statement stmt=null;
	PreparedStatement pstmt=null;
	ResultSet set=null;
	
	@Override
	public void createConncetion() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Mysql driver is loaded!!");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed", "root", "root");
			System.out.println("Got the database connection");
			stmt=con.createStatement();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void closeConnection() throws SQLException {
		con.close();	
	}

	@Override
	public int insertDetails(EmployeeEntity emp) throws SQLException {
		pstmt=con.prepareStatement("insert into employee1(id,name,age,salary,designation) values(?,?,?,?,?);");
		pstmt.setInt(1,emp.getId());
		pstmt.setString(2,emp.getName());
		pstmt.setInt(3, emp.getAge());
		pstmt.setInt(4, emp.getSalary());
		pstmt.setString(5, emp.getDesignation());
		return pstmt.executeUpdate();
		
	}

	@Override
	public List<EmployeeEntity> displayAllDetails() throws SQLException {
		pstmt=con.prepareStatement("select * from employee1");
		set=pstmt.executeQuery();
		List<EmployeeEntity> list=new LinkedList<EmployeeEntity>();
		while(set.next()){
		EmployeeEntity en=new EmployeeEntity();
		en.setId(set.getInt("ID"));
		en.setName(set.getString("NAME"));
		en.setAge(set.getInt("AGE"));
		en.setSalary(set.getInt("SALARY"));
		en.setDesignation(set.getString("DESIGNATION"));
		System.out.println();
		list.add(en);
		}
		return list;
		}

	@Override
	public EmployeeEntity getById(int id) throws SQLException {
		pstmt=con.prepareStatement("select * from employee1 where id=?");
		pstmt.setInt(1, id);
		set=pstmt.executeQuery();
		set.next();
		
		EmployeeEntity entity=new EmployeeEntity();
		entity.setId(set.getInt(1));
		entity.setName(set.getString(2));
		entity.setAge(set.getInt(3));
		entity.setSalary(set.getInt(4));
		entity.setDesignation(set.getString(5));
		return entity;
	}

	@Override
	public EmployeeEntity getByName(String email) throws SQLException {
	pstmt=con.prepareStatement("select * from employee1 where name=?");
	pstmt.setString(1, email);
	set=pstmt.executeQuery();
	set.next();
	
	EmployeeEntity entity=new EmployeeEntity();
	entity.setId(set.getInt(1));
	entity.setName(set.getString(2));
	entity.setAge(set.getInt(3));
	entity.setSalary(set.getInt(4));
	entity.setDesignation(set.getString(5));
	return entity;
	}

	@Override
	public int updateDetails(EmployeeEntity emp) throws SQLException {
		pstmt=con.prepareStatement("update employee1 set age=? where id=?");
		pstmt.setInt(1, emp.getAge());
		pstmt.setInt(2, emp.getId());
		int count=pstmt.executeUpdate();
		return count;
	}

	@Override
	public int deleteEmployeeById(int id) throws SQLException{
	pstmt=con.prepareStatement("delete from employee1 where id=?");
	pstmt.setInt(1, id);
	int count=pstmt.executeUpdate();
		return count;
	}

	@Override
	public int deleteEmployeeByName(String name) throws SQLException{
		pstmt=con.prepareStatement("delete from employee1 where name=?");
		pstmt.setString(1, name);
		int count=pstmt.executeUpdate();
			return count;
	}
}
