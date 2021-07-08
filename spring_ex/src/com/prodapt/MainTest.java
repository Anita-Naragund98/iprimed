package com.prodapt;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.Vector;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.prodapt.config.AppConfig;
import com.prodapt.service.DepartmentService;
import com.prodapt.service.EmployeeService;

public class MainTest {
	public static void main(String[] args) throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeService empService=context.getBean("myEmployeeService",EmployeeService.class);
		DepartmentService deptService=context.getBean("myDepartmentService",DepartmentService.class);
		
		System.out.println("Employee service :"+empService);
		System.out.println("DAO in Employee service :"+empService.getEmployeeDAO());
		
		System.out.println("Department service :"+deptService);
		System.out.println("DAO in Department service :"+deptService.getEmployeeDAO());
		
		Field f=ClassLoader.class.getDeclaredField("classes");
		f.setAccessible(true);
		Vector<Class> classes=(Vector<Class>)f.get(context.getClassLoader());
		for(Iterator iterator=classes.iterator();iterator.hasNext();) {
			Class class1=(Class)iterator.next();
			if(class1.getName().contains("com.prodapt"))
				System.out.println("=>"+class1.getName());
		}
		context.close();
	}

}
