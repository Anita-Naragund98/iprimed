package com.prodapt.annotation_Ex;
import javax.inject.Inject;

public class C {
	
	@Inject
private B b;
	
	public C() {
		System.out.println("Inside default constructor of A");
	}
	
	public C(B b) {
		System.out.println("Inside parameterised constructor of A");
		this.b=b;
	}

	public B getB() {
		return b;
	}

	public void setB(B b) {
		this.b = b;
	}
	
	 public void fun(B b) {
		 System.out.println("Inside attribute fun() methof of A");
		 this.b=b;
	 }

}
