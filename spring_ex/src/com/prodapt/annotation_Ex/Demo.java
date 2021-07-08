package com.prodapt.annotation_Ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Demo {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("application.xml");
		A a=(A)context.getBean("obja");
		B b=a.getB();
		System.out.println("Value of B is :"+b);
		b.m1();
	}

}
