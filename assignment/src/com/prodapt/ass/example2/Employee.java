package com.prodapt.ass.example2;

public class Employee {
	private String empId;
	private String emp_name;
	private int emp_salary;
	private String emp_department;

	public Employee(String empId, String emp_name, int emp_salary, String emp_department) {
		super();
		this.empId = empId;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
		this.emp_department = emp_department;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	public String getEmp_department() {
		return emp_department;
	}

	public void setEmp_department(String emp_department) {
		this.emp_department = emp_department;
	}
}