package com.prodapt.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prodapt.bpp.SomeBpp;
import com.prodapt.dao.EmployeeDAO;
import com.prodapt.dao.jpa.JpaEmployeeDAO;
import com.prodapt.service.DepartmentService;
import com.prodapt.service.EmployeeService;

@Configuration
@ComponentScan("com.prodapt")
public class AppConfig {
	
	@Bean
	public EmployeeService myEmployeeService() {
		EmployeeService service=new EmployeeService();
		service.setEmployeeDAO(myJpaEmployeeDAO());
		return service;
		}
	
	@Bean
	public DepartmentService myDepartmentService() {
		DepartmentService service=new DepartmentService();
		service.setEmployeeDAO(myJpaEmployeeDAO());
		return service;
		}
	
	public EmployeeDAO myJpaEmployeeDAO() {
		return new JpaEmployeeDAO();
	}
	
	
	public SomeBpp mySomeBpp() {
		return new SomeBpp();
	}

}
