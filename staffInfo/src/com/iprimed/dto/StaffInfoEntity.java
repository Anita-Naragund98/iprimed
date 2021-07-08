package com.iprimed.dto;

import com.iprimed.constants.Department;

public class StaffInfoEntity {

	private int sid;
	private String name;
	private String email;
	private double salary;
	private int age;
	private String gender;
	private String address;
	private String department;
	private String subjectTaken;

	public StaffInfoEntity() {
		System.out.println("Created StaffInfoEntity");
	}

	public StaffInfoEntity(int sid, String name, String email,double salary, int age, String gender, String address,
			String department, String subjectTaken) {
		super();
		this.sid = sid;
		this.name = name;
		this.email=email;
		this.salary = salary;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.department = department;
		this.subjectTaken = subjectTaken;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String string) {
		this.department = string;
	}

	public String getSubjectTaken() {
		return subjectTaken;
	}

	public void setSubjectTaken(String subjectTaken) {
		this.subjectTaken = subjectTaken;
	}

	@Override
	public String toString() {
		return "StaffInfoEntity [sid=" + sid + ", name=" + name + ", email=" + email + ", salary=" + salary + ", age="
				+ age + ", gender=" + gender + ", address=" + address + ", department=" + department + ", subjectTaken="
				+ subjectTaken + "]";
	}

}
