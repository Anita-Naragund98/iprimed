package com.prodapt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class EmployeeJdbcConnection {

	Scanner scan = new Scanner(System.in);
	Services service=new Services();
	private Connection con;
	private Statement st;

	EmployeeJdbcConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
			st = con.createStatement();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	EmployeeJdbcConnection(int id,String n, int a, String job, int sal) {
		this();
		try {
			st.executeUpdate("insert into employee(id,name, age, job, sal) values('"+id+"," + n + "'," + a + ",'" + job + "',"+ sal + ");");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	EmployeeJdbcConnection(int sal) {
		this();
		new Services(con, st);
	}

	public void display() {
		new EmployeeJdbcConnection();
		service.display(con, st);
	}

	public void displayByDesignation() {
		new EmployeeJdbcConnection();
		System.out.println("Select the Designation \n1.Manager \n2.Programmer \n3.Clerk");
		int desig = scan.nextInt();
		service.displayByDesignation(con, st, desig);

	}

	public void raiseById() {
		new EmployeeJdbcConnection();
		System.out.println("Enter the ID to raise salary");
		int id = scan.nextInt();
		service.raiseByID(id, st, con);

	}

	public void deleteEmployee() {
		new EmployeeJdbcConnection();
		System.out.println("Enter the ID to delete record of Employee");
		int id = scan.nextInt();
		service.deleteById(st, con, id);

	}
}
